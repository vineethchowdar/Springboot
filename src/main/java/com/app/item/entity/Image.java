package com.app.item.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name = "image")
public class Image {

	@Id
	@Column(name = "imageid")
	private int imageid;
	
	@Column(name = "imageurl")
	private String imageurl;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "view")
	private String view;
	
	@Column(name = "height")
	private String height;
	
	@Column(name = "width")
	private String width;
	@OneToMany 
	@JoinColumn(name = "itemId")
	private String itemId;

	public Image() {
	}

	public Image(int imageid, String imageurl, String type, String view, String height, String width, String itemId) {
		super();
		this.imageid = imageid;
		this.imageurl = imageurl;
		this.type = type;
		this.view = view;
		this.height = height;
		this.width = width;
		this.itemId = itemId;
	}

	public int getImageid() {
		return imageid;
	}

	public void setImageid(int imageid) {
		this.imageid = imageid;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	
	
	
}
