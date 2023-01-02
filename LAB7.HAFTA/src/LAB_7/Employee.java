package LAB_7;

public class Employee {

	protected String adi, soyadi;
	protected String tcNo;
	
	public Employee(String adi, String soyadi, String tcNo) {
		
		
		this.tcNo=tcNo;
		this.adi=adi;
		this.soyadi=soyadi;
	}

	public void write() {
		System.out.println(adi +" "+ soyadi+ " " + tcNo);
	}
	
	
	
	
}
