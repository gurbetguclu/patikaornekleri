package patika.MaasHesaplama;


public class Employee {
	
	String name ;
	double salary; //maaş
	double workHours;//haftalık çalışma saati
	int hireYear;//işe başlangıç yılı
	
	double vergi;
	double bonus;
	double maasArtisi;
	double tax;
	
	
	
	Employee(String name,double salary,double workHours,int hireYear){
		
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
		
	}

	public double tax() {
		
		if(this.salary<1000) {
			
			tax=0.0;
		
			
		} else {
			
			tax=this.salary*0.03;
			
		}
		return tax;
	}
	
	public double bonus() {
		
		if(this.workHours>=40) {
			
			bonus=(this.workHours-40)*30;
			
			
		}else {
			bonus=0.0;
			
		}
	
	return bonus;
	}
	
	public double raiseSalary() {
		
		int now=2021;
		 
		int experience=now-this.hireYear;
		
		if(experience<10) {
			
			maasArtisi=this.salary*0.05;
			
			
		}else if (experience>=10 && experience <20) {
			
			maasArtisi=this.salary*0.1;
	
		}else {
			maasArtisi=this.salary*0.15;
			
		}
	
		return maasArtisi;
	}
	
	public double toplamMaas() {
		double maas =this.salary+tax+bonus+maasArtisi;
		return maas;
	}
	
	public void toPrint() {
		System.out.println("Çalışanın adı ve soyadı: "+this.name);
		System.out.println("Çalışanın maaşı: "+this.salary);
		System.out.println("Çalışanın Haftalık Çalışma Saati: "+this.workHours);
		System.out.println("Çalışanın İşe başlangıç yılı: "+this.hireYear);
		
		System.out.println("Vergi: "+tax());
	
		System.out.println("Bonus: "+bonus());
		
		System.out.println("tecrübe: "+raiseSalary());
		
		System.out.println("Toplam Maaş: "+ toplamMaas());
	
		
	}
	
	public static void main(String[] args) {
		
		Employee isci1=new Employee("Gurbet",2000,45,1985);
		isci1.toPrint();
		
		
		
		
	}
}
