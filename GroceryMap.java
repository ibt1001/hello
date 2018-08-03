package com.company;

import java.util.*;
import java.util.Map.Entry;

class Production{

    private String name;
    private double price;

    public Production( String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
class Productions implements Iterable{
    private Map<Integer,Production> grocery = null;

    public Productions(){
        grocery = new HashMap<>();
        grocery.put(1,new Production("Iphone",7000));
        grocery.put(2,new Production("Huawei",6000));
        grocery.put(3,new Production("Vivo",5000));
        grocery.put(4,new Production("Oppo",4000));
    }

    public Map<Integer, Production> getGrocery() {
        return grocery;
    }
}
public class GroceryMap {
    public static void main(String[] args) {
        Map grocery = new Productions().getGrocery();
        for(Object product:grocery.entrySet()){

            System.out.println((product.getKey()+" :"+product.getValue());
        }



    }
}

