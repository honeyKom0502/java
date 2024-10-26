/*write a java program to create a class ProductDetails with attributes productName,price, and quantity. write methods to 
read appropriate values for the attributes(use the constructor),calculate the total cost for the product, and 
display the total cost for multiple products.*/
import java.util.Scanner;
class Product1{
    String productName;
    int price;
    int quantity;
    public Product1(){
        productName="chips";
            price=60;
            quantity=8;
    }
    public Product1(String productName,int price,int quantity){
            this.productName=productName;
            this.price=price;
            this.quantity=quantity;
    }
    public void display(){
        System.out.println("product name:"+productName);
        System.out.println("price is:"+price);
        System.out.println("quantity is:"+quantity);

    }
    public double calCost(double basePrice, double discount, double taxRate, double shippingFee) {
        double discountedPrice = basePrice - discount;
        double salesTax = discountedPrice * (taxRate / 100);
        return discountedPrice + salesTax + shippingFee;
    }
    }
    public class ProductDetails{
        public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           Product1 p=new Product1(" uncle chips",50,5);
           Product1 p1=new Product1("balaji chips",40,10);
           p.display();
           System.out.println("total cost for 5 uncle chips:"+p.calCost(50.0,0.0,5.0,15.0));
           p1.display();
           System.out.println("total cost for 5 balaji onion chips is:"+p1.calCost(40.0,0.0,5.0,10.0));

        }
    }

