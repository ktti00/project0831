package project0831;

class student{
	String no;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;
	
	void total() {
		tot=kor+eng+mat;
	}
	void average() {
		avg=tot/3.0;
	}
	void print() {
		System.out.printf("학번 : %s, 이름 : %s\n",no,name);
		System.out.printf("국어 : %d 영어 : %d 수학 : %d\n",kor,eng,mat);
		System.out.printf("합계 : %d 평균 : %.2f\n",tot,avg);
		System.out.println();
	}
}
public class Exam02 {

	public static void main(String[] args) {
		student st1=new student();
		st1.no="20200001";
		st1.name="홍길동";
		st1.kor=90;
		st1.eng=85;
		st1.mat=92;
		st1.total();
		st1.average();
		st1.print();
		
		student st2=new student();
		st2.no="20200002";
		st2.name="bbb";
		st2.kor=80;
		st2.eng=98;
		st2.mat=93;
		st2.total();
		st2.average();
		st2.print();

	}

}
