package exam.step3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/*
 * 재사용성을 높이는 방법은 일단 인터페이스 사용
 * 하지만 new키워드를 사용하는 이상 환벽한 결과를 얻지는 못한다.
 * 
 * Spring Container(IOC: Inversion Of Controller 제어의 역전) 사용
 * 
 * 
 * Lazy Loading
 * :
 * 클라이언트가 특정한 서비스를 요청할 때
 * 그때서야 비로서 빈을 생성하고...
 * 		^
 * 		|
 * 		v
 * Pre Loading
 * 
 */

public class MessageBeanTest3 {

	public static void main(String[] args) {
		/*
		 * Bean Container에서 생성...
		 * 우리는 Bean Container에서 생성된 빈을 가져다가 사용(sayHello() 호출)
		 */
		
		System.out.println("1. 빈(Bean) 설정문서를 읽어들이기 위한 파일시스템을 생성...");
		Resource r = new FileSystemResource("src/exam/step3/messageBean.xml");//설정문서를 파일로 받아온다.
		
		System.out.println("2. 설정문서를 읽어서 공장에서 빈을 생성합니다...");
		BeanFactory factory = new XmlBeanFactory(r);
		
		System.out.println("3. 공장에서 생성한 빈을 가져와서 사용합니다::getBean()");
		MessageBean bean1 =  (MessageBean)factory.getBean("krBean");
		MessageBean bean2 =  (MessageBean)factory.getBean("enBean");
		
		bean1.sayHello("스프링");
		bean2.sayHello("Spring");
		
	}

}
