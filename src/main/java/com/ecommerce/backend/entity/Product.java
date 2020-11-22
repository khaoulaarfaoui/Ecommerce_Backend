package com.ecommerce.backend.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
//for setters and getters 
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product implements Serializable{
	
@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
private Long id; 
private String title; 
private String brand;
private String description;
private int price;
private String AvailableSize; 
private String Color;
public Product(Long id, String title, String brand, String description, int price, String availableSize, String color) {
	super();
	this.id = id;
	this.title = title;
	this.brand = brand;
	this.description = description;
	this.price = price;
	AvailableSize = availableSize;
	Color = color;
}
public Product() {
	super();
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getAvailableSize() {
	return AvailableSize;
}
public void setAvailableSize(String availableSize) {
	AvailableSize = availableSize;
}
public String getColor() {
	return Color;
}
public void setColor(String color) {
	Color = color;
}
public Long getId() {
	return id;
}
@Override
public String toString() {
	return "Product [id=" + id + ", title=" + title + ", brand=" + brand + ", description=" + description + ", price="
			+ price + ", AvailableSize=" + AvailableSize + ", Color=" + Color + "]";
} 


}
