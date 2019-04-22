package spring.service.dice.test;

import spring.service.dice.impl.DiceAImpl;
import spring.service.dice.impl.DiceCImpl;
import spring.service.dice.play.Player02;

/*
 * FileName : DiceTestApp02.java
 * ㅇ DiceA / Player01 Test 하는 Application 
 */
public class DiceTestApp03 {
	///Main Method
	public static void main(String[] args){
		
		Player02 player02 = new Player02(new DiceAImpl());
		player02.playDice(3);
		System.out.println("=======================");
		System.out.println("선택된 주사위 수의 통합은 : "+player02.getTotalValue());
		System.out.println("=======================");
		
		Player02 player03 = new Player02(new DiceCImpl());
		player02.playDice(4);
		System.out.println("=======================");
		System.out.println("선택된 주사위 수의 통합은 : "+player02.getTotalValue());
		System.out.println("=======================");
		
	}
}//end of class

