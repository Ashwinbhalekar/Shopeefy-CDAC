package com.shopeefy.service;

import java.util.List;

import com.shopeefy.exception.ProductException;
import com.shopeefy.modal.Rating;
import com.shopeefy.modal.User;
import com.shopeefy.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
