package LAB_7;

public class HourlyEmployee extends Employee{

	 protected int wage, hour;
	
	
	public HourlyEmployee(String adi, String soyadi, String tcNo, int hour, int wage) {
		super(adi, soyadi, tcNo);
		this.hour = hour;
		this.wage = wage;
	}


	public int getWage() {
		return wage;
	}


	public void setWage(int wage) {
		this.wage = wage;
	}


	public int getHour() {
		return hour;
	}


	public void setHour(int hour) {
		this.hour = hour;
	}
	
	
	public void write() {
		super.write();
		System.out.println("Saat "+hour+ "Maas   "+ wage);
		System.out.println("maas:"+ hour*wage);
	}
	
	
}
