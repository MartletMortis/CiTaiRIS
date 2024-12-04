package org.example.inventory.laptop;

public class GamingLaptop implements Laptop{

    private String graphicCard;
    private boolean inStock = false;

    public GamingLaptop(String graphicCard){
        this.graphicCard = graphicCard;
    }

    public void onSale() {
        this.inStock = true;
        System.out.println("Gaming laptop with " + this.graphicCard + " graphic card.");
    }

    public void sold() {
        this.inStock = false;
        System.out.println("Gaming laptop was sold.");
    }

    public String getStatus() {
        return "Gaming laptop " + (this.inStock ? "in stock" : "sold out");
    }
}
