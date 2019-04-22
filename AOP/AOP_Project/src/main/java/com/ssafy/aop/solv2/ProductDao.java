package com.ssafy.aop.solv2;

/*
 * Core Concern만을 담고 있는 Target객체로 작성
 * Cross Cutting Concern은 별도로 분리해서 Advice에 등록
 */
public class ProductDao {
	
	public String insertProduct(String pro) {
		System.out.println("상품등록...");
		
		return "iPad";
	}

}
