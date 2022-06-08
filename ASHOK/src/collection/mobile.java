package collection;

public class mobile {

	String model;
	int price;
	int gb;
	int ram;
	
	public String toString(){
		return " "+this.model+"-"+this.price+"-"+this.gb+"-"+this.ram;
		
	}
	
	public mobile(String model, int price, int gb, int ram) {
		this.model=model;
		this.price=price;
		this.gb=gb;
		this.ram=ram;
	}

	

}
