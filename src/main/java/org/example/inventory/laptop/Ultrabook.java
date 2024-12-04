package org.example.inventory.laptop;

public class Ultrabook implements Laptop {
    private boolean inStock = false;
    private String processor;

    public Ultrabook(String processor) {
        this.processor = processor;
    }

    public void onSale() {
        this.inStock = true;
        System.out.println("Ultrabook with " + this.processor + " processor.");
    }

    public void sold() {
        this.inStock = false;
        System.out.println("Ultrabook was sold.");
    }

    public String getStatus() {
        return "Ultrabook " + (this.inStock ? "in stock" : "sold out");
    }
}
