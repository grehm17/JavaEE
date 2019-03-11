package service;

import entities.Order;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.Collection;
import java.util.LinkedHashMap;


@Named
@ApplicationScoped
public class OrderRepository {

    private LinkedHashMap<Integer, Order> mainList = new LinkedHashMap();

    public OrderRepository() {
        int qty = 20;
        for (int item = 1; item <= qty; item = item+1){
            Order currProduct = new Order(item);
            this.save(currProduct);
        }
    }

    public void save(Order prod){
        mainList.put(prod.getId(),prod);
    }

    public Collection<Order> getAll(){
        return mainList.values();
    }

    public Order getById(int id){
        return mainList.get(id);
    }

    public void delete(Order prod){
        mainList.remove(prod.getId());
    }
}
