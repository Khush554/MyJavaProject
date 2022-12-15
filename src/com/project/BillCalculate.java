package com.project;

public class BillCalculate {
	static double totalcal=0;
	final double tax=0.45;
	public void totalcal() {
		if(CoffeeCold.item_quantity==1) {
			totalcal=CoffeeCold.total_amount*1+tax+ ExtraBeverages.totalsnacks;
		}
		if(CoffeeCold.item_quantity==2) {
			totalcal=CoffeeCold.total_amount*2+tax+ ExtraBeverages.totalsnacks;
		}
		if(CoffeeCold.item_quantity==3) {
			totalcal=CoffeeCold.total_amount*3+tax+ ExtraBeverages.totalsnacks;
		}
		if(CoffeeCold.item_quantity==4) {
			totalcal=CoffeeCold.total_amount*4+tax+ ExtraBeverages.totalsnacks;
		}
		if(CoffeeCold.item_quantity==5) {
			totalcal=CoffeeCold.total_amount*5+tax+ ExtraBeverages.totalsnacks;
		}
		if(CoffeeCold.item_quantity==6) {
			totalcal=CoffeeCold.total_amount*7+tax+ ExtraBeverages.totalsnacks;
		}
		System.out.println("Your Total Amount is="+totalcal);
		System.out.println(">>>>>>>>Thanks You<<<<<<<<<<<");
	}
	

  public void billCalculation() {
	  System.out.println(">>>>>>>>Here is your Bill<<<<<<<<<<<");
	  System.out.println("Coffee type "+CoffeeCold.type);
	  System.out.println("Item Quantity "+CoffeeCold.item_quantity);
	  System.out.println("Amount of Item "+CoffeeCold.total_amount);
	  System.out.println("Tax......"+tax);
	  System.out.println("Snacks total is="+ExtraBeverages.totalsnacks);
	  
  }
  

}
