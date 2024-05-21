package com.shopeefy.service;

import org.springframework.stereotype.Service;

import com.shopeefy.exception.ProductException;
import com.shopeefy.modal.Cart;
import com.shopeefy.modal.CartItem;
import com.shopeefy.modal.Product;
import com.shopeefy.modal.User;
import com.shopeefy.repository.CartRepository;
import com.shopeefy.request.AddItemRequest;

@Service
public class CartServiceImplementation implements CartService{
	
	private CartRepository cartRepository;
	private CartItemService cartItemService;
	private ProductService productService;
	
	
	public CartServiceImplementation(CartRepository cartRepository,CartItemService cartItemService,
			ProductService productService) {
		this.cartRepository=cartRepository;
		this.productService=productService;
		this.cartItemService=cartItemService;
	}

	@Override
	public Cart createCart(User user) {
		
		Cart cart = new Cart();
		cart.setUser(user);
//		Cart createdCart=cartRepository.save(cart);
		return cartRepository.save(cart);
	}
	
	public Cart findUserCart(Long userId) {
		Cart cart =	cartRepository.findByUserId(userId);
		int totalPrice=0;
		int totalDiscountedPrice=0;
		int totalItem=0;
		for(CartItem cartsItem : cart.getCartItems()) {
			totalPrice+=cartsItem.getPrice();
			totalDiscountedPrice+=cartsItem.getDiscountedPrice();
			totalItem+=cartsItem.getQuantity();
		}
		
		cart.setTotalItem(cart.getCartItems().size());
		cart.setTotalDiscountedPrice(totalDiscountedPrice);
		cart.setTotalItem(totalItem);
		cart.setTotalPrice(totalPrice);
		cart.setDiscounte(totalPrice-totalDiscountedPrice);
		
		return cartRepository.save(cart);
		
	}
	


	@Override
	public CartItem addCartItem(Long userId, AddItemRequest req) throws ProductException {
		Cart cart=cartRepository.findByUserId(userId);
		Product product=productService.findProductById(req.getProductId());
		
		CartItem isPresent=cartItemService.isCartItemExist(cart, product, req.getSize(),userId);
		
		if(isPresent == null) {
			CartItem cartItem = new CartItem();
			cartItem.setProduct(product);
			cartItem.setCart(cart);
			cartItem.setQuantity(req.getQuantity());
			cartItem.setUserId(userId);
			
			
			int price=req.getQuantity()*product.getDiscountedPrice();
			cartItem.setPrice(price);
			cartItem.setSize(req.getSize());
			
			CartItem createdCartItem=cartItemService.createCartItem(cartItem);
			cart.getCartItems().add(createdCartItem);
			return createdCartItem;
		}
		
		
		return isPresent;
	}

}
