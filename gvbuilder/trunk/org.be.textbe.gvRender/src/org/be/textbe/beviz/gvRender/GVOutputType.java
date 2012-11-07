package org.be.textbe.beviz.gvRender;

public enum GVOutputType {

	/**
	 * 
	 */
	BMP("bmp","Windows Bitmap Format"),
	/**
	 * 
	 */
	CANON("canon",""),
	/**
	 * 
	 */
	DOT("dot",""),
	/**
	 * 
	 */
	XDOT("xdot","DOT"),
	/**
	 * 
	 */
	CMAP("cmap","Client-side imagemap (deprecated)"),
	/**
	* 
	*/
	EPS("eps","Encapsulated PostScript"),
	/**
	* 
	*/
	FIG("fig","FIG"),
	/**
	* 
	*/
	GD("gd",""),
	/**
	* 
	*/
	GD2("gd2","GD/GD2 formats"),
	/**
	* 
	*/
	GIF("gif","GIF"),
	/**
	* 
	*/
	GTK("gtk","GTK canvas"),
	/**
	* 
	*/
	ICO("ico","Icon Image File Format"),
	/**
	* 
	*/
	IMAP("imap",""),
	/**
	* 
	*/
	CMAPX("cmapx","Server-side and client-side imagemaps"),
	/**
	* 
	*/
	IMAP_NP("imap_np",""),
	/**
	* 
	*/
	CMAPX_NP("cmapx_np","Server-side and client-side imagemaps"),
	/**
	* 
	*/
	ISMAP("ismap","Server-side imagemap (deprecated)"),
	/**
	* 
	*/
	JPG("jpg","JPEG"),
	/**
	* 
	*/
	JPEG("jpeg","JPEG"),
	/**
	* 
	*/
	JPE("jpe","JPEG"),
	/**
	* 
	*/
	PDF("pdf","Portable Document Format (PDF)"),
	/**
	* 
	*/
	PLAIN("plain",""),
	/**
	* 
	*/
	PLAIN_EXT("plain-ext","Simple text format"),
	/**
	* 
	*/
	PNG("png","Portable Network Graphics format"),
	/**
	* 
	*/
	PS("ps","PostScript"),
	/**
	* 
	*/
	PS2("ps2","PostScript for PDF"),
	/**
	* 
	*/
	SVG("svg",""),
	/**
	* 
	*/
	SVGZ("svgz","Scalable Vector Graphics"),
	/**
	* 
	*/
	TIF("tif",""),
	/**
	* 
	*/
	TIFF("tiff","TIFF (Tag Image File Format)"),
	/**
	* 
	*/
	VML("vml",""),
	/**
	* 
	*/
	VMLZ("vmlz","Vector Markup Language (VML)"),
	/**
	* 
	*/
	VRML("vrml","VRML"),
	/**
	* 
	*/
	WBMP("wbmp","Wireless BitMap format"),
	/**
	* 
	*/
	WEBP("webp","Image format for the Web"),
	/**
	* 
	*/
	XLIB("xlib","Xlib canvas");

	private final String extension;
	private final String description;

	GVOutputType(String extension, String description) {
		this.extension = extension;
		this.description = description;
	}

	public String getExtension() {
		return extension;
	}

	public String getDescription() {
		return description;
	}

}
