<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method='html' encoding="UTF-8"/>
  <xsl:template match="/">
    <html>
      <head>
        <title>ejercicio5xsl</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <link rel="stylesheet" type="text/css" src="../CSS/empresa05.css"/>
      </head>
      <body>
        <table class="titulo">
          <tr>
            <td class="titulo">
            Los datos de los departamentos especificando:
            <ol>
              <li>Nombre</li>
              <li>Número de empleados</li>
              <li>La suma de sus sueldos con punto de millar, coma decimal y dos decimales.</li>
              <li>Media artimética de sus sueldos con punto de millar, coma decimal y dos decimales.</li>
            </ol>
            </td>
          </tr>
        </table>
        <h1><xsl:value-of select="/empresa/@nombre"/></h1>
        <table class="contenido">
            <tr>
              <th>Departamento</th>
              <th>Empleados</th>
              <th>Total Sueldo</th>
              <th>Media</th>
            </tr>
            <xsl:for-each select="empresa/departamento">
            <tr>
              <td><xsl:value-of select="@nombre"/></td>
              <td class="derecha"><xsl:value-of select="count(empleado)"/></td>
              <td class="derecha"><xsl:value-of select="format-number(sum(empleado/sueldo), '#,###.00')"/></td>
              <td class="derecha"><xsl:value-of select="format-number(avg(empleado/sueldo), '#,###.00')"/></td>
            </tr>
            </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
