package com.ecommerce.backend.entity;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="P1", types=Product.class)
public interface ProductProjection {
	public String getTitle();
	public String getBrand();
	public int getPrice();
	public String getDescription();
}
