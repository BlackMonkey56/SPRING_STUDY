package com.ssafy.aop.prob;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * 비지니스 로직(Core Concern)이 들어있는 Target객체
 * Log level
 * 
 * Trace > Debug > Info > Warn > Error > Fatal
 * log4j.properties(log-bak.xml)파일의 위치는 서버 WEB-INF < classes < @@@ => src폴더 바로 밑에 두어야 앞에 설명한 경로에 위치하게 됨.
 */
public class MemberDao {
	private Log log = LogFactory.getLog(getClass());
	
	public void register(String name) {
		log.info(name+", register...");
		System.out.println("회원으로 등록되었습니다...");
		log.info(name+", register...");
	}
	
	public void findMember(String id) {
		log.info(id+", findMember...");
		System.out.println(id+"로 회원을 검색합니다...");
		log.info(id+", findMember...");
	}
}
