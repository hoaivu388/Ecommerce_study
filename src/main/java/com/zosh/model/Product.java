package com.zosh.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String description;
	
	private Integer price;
	
	@Column(name="discount_price")
	private Integer discountPrice;
	
	@Column(name="discount_present")
	private Integer discountPersent;
	
	@Column(name="quantity")
	private Integer quantity;
	
	@Column(name="brand")
	private String brand;
	
	@Column(name="color")
	private String color;
	
	
	private Set<Size> sizes = new HashSet<>();
	
	@Column(name="image_url")
	private String imageUrl;
	
	@OneToMany(mappedBy="product",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Rating> rating = new ArrayList<>();
	
	@OneToMany(mappedBy="product",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Review> reviews = new ArrayList<>();
	
	@Column(name="num_rating")
	private Integer numRating;
	
	@ManyToOne()
	@JoinColumn(name="catagory_id")
	private Category category;
	
	private LocalDateTime createAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(Integer discountPrice) {
		this.discountPrice = discountPrice;
	}

	public Integer getDiscountPersent() {
		return discountPersent;
	}

	public void setDiscountPersent(Integer discountPersent) {
		this.discountPersent = discountPersent;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Set<Size> getSizes() {
		return sizes;
	}

	public void setSizes(Set<Size> sizes) {
		this.sizes = sizes;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public List<Rating> getRating() {
		return rating;
	}

	public void setRating(List<Rating> rating) {
		this.rating = rating;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public Integer getNumRating() {
		return numRating;
	}

	public void setNumRating(Integer numRating) {
		this.numRating = numRating;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public LocalDateTime getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}

	public Product(Long id, String description, Integer price, Integer discountPrice, Integer discountPersent,
			Integer quantity, String brand, String color, Set<Size> sizes, String imageUrl, List<Rating> rating,
			List<Review> reviews, Integer numRating, Category category, LocalDateTime createAt) {
		super();
		this.id = id;
		this.description = description;
		this.price = price;
		this.discountPrice = discountPrice;
		this.discountPersent = discountPersent;
		this.quantity = quantity;
		this.brand = brand;
		this.color = color;
		this.sizes = sizes;
		this.imageUrl = imageUrl;
		this.rating = rating;
		this.reviews = reviews;
		this.numRating = numRating;
		this.category = category;
		this.createAt = createAt;
	}

	public Product() {
		super();
	}
	
	
}
