package com.ssafy.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssafy.aop.prob.MemberDao;

public class AopTest1 {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("config/bean.xml");
		
		MemberDao dao = factory.getBean("member", MemberDao.class);
		dao.register("James");
		dao.findMember("ssafy");
	}

}
