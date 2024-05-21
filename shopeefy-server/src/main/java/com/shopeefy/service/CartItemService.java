package com.shopeefy.service;

import com.shopeefy.exception.CartItemException;
import com.shopeefy.exception.UserException;
import com.shopeefy.modal.Cart;
import com.shopeefy.modal.CartItem;
import com.shopeefy.modal.Product;

public interface CartItemService {
	
	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	
	public CartItem isCartItemExist(Cart cart,Product product,String size, Long userId);
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
