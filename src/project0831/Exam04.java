package project0831;
class pc{
	String cpu;
	String memory;
	String hdd;
	String vgaCard;
	
	pc(){
		
	}
	pc(String cpu,String memory,String hdd,String vgaCard){
		this.cpu=cpu;
		this.memory=memory;
		this.hdd=hdd;
		this.vgaCard=vgaCard;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public String getVgaCard() {
		return vgaCard;
	}
	public void setVgaCard(String vgaCard) {
		this.vgaCard = vgaCard;
	}
	void print() {
		System.out.printf("cpu : %s\n",cpu);
		System.out.printf("memory : %s\n",memory);
		System.out.printf("hdd : %s\n",hdd);
		System.out.printf("vgaCard : %s\n",vgaCard);
	}
	
}
public class Exam04 {

	public static void main(String[] args) {
		pc pc1=new pc();
		pc1.setCpu("256Ghz");
		pc1.setMemory("32Gb");
		pc1.setHdd("1Tb");
		pc1.setVgaCard("geforce256");
		pc1.print();

		pc pc2=new pc();
		pc2.setCpu("128Ghz");
		pc2.setMemory("8Gb");
		pc2.setHdd("512Gb");
		pc2.setVgaCard("geforce128");
		pc2.print();
		
		pc pc3=new pc("512Ghz","32Gb","2Tb","geforce512");
		pc3.print();
	}

}
