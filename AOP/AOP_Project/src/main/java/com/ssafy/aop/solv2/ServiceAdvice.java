package com.ssafy.aop.solv2;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
/*
 * 부수적인 기능을 모아놓은 어드바이스 객체(인터셉터 : 원리가 비지니스 로직의 메소드를 가로채서 호출 시점을 앎)
 * 유형 : Before, After, Around
 * 
 * 어드바이스는 결과적으로 target 메소드 호출을 미리 감지하는 인터셉터다.
 * 어드바이스의 최종적인 형태는 POJO기반으로 가야한다.
 * 
 */

public class ServiceAdvice {
	private Log log = LogFactory.getLog(getClass());

	public void logPush(ProceedingJoinPoint pjp) throws Throwable{
		log.info("check...before logging...");
		
		Object ret = pjp.proceed();
		
		System.out.println("target method return :: "+ret);
		
		log.info("check...after logging...");
	}
		
		
}
