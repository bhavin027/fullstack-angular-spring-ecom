package org.bhavin.ecom.storebackend.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	
	@Column(name="size")
	private String size;
	
	@Column(name="price")
	private String price;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="product_id")
	private List<ProductReviews> reviews;

	public Products() {}

	public Products(int id, String name, String featureImage, String galleryImages, String shortDesc, String longDesc,
			int categoryId, String size, String price) {
		this.id = id;
		this.name = name;
		this.featureImage = featureImage;
		this.galleryImages = galleryImages;
		this.shortDesc = shortDesc;
		this.longDesc = longDesc;
		this.categoryId = categoryId;
		this.size = size;
		this.price = price;
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
	
	public List<ProductReviews> getReviews() {
		return reviews;
	}

	public void setReviews(List<ProductReviews> reviews) {
		this.reviews = reviews;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", featureImage=" + featureImage + ", galleryImages="
				+ galleryImages + ", shortDesc=" + shortDesc + ", longDesc=" + longDesc + ", categoryId=" + categoryId
				+ ", size=" + size + ", price=" + price + "]";
	}

}
