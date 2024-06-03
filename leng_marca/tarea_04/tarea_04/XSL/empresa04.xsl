<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method='html' encoding="UTF-8"/>
  <xsl:template match="/">
    <html>
      <head>
        <title>ejercicio4xsl</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <link rel="stylesheet" type="text/css" src="../CSS/empresa04.css"/>
      </head>
      <body>
        <table class="titulo">
          <tr>
            <td class="titulo">
              Los datos de todos los empleados teniendo en cuenta:
              <ol>
                <li>Los que disponen de sueldo superior a 2.700 con fondo #66CCFF y el resto con fondo #00CC99.</li>
                <li>Los sueldos con punto de millar, coma decimal y dos decimales.</li>
                <li>La salida clasificada por nombre del empleado descendentemente.</li>
                <li>En el caso de que el empleado disponga del atributo nacionalidad, aparecerá delante del nombre del empleado en mayúsculas, negrita y cursiva</li>
              </ol>
            </td>
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
          <xsl:for-each select="empresa/departamento/empleado">
            <tr>
              <xsl:attribute name="style">
                <xsl:choose>
                  <xsl:when test="sueldo > 2700">background-color: #66CCFF;</xsl:when>
                  <xsl:otherwise>background-color: #00CC99;</xsl:otherwise>
                </xsl:choose>
              </xsl:attribute>
              <td>
                <xsl:if test="@nacionalidad">
                  <span style="font-weight:bold; font-style:italic">
                    <xsl:value-of select="translate(@nacionalidad, 'abcdefghijklmnopqrstuvwxyzáéíóú', 'ABCDEFGHIJKLMNOPQRSTUVWXYZÁÉÍÓÚ')"/>
                  </span>
                </xsl:if>
                <xsl:value-of select="nombre"/>
              </td>
              <td>
                <xsl:value-of select="trabajo"/>
              </td>
              <td class="derecha">
                <xsl:value-of select="format-number(sueldo, '#,##0.00')"/>
              </td>
            </tr>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
