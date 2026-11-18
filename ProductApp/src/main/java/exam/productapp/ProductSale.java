/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam.productapp;

/**
 *
 * @author tumithobejane
 */
public class ProductSale {
    


    private static final double VAT_RATE = 0.15;
    private static final double COMMISSION_RATE = 0.05;

    private String customerName;
    private String productName;
    private double price;

    public ProductSale(String customerName, String productName, double price) {
        this.customerName = customerName;
        this.productName = productName;
        this.price = price;
    }

    public String getCustomerName() { return customerName; }
    public String getProductName() { return productName; }
    public double getPrice() { return price; }

    // VAT: 15% of the product price
    public double calculateVAT() {
        return price * VAT_RATE;
    }

    // Commission: 5% of the product price
    public double calculateCommission() {
        return price * COMMISSION_RATE;
    }

    // Total: Price + VAT + Commission
    public double calculateTotal() {
        return price + calculateVAT() + calculateCommission();
    }
}