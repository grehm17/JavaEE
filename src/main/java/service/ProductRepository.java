package service;

import entities.Product;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.Collection;
import java.util.LinkedHashMap;


@Named
@ApplicationScoped
public class ProductRepository {

    private LinkedHashMap<Integer,Product> mainList = new LinkedHashMap();

    public ProductRepository() {
        int qty = 20;
        for (int item = 1; item <= qty; item = item+1){
            Product currProduct = new Product(item);
            this.save(currProduct);
        }
    }

    public void save(Product prod){
        System.out.println("222 " + prod.getId() );
        mainList.put(prod.getId(),prod);
    }

    public Collection<Product> getAll(){
        return mainList.values();
    }

    public Product getById(int id){
        return mainList.get(id);
    }

    public void delete(Product prod){
        mainList.remove(prod.getId());
    }
}
