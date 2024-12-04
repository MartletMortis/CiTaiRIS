package org.example.inventory.service;
import org.example.inventory.laptop.Laptop;
public interface Service {
    void addLaptop(Laptop laptop);
    void soldAll();
    void onSaleAll();
    void showStatus();

}
