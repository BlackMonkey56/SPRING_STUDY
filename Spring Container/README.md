# Spring Container

## 1. Spring bean configuration file

**id**는 **호출명**을 지정, **class**는 컴포넌트의 **FQCN**을 지정

```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

	<!-- MessageBeanKr krBean = new MessageBeanKr -->
	<bean id="krBean" class="exam.step3.MessageBeanKr"></bean>
	<bean id="enBean" class="exam.step3.MessageBeanEn"></bean>
</beans>
```

## 2. Bean Container에서 생성...

우리는 Bean Container에서 생성된 빈을 가져다가 사용(sayHello() 호출)

- MessageBeanTest3.java
  Lazy Loading방식
  클라이언트가 특정한 서비스를 요청할 때 그때서야 비로서 빈을 생성...(getBean()호출 시)

```
System.out.println("1. 빈(Bean) 설정문서를 읽어들이기 위한 파일시스템을 생성...");
Resource r = new FileSystemResource("src/exam/step3/messageBean.xml");//설정문서를 파일로 받아온다.

System.out.println("2. 설정문서를 읽어서 공장에서 빈을 생성합니다...");
BeanFactory factory = new XmlBeanFactory(r);

System.out.println("3. 공장에서 생성한 빈을 가져와서 사용합니다::getBean()");
MessageBean bean1 =  (MessageBean)factory.getBean("krBean");
MessageBean bean2 =  (MessageBean)factory.getBean("enBean");

bean1.sayHello("스프링");
bean2.sayHello("Spring");
```

- MessageBeanTest4.java
  Pre Loading방식
  factory가 생성된 직후 bean들도 생성됨.

```
System.out.println("1. 설정문서를 읽어서 공장에서 빈을 생성합니다...");
ApplicationContext factory = new ClassPathXmlApplicationContext("exam/step3/messageBean.xml");

System.out.println("2. 공장에서 생성한 빈을 가져와서 사용합니다::getBean()");
MessageBean bean1 =  (MessageBean)factory.getBean("krBean");
MessageBean bean2 =  (MessageBean)factory.getBean("enBean");

bean1.sayHello("스프링");
bean2.sayHello("Spring");
```
