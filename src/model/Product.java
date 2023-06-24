/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author NUWAA
 */
public class Product {

    String productName;
    double product_sell_price;
    double qty;

//  String productType;
//  double product_buy_price;
//  int order_id;
//  int consumer_id;
//  String consumer_contact_number;
    
//  This will create a god object/class.
    
    public Product() {
    }

    public Product(String productName, double product_sell_price) {
        this.productName = productName;
        this.product_sell_price = product_sell_price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProduct_sell_price() {
        return product_sell_price;
    }

    public void setProduct_sell_price(double product_sell_price) {
        this.product_sell_price = product_sell_price;
    }

}
