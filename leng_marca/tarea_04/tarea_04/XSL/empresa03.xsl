<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method='html' encoding="UTF-8"/>
  <xsl:template match="/">
    <html>
      <head>
        <title>ejercicio3xsl</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <link rel="stylesheet" type="text/css" href="../CSS/empresa03.css"/>
      </head>
      <body>
        <table class="titulo">
          <tr>
            <td class="titulo">Los datos de los empleados programadores</td>
          </tr>
        </table>
        <h1>
          <xsl:value-of select="/empresa/@nombre"/>
        </h1>
        <table class="contenido">
          <tr>
            <th>Nombre</th>
            <th>Trabajo</th>
            <th>Sueldo</th>
          </tr>
          <xsl:apply-templates select="empresa/departamento/empleado[trabajo='Programador']"/>
        </table>
      </body>
    </html>
  </xsl:template>
  <xsl:template match="empleado">
    <tr>
      <td>
        <xsl:value-of select="nombre"/>
      </td>
      <td>
        <xsl:value-of select="trabajo"/>
      </td>
      <td class="derecha">
        <xsl:value-of select="sueldo"/>
      </td>
    </tr>
  </xsl:template>
</xsl:stylesheet>
