package com.github.perscholas;

public class CartSystem extends TheSystem {
	CartSystem() {
	}

	@Override
	public void display() {
		// Your code here
		TheSystem obj = new CartSystem();

		double subTotal = 0.0;
		double total = 0.0;
		double tax = 0.0;

		obj.getItemCollection();
		//	int sub-total= Sum(itemPrice*itemQuantity);
		//	int tax = sub-total * 0.05;
		//	int total = sub-total * tax;

		// Print the list objects in tabular format.
		System.out.println("Cart");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.printf("%-20s %-20s %-10s %-10s %-10s", "Name", "Description", "Price", "Quantity", "Sub Total");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------");
		System.out.printf("%-20s %-20s %n ", "Pre-Tax", 10);
		System.out.printf("%-20s %-20s %n ", "Tax" , 10);
		System.out.printf("%-20s %-20s %n ", "Total", 10);
		System.out.println();
	}
}