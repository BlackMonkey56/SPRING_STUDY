package com.ssafy.aop.solv2;

/*
 * Core Concern만을 담고 있는 Target객체로 작성
 * Cross Cutting Concern은 별도로 분리해서 Advice에 등록
 */
public class MemberDao {
	
	public void register(String name) {
		System.out.println("회원으로 등록되었습니다...");
	}
	
	public void findMember(String id) {
		System.out.println(id+"로 회원을 검색합니다...");
	}
}
