package service;

import entities.Category;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.Collection;
import java.util.LinkedHashMap;


@Named
@ApplicationScoped
public class CategoryRepository {

    private LinkedHashMap<Integer, Category> mainList = new LinkedHashMap();

    public CategoryRepository() {
        int qty = 20;
        for (int item = 1; item <= qty; item = item+1){
            Category currProduct = new Category(item);
            this.save(currProduct);
        }
    }

    public void save(Category prod){
        mainList.put(prod.getId(),prod);
    }

    public Collection<Category> getAll(){
        return mainList.values();
    }

    public Category getById(int id){
        return mainList.get(id);
    }

    public void delete(Category prod){
        mainList.remove(prod.getId());
    }
}
