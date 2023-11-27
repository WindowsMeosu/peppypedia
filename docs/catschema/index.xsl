<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:xlink="http://www.w3.org/1999/xlink"
                exclude-result-prefixes="xlink"           
                version="1.0">
  <xsl:output method="html"/>

  <xsl:template match="*[@xlink:type = 'simple' and @xlink:href]">
    <p><a href="{@xlink:href}"><xsl:apply-templates/></a></p>
  </xsl:template>

  <xsl:template match="sch">
    <html><body>
      <xsl:apply-templates/>
    </body></html>
  </xsl:template>

</xsl:stylesheet>
