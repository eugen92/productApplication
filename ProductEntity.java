package com.springJpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="products")
public class ProductEntity {
	@Column(name = "ID", nullable = false, unique = true)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "COLOR")
	private String color;
	@Column(name = "HEIGHT")
	private int height;
	@Column(name = "CATEGORIES")
	private String categories;
	
	
	public ProductEntity(Long id, String name, String color, int height, String categories) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.height = height;
		this.categories = categories;
	}

	public ProductEntity(String name, String color, int height, String categories) {
		super();
		this.name = name;
		this.color = color;
		this.height = height;
		this.categories = categories;
	}

	public ProductEntity() {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public String getCategories() {
		return categories;
	}


	public void setCategories(String categories) {
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "ProductEntity [id=" + id + ", name=" + name + ", color=" + color + ", height=" + height
				+ ", categories=" + categories + "]";
	}
		
}

