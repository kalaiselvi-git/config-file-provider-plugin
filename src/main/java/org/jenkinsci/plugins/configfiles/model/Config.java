package org.jenkinsci.plugins.configfiles.model;

import org.kohsuke.stapler.DataBoundConstructor;

public class Config {

	/**
	 * a unique id along all providers!
	 */
	public final String id;
	public final String name;
	public final String comment;
	public final String content;
//	public final ContentType contentType;

	@DataBoundConstructor
	public Config(String id, String name, String comment, String content) {
		this.id = id == null ? String.valueOf(System.currentTimeMillis()) : id;
		this.name = name;
		this.comment = comment;
		this.content = content;
//		ContentType ct = contentTypeStr == null ? null : ContentType.valueOf(contentTypeStr);
//		this.contentType = ct == null ? ContentType.XML : ct; // set default to
																// XML
	}

	@Override
	public String toString() {
		return "[Config: id=" + id + ", name=" + name + "]";
	}
}
