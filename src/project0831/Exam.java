package project0831;

class coffe{
	String model;
	int price;
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	void print(){
		System.out.printf("종류:%s  가격:%d\n",model,price);
	}
}
public class Exam {

	public static void main(String[] args) {
	coffe co1=new coffe();
	co1.setModel("아메리카노");
	co1.setPrice(2000);
	co1.print();	
	
	coffe co2=new coffe();
	co2.setModel("바닐라라떼");
	co2.setPrice(2500);
	co2.print();
	}

}
