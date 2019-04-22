package com.ssafy.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssafy.aop.solv2.MemberDao;
import com.ssafy.aop.solv2.ProductDao;


public class AopTest3 {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("config/solv2.xml");
		
		MemberDao dao = factory.getBean("member", MemberDao.class);
		ProductDao pro = factory.getBean("product", ProductDao.class);
		
		dao.findMember("bb");
		pro.insertProduct("aa");
	}

}
