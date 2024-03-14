<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method='html' encoding='UTF-8' />
    <xsl:template match="movies">
        <html>
            <head>
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
                    td.amarillo {
                        background-color: yellow;
                    }
                    td.rojo {
                        background-color: red;
                    }
                </style>
            </head>
            <body>
                <table>
                    <tr>
                        <th colspan="2">MOVIES</th>
                    </tr>
                    <tr>
                        <th>Título</th>
                        <th>Rating</th>
                    </tr>
                    <xsl:for-each select="movie">
                        <tr>
                            <td>
                                <xsl:value-of select="title"/>
                            </td>
                            <xsl:choose>
                                <xsl:when test="@rating='PG-13'">
                                    <td class="amarillo">

                                        <xsl:value-of select="@rating"/>
                                    </td>
                                </xsl:when>
                                <xsl:when test="@rating='R'">
                                    <td class="rojo">

                                        <xsl:value-of select="@rating"/>
                                    </td>
                                </xsl:when>
                                <xsl:otherwise>
                                    <td>

                                        <xsl:value-of select="@rating"/>
                                    </td>
                                </xsl:otherwise>
                            </xsl:choose>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>