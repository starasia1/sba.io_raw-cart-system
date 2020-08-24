package com.github.perscholas;


public class Item{
    private String itemName;
    private String itemDesc;
    private Double itemPrice;
	private Integer Quantity;
    private Integer availableQuantity;


    public Item(String itemName, String itemDesc, Double itemPrice, Integer availableQuantity) {
        this.itemName = itemName;
        this.itemDesc = itemDesc;
        this.itemPrice = itemPrice;
        this.Quantity = 1;
        this.availableQuantity = availableQuantity;
    }

    public Item() {

    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the name to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the itemDesc
     */
    public String getItemDesc() {
        return itemDesc;
    }

    /**
     * @param itemDesc the desc to set
     */
    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    /**
     * @return the itemPrice
     */
    public Double getItemPrice() {
        return itemPrice;
    }

    /**
     * @param itemPrice the price to set
     */
    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     * @return the Quantity
     */
    public Integer getQuantity() {
        return Quantity;
    }

    /**
     * @param Quantity the name to set
     */
    public void setQuantity(Integer Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * return the AvailableQuantity
     */
    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    /**
     * @param availableQuantity
     */
    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    // public String toString()
    // {
    //      return itemName+"  "+itemDesc+"  "+itemPrice+"  "+Quantity+"  ";
    // }
}