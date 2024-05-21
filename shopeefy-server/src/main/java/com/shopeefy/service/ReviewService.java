package com.shopeefy.service;

import java.util.List;

import com.shopeefy.exception.ProductException;
import com.shopeefy.modal.Review;
import com.shopeefy.modal.User;
import com.shopeefy.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
