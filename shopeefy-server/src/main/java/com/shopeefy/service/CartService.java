package com.shopeefy.service;

import com.shopeefy.exception.ProductException;
import com.shopeefy.modal.Cart;
import com.shopeefy.modal.CartItem;
import com.shopeefy.modal.User;
import com.shopeefy.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
