package com.github.perscholas;


import java.util.HashMap;

public class AppSystem extends TheSystem {
	AppSystem() {
		}


		@Override
			public void setItemCollection(HashMap<String, Item> itemCollection)  {
			super.setItemCollection(itemCollection);
		}

		@Override
			public HashMap<String, Item> getItemCollection() {
			return super.getItemCollection();
		}

		@Override
			public Boolean checkAvailability(Item item) {
			return super.checkAvailability(item);
		}

		@Override
			public Item remove(String itemName) {
			return super.remove(itemName);
		}

		@Override
			public Boolean add(Item item) {
				if (item == null)
					return false;
				if (getItemCollection().containsKey(item))
					System.out.println(item.getItemName() + " is already in the AppSystem");
				if (!getItemCollection().containsKey(item.getItemName())) {
					getItemCollection().put(item.getItemName(), item);
				return true;
				}
				return false;
			}

			public Item reduceAvailableQuantity(String itemName) {
				return null;
			}

		@Override
			public void display() {
				//Your code here
				AppSystem as = new AppSystem();
				//Print the list objects in tabular format
				System.out.println("AppSystem Inventory");
				System.out.println("--------------------------------------------------------------");
				System.out.printf("%-20s %-20s %-10s %-10s", "Name", "Description", "Price", "Available Quantity");
				System.out.println();
			}
	}



