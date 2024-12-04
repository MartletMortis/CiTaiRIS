package org.example.inventory.service;

import org.example.inventory.laptop.Laptop;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class controller implements Service {
    private List<Laptop> lpt = new ArrayList();

    public controller() {
    }
@Override
    public void addLaptop(Laptop laptop) {
        this.lpt.add(laptop);
    }
@Override
    public void soldAll() {
        Iterator var1 = this.lpt.iterator();

        while(var1.hasNext()) {
            Laptop laptop = (Laptop) var1.next();
            laptop.sold();
        }

    }
@Override
    public void onSaleAll() {
        Iterator var1 = this.lpt.iterator();

        while(var1.hasNext()) {
            Laptop laptop = (Laptop) var1.next();
            laptop.onSale();
        }

    }
@Override
    public void showStatus() {
        Iterator var1 = this.lpt.iterator();

        while(var1.hasNext()) {
            Laptop laptop = (Laptop) var1.next();
            System.out.println(laptop.getStatus());
        }

    }
}
