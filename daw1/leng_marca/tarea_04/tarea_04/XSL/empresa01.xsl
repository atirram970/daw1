<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method='html' encoding="UTF-8"/>
  <xsl:template match="/">
    <html>
      <head>
        <title>ejercicio1xsl</title>
        <meta http-equiv="Content-Type" content="text/html;" charset="UTF-8"/>
        <link rel="stylesheet" type="text/css" href="../CSS/empresa01.css"/>
      </head>
      <body>
        <table class="titulo">
          <tr>
            <td class="titulo">Datos del primer empleado</td>
          </tr>
        </table>
        <h1>
          <xsl:value-of select="/empresa/@nombre"/>
        </h1>
        <xsl:for-each select="empresa/departamento">
          <xsl:if test="position() = 1">
            <table class="contenido">
              <tr>
                <th>Nombre</th>
                <th>Trabajo</th>
                <th>Sueldo</th>
              </tr>
              <xsl:for-each select="empleado">
                <xsl:if test="position() = 1">
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
                </xsl:if>
              </xsl:for-each>
            </table>
          </xsl:if>
        </xsl:for-each>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
