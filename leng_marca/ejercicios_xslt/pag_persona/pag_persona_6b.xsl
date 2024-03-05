<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method='html' encoding="UTF-8"/>
    <xsl:template match="/pag">
        <html lang="en">
            <head>
                <meta charset="UTF-8"/>
                    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
                        <title>pagina sencilla con tabla</title>
                        <style type="text/css">
                h1 {
                    text-decoration: underline;
                }
                table, th, td {
                    border: 2px solid black;
                }
                th {
                    background-color: antiquewhite;
                    color: blueviolet;
                }
                td {
                    color: brown;
                }
                        </style>
                    </head>
                    <body>
                        <!-- CONTENIDO DE LA PÁGINA WEB -->
                        <h1>
                            <xsl:value-of select="titulo"/>
                        </h1>
                        <table>
                            <tr>
                                <th>Nombre</th>
                                <th>Apellido</th>
                            </tr>
                            <xsl:for-each select="persona">
                                <tr>
                                    <td>
                                        <xsl:value-of select="nombre"/>
                                    </td>
                                    <td>
                                        <xsl:value-of select="apellido"/>
                                    </td>
                                </tr>
                            </xsl:for-each>
                        </table>
                    </body>
                </html>
            </xsl:template>
            <xsl:template match="pag/persona">
                <tr>
                    <td>
                        <xsl:value-of select="nombre"/>
                    </td>
                    <td>
                        <xsl:value-of select="apellido"/>
                    </td>
                </tr>
            </xsl:template>
            <xsl:template match="pag/titulo">
            </xsl:template>
        </xsl:stylesheet>