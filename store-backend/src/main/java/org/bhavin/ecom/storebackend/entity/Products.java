package org.bhavin.ecom.storebackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Products {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="feature_image")
	private String featureImage;
	
	@Column(name="gallery_images")
	private String galleryImages;
	
	@Column(name="short_desc")
	private String shortDesc;
	
	@Column(name="long_desc")
	private String longDesc;
	
	@Column(name="category_id")
	private int categoryId;
	
	public Products() {}

	public Products(int id, String name, String featureImage, String galleryImages, String shortDesc, String longDesc,
			int categoryId) {
		this.id = id;
		this.name = name;
		this.featureImage = featureImage;
		this.galleryImages = galleryImages;
		this.shortDesc = shortDesc;
		this.longDesc = longDesc;
		this.categoryId = categoryId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFeatureImage() {
		return featureImage;
	}

	public void setFeatureImage(String featureImage) {
		this.featureImage = featureImage;
	}

	public String getGalleryImages() {
		return galleryImages;
	}

	public void setGalleryImages(String galleryImages) {
		this.galleryImages = galleryImages;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public String getLongDesc() {
		return longDesc;
	}

	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", featureImage=" + featureImage + ", galleryImages="
				+ galleryImages + ", shortDesc=" + shortDesc + ", longDesc=" + longDesc + ", categoryId=" + categoryId
				+ "]";
	}
	
	

}
