package exam.step3;

public class MessageBeanEn implements MessageBean{

	public MessageBeanEn() {
		System.out.println("MessageBeanEn...Creating");
	}
	
	@Override
	public void sayHello(String str) {
		System.out.println("Hello..."+str);
	}
	
}
