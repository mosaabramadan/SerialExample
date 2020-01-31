/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialexample;

/**
 *
 * @author mosaabramadan
 */
public class Fruit implements java.io.Serializable {
    private String fruitName;
    private double price;

    /**
     * @return the fruitName
     */
    public String getFruitName() {
        return fruitName;
    }

    /**
     * @param fruitName the fruitName to set
     */
    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
