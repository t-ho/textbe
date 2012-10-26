<?xml version="1.0"?>
<xsl:stylesheet version="2.0" xmlns:xhtml="http://www.w3.org/1999/xhtml"
	xmlns="http://www.w3.org/1999/xhtml" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:xs="http://www.w3.org/2001/XMLSchema" exclude-result-prefixes="xhtml xsl xs">

	<xsl:output method="html" encoding="UTF-8" indent="yes" />
	<!-- the identity template -->
	<xsl:template match="@*|node()">
		<xsl:copy>
			<xsl:apply-templates select="@*|node()|processing-instruction()" />
		</xsl:copy>
	</xsl:template>

	<xsl:template match="comment()" />

	<xsl:template match="@class">
	</xsl:template>

	<xsl:template match="@style">
	</xsl:template>

	<xsl:template match="@width">
	</xsl:template>

	<xsl:template match="@height">
	</xsl:template>

	<xsl:template match="@id">
	</xsl:template>

	<xsl:template match="@valign">
	</xsl:template>

	<xsl:template match="@bgcolor">
	</xsl:template>

	<xsl:template match="xhtml:script">
	</xsl:template>

</xsl:stylesheet>