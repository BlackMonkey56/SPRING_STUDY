package exam.step3;

public class MessageBeanKr implements MessageBean{
	
	public MessageBeanKr() {
		System.out.println("MessageBeanKr...Creating");
	}

	@Override
	public void sayHello(String str) {
		System.out.println("안녕하세요..."+str);
	}
	
}
