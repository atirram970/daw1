<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method='xml' encoding="UTF-8"/>
    <xsl:template match="/">
        <datos>
            <name><h1>Título</h1>
                <xsl:value-of select="pag/persona/nombre" />
            </name>
        </datos>
    </xsl:template>
</xsl:stylesheet>