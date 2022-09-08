package project0831;

import project0831.Car;

class Car{
	String color;
	int speed;
	
	void upspeed(int value){
		speed=speed+value;
	}
	void downspeed (int value){
		speed=speed-value; 
	}
	void print(){
		System.out.println("자동차 색깔 : "+color);
		System.out.println("�ڵ��� �ӵ� : "+speed);
	}
}
public class Exam01 {

	public static void main(String[] args) {
		Car myCar1=new Car();
		myCar1.color="����";
		myCar1.speed=0;
		myCar1.upspeed(50);
		myCar1.print();
	/*	System.out.println("�ڵ��� ���� : "+myCar1.color);
		System.out.println("�ڵ��� �ӵ� : "+myCar1.speed);*/
	
		Car myCar2=new Car();
		myCar2.color="�Ķ�";
		myCar2.speed=30;
		myCar2.downspeed(10);
		myCar2.print();
/*		System.out.println("�ڵ��� �� : "+myCar2.color);
		System.out.println("�ӵ� : "+myCar2.speed);
	*/
		Car myCar3=new Car();
		myCar3.color="���";
		myCar3.speed=100;
		myCar3.downspeed(20);
		myCar3.print();
/*		System.out.println("�ڵ��� �� : "+myCar3.color);
		System.out.println("�ӵ� : "+myCar3.speed);*/
	}

}
