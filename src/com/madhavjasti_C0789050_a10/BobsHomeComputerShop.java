package com.madhavjasti_C0789050_a10;

public class BobsHomeComputerShop extends BobsComuterShop {
	protected double sales ;
	public static double rate;
	double commission;
	protected double advance;
	double pay;
    @Override
	public double commissionRate(double sales){
		
		if(sales<10000) {
		    rate = (sales/100)*5 ; 
		}
		 else if ((sales<=14999) && (sales>=10000)) {
			rate = (sales/100)*10 ;
		}
		 else if ((sales<=17999) && (sales>=15000)) {
			rate = (sales/100)*12 ;
		}
		 else if ((sales<=21999) && (sales>=18000)) {
			rate = (sales/100)*15 ;
		}
		 else if(sales>=22000) {
			 rate = (sales/100)*16 ;
		 }
		return rate;
	}
	
	@Override
	public void salesPersonsPay(double advance, double rate) {
		if(advance<0 || advance>1500) {
			System.out.println("Advance pay is not more than $1500 and not less than $0");
		}else {
			pay = rate - advance;
			if(pay<0) {
				System.out.println("salesperson must pay $"+ String.format("%.2f", -pay)+" back");
			}else {
				System.out.println("salesperson earned amount $"+String.format("%.2f", pay));
			}
		}
		
	}

}
