package com.ssafy.aop.test;

import org.springframework.aop.framework.ProxyFactoryBean;

import com.ssafy.aop.solv.MemberAdvice;
import com.ssafy.aop.solv.MemberDao;

//bean 설정 문서를 생략하고 직접 코딩을 한다..
public class AopTest2 {

	public static void main(String[] args) {
		//target, advice, factory를 생성
		MemberDao mem = new MemberDao(); //target
		MemberAdvice advice = new MemberAdvice(); //advice
		
		ProxyFactoryBean pfBean = new ProxyFactoryBean();
		
		//setTarget, addAdvice
		pfBean.setTarget(mem);
		pfBean.addAdvice(advice);
		
		mem.register("하바리");
		mem.findMember("ssafy007");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		MemberDao dao = (MemberDao)pfBean.getObject();
		dao.register("하바리");
		dao.findMember("ssafy007");
	}

}
