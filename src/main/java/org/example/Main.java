package org.example;

/*import org.example.inventory.AppConfig;
import org.example.inventory.InventoryApp;*/

import org.example.inventory.laptop.GamingLaptop;
import org.example.inventory.laptop.Ultrabook;
import org.example.inventory.service.controller;

public class Main {
    /*public static void main(String[] args) {
        // Используем AppConfig для создания InventoryApp и его зависимости
        AppConfig config = new AppConfig();
        InventoryApp app = config.createInventoryApp();

        app.manageLaptops();  // Запускаем приложение
    }*/

    public Main() {
    }

    public static void main(String[] args) {
        controller ctrl = new controller();
        ctrl.addLaptop(new GamingLaptop("NVIDIA GeForce RTX 4050"));
        ctrl.addLaptop(new Ultrabook("Intel Core i5-1235U"));
        System.out.println("All laptops was sold:");
        ctrl.soldAll();
        System.out.println("\nLaptops status:");
        ctrl.showStatus();
        System.out.println("\nAll laptops on sale:");
        ctrl.onSaleAll();
        System.out.println("\nLaptops status:");
        ctrl.showStatus();
    }


}