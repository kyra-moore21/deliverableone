import java.util.Scanner;

public class StockTheStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome to the restocking tool!");
		
		System.out.println("How many Sodas have been sold today? 100 are in stock");
			int sodastock = scnr.nextInt();
			int sodaresult = 100 - sodastock;
				if (sodastock > 100) {
					System.out.println("The value is too high. Stock not adjusted.");
				} else {
					System.out.println("There are " + sodaresult + " Sodas left.");
			}
		System.out.println("How many Chips have been sold today? 40 are in stock");
			int chipstock = scnr.nextInt();
			int chipresult = 40 - chipstock;
				if (chipstock > 40) {
						System.out.println("The value is too high. Stock not adjusted.");
					} else { 
						System.out.println("There are " + chipresult + " Chips left.");
			}
		System.out.println("How many Candies have been sold today? 60 are in stock");
			int candystock = scnr.nextInt();
			int candyresult = 60 - candystock;
				if (candystock > 60) {
					System.out.println("The value is too high. Stock not adjusted."); 
				} else {
					System.out.println("There are " + candyresult + " Candies left." );
					
					}
		System.out.println("Thank you for using the restocking tool! This is what needs to be restocked.");
				if (sodaresult <= 40 && sodastock <= 100) {
					System.out.println("Sodas need to be restocked");
				} 
				
				if (chipresult <= 20 && chipstock <= 40) {
					System.out.println("Chips need to be restocked");
				}
				if (candyresult <= 40 && candystock <= 60) {
					System.out.println("Candy needs to be restocked");
				}
		System.out.println("Have a great day! :)");
				}
	}

