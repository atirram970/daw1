package unidad6.edificio_corregido;

import java.util.Date;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;
// CREAR LA CLASE COMO NEW > JUNIT TEST CASE
public class TestEdificio {

	@Test
	public void testCreacionEdificio() {
		System.out.println("test1");
		Edificio ed = null;
		Assert.assertNull(ed);
		ed = new Edificio();
		Assert.assertNotNull(ed);
	}
	
	@Test
	public void testRegistrarVip() {
		System.out.println("test2");
		Edificio ed = new Edificio();
		boolean encontrado= false;
		Persona personaVip = new Persona("John", "Doe", "00000000T");
		Iterator<Persona> itPersona = ed.getListaZonaPrivada().iterator();
		while (itPersona.hasNext() && !encontrado) {
			if (personaVip.equals(itPersona.next())) {
				encontrado= true;
			}
		}
		Assert.assertFalse(encontrado);
		Assert.assertEquals(ed.getListaZonaPrivada().size(), 0);
		ed.altaVIP(personaVip);
		itPersona = ed.getListaZonaPrivada().iterator();
		while (itPersona.hasNext() && !encontrado) {
			if (personaVip.equals(itPersona.next())) {
				encontrado= true;
			}
		}
		Assert.assertTrue(encontrado);
		Assert.assertEquals(ed.getListaZonaPrivada().size(), 1);
	}
	
	@Test
	public void testRegistrarVipRepetido() {
		System.out.println("test3");
		Edificio ed = new Edificio();
		Persona personaVip = new Persona("John", "Doe", "00000000T");
		ed.altaVIP(personaVip);
		Assert.assertEquals(ed.getListaZonaPrivada().size(), 1);
		ed.altaVIP(personaVip);
		Assert.assertEquals(ed.getListaZonaPrivada().size(), 1);
	}
	
	@Test
	public void testPersonasEnEdificio() {
		System.out.println("test4");
		Edificio ed = new Edificio();
		Persona personaVip = new Persona("John", "Doe", "00000000T");
		Persona visitante1 = new Persona("Jane", "Doe", "00000000R");
		Persona visitante2 = new Persona("Juan", "García", "00000000X");
		ed.altaVIP(personaVip);
		ed.nuevaEntrada(new Registro(personaVip, new Date(), true));
		ed.nuevaEntrada(new Registro(visitante1, new Date(), true));
		ed.nuevaEntrada(new Registro(visitante2, new Date(), true));
		Assert.assertEquals(ed.getPersonasEnEdificio().size(), 3);
		Assert.assertTrue(ed.getListaZonaPrivada().size(), 1);		
	}
}
