package test.main;

import test.mypac.*;

public class MainClass01 {
	public static void main(String[] args) {
		//Generic 클래스를 Apple 로 지정해서 객체사용하기
		FruitBox<Apple> box = new FruitBox<Apple>();
		box.pack(new Apple());
		Apple a1 = box.unPack();
		
		//Generic 클래스를 Melon 으로 지정해서 객체사용하기
		FruitBox<Melon> box2 = new FruitBox<>();
		box2.pack(new Melon());
		Melon m1 = box2.unPack();
		
		//Generic 클래스를 Orange로 지정해서 객체사용하기
		FruitBox<Orange> box3 = new FruitBox<>();
		box3.pack(new Orange());
		Orange o1 = box3.unPack();
	}
}
