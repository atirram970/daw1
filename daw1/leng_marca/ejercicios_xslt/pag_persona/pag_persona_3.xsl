<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method='xml' encoding="UTF-8"/>
    <xsl:template match="/">
        <datos>
            <xsl:apply-templates/>
        </datos>
    </xsl:template>
    <xsl:template match="/pag/persona">
        <name>
            <xsl:value-of select="nombre" />
        </name>
    </xsl:template>
</xsl:stylesheet>