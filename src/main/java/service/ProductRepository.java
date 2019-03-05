package service;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private ArrayList<Product> mainList = new ArrayList<>();

    public ProductRepository() {
        int qty = 20;
        for (int item = 1; item <= qty; item = item+1){
            Product currProduct = new Product(item);
            this.mainList.add(currProduct);
        }
    }

    public List<Product> getAll(){
        return mainList;
    }

    public Product getById(int id){
        return mainList.get(id);
    }
}
