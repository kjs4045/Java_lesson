package koreait.realtest;

public class ProductTest {
//¿€º∫¿⁄ :±Ë¡æº∫
	public static void main(String[] args) {
		
		
		
		
		
		
		//13
Product[] cart = new Product[10]; 
		cart[0] = new Bike(123000,"MTB",25);
		cart[1] = new Electronics(3500, "USB");
		cart[3] = new Bike(99000, "ªÔ√µ∏Æ", 15); 
		cart[5] = new Electronics(117000, "ipad");
		cart[7] = new Electronics(2250000, "lg≥√¿Â∞Ì");
		
		//14
//		System.out.println(((Electronics) cart[7]).power(0.9));
		
		Electronics elec = (Electronics)cart[7];

		elec.setKwh(0.9);

		System.out.println(elec.power());

		System.out.println(cart[7]);
		
		//15
		for(Product temp : cart)
			if(temp!=null && temp.price >= 100000)
				System.out.println(temp);
		//16
		for(Product temp : cart)
			if(temp instanceof Bike) {
				Bike bike=(Bike)temp;
				System.out.println(bike.ride());
		
				
			}
	     
	   
	  
	}

	
	
	
	
}

class Electronics extends Product{
	//8
	private double kwh;
	
	@Override//12
	public String toString() {
		return "Electronics [kwh=" + kwh + ", price=" + price + ", prdName=" + prdName + "]";
	}


//5
	@Override
	public String sell(Object obj) {
		return String.format("π≠¿Ω ªÛ«∞ -%s(1set_)");
	}
	
	
	//9
	public Electronics(int price, String prdName) {
		this.price=price;
		this.prdName=prdName;
		
	}
	
	//11
	public double power() {
		return this.kwh*24;
	}

  

	public double getKwh() {
		return kwh;
	}
	public void setKwh(double kwh) {
		this.kwh = kwh;
	}
	
	
	
	
}
