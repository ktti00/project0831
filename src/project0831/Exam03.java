package project0831;

class insa{
	private String no;      //사번
	private String name;    //이름
	private String address; //주소
	private String hp;      //전화번호
	private int sum;
	
	
	
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	insa() {
		System.out.println("생성자 호출");
	}
	insa(String no){
		this.no=no;
	}
	insa(String no,String name){
		this.no=no;
		this.name=name;
	}
	
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	void print() {
		System.out.printf("사번 : %s 이름 : %s\n",no,name);
		System.out.printf("주소 : %s 전화번호 : %s\n",address,hp);
	}
}

public class Exam03 {

	public static void main(String[] args) {

		insa in1=new insa();		
		in1.setNo("001");
		in1.setName("aaa");
		in1.setAddress("home 1");
		in1.setHp("010-1111-1111");
		in1.print();
		System.out.println(in1.getNo());
		
		insa in2=new insa();
		in2.setNo("002");
		in2.setName("bbb");
		in2.setAddress("home 2");
		in2.setHp("010-2222-2222");
		in2.print();
		System.out.println(in2.getNo());
		
		insa in3=new insa();
		in3.setNo("003");
		in3.setName("ccc");
		in3.setAddress("home 3");
		in3.setHp("010-3333-3333");
		in3.print();

		insa in4=new insa("001");
		in4.print();
		
		insa in5=new insa("003","bbb");
		in5.print();
		System.out.println(in4.getSum());

		
	}

}
