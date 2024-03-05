<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method='html' encoding="UTF-8"/>
    <xsl:template match="/">
    <html lang="es">
        <head>
            <meta charset="UTF-8"/>
            <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
            <title>pagina sencilla titulo y parrafos</title>
            <style type="text/css">
                h1 {
                    text-decoration: underline;
                }
            </style>
        </head>
        <body>
            <!-- CONTENIDO DE LA PÁGINA WEB -->
            <h1>Mi colección de CDs</h1>
            <table>
                <tr>
                <th>Título</th>
                <th>Artísta</th>
                <th>País</th>
                <th>Año</th>
                </tr>
                <xsl:for-each select="catalog/cd">
                    <tr>
                        <td>
                            
                        </td>
                    </tr>
                </xsl:for-each>
            </table>
        </body>
    </html>
    </xsl:template>
</xsl:stylesheet>