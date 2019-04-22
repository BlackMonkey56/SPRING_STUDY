package com.ssafy.aop.solv;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
/*
 * 부수적인 기능을 모아놓은 어드바이스 객체(인터셉터 : 원리가 비지니스 로직의 메소드를 가로채서 호출 시점을 앎)
 * 유형 : Before, After, Around
 * 
 * 어드바이스는 결과적으로 target 메소드 호출을 미리 감지하는 인터셉터다.
 * 
 */
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MemberAdvice implements MethodInterceptor{
	private Log log = LogFactory.getLog(getClass());

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		log.info("check...before logging...");
		
		Object ret = invocation.proceed(); //target의 메소드가 이때 호출
		
		System.out.println("target return%% " + ret);
		log.info("check...after logging...");
		
		return ret;
	}
	
	
}
