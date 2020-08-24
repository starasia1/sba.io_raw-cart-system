package com.github.perscholas;
//system to collect objects
//inheritance

import java.io.*;
import java.util.HashMap;
import java.io.BufferedReader;

public abstract class TheSystem {
	private HashMap<String, Item> itemCollection;

	public void setItemCollection(HashMap<String, Item> itemCollection) {
		this.itemCollection = itemCollection;
	}

	public HashMap<String, Item> getItemCollection() {
		return itemCollection;
	}

	TheSystem() {
		itemCollection = new HashMap<String, Item>();
		// Your code here
		//getClass() is returning you a class object
		//getSimpleName() returns the name of the class in a string format/type
		if (getClass().getSimpleName().equals("AppSystem")) {
			try {
				File file = new File("C:\\Users\\evans\\dev\\sba.io_raw-cart-system\\src\\main\\resources\\sample.txt");
				String st = null;
				BufferedReader br = null;
				br = new BufferedReader(new FileReader(file));
				while ((st = br.readLine()) != null) {
					String[] itemInfo = st.split("  ");
					Item itemObject = new Item(itemInfo[0], itemInfo[1], Double.parseDouble(itemInfo[2]), Integer.parseInt(itemInfo[3]));
//					itemCollection.put(itemInfo[0], null);
					itemCollection.put(itemInfo[0], itemObject);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	//convert the string to integer so parse the value

	public Boolean checkAvailability(Item item) {
		if (item.getQuantity() >= item.getAvailableQuantity()) {
			System.out.println("System is unable to add " + item.getItemName() + " to the cart. System only has " + item.getAvailableQuantity() + " " + item.getItemName());
			return false;
		} else
			return true;
	}

	public Boolean add(Item item) {
		if (item == null)
			return false;
		if (itemCollection.containsKey(item.getItemName()) && checkAvailability(item)){
			//value of the key
			Item itemExist = itemCollection.get(item.getItemName());
			itemExist.setQuantity(itemExist.getQuantity()+1);
			itemCollection.put(item.getItemName(),itemExist);
			return true;
		}
		if (!itemCollection.containsKey(item.getItemName())){
			itemCollection.put(item.getItemName(),item);
			return true;
		}
		return false;
	}

	public Item remove(String itemName) {
		if (itemCollection.containsKey(itemName)){
			Item itemRemove = itemCollection.get(itemName);
			return itemRemove;
		}
		return null;
	}

	public abstract void display();
}