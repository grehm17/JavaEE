package entities.representations;


import entities.Category;
import entities.EntityId;
import entities.Product;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;


public class ProductRep {

    private long id;

    private String name;

    private float cost;

    private CategoryRep category;

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public long getId() {
        return id;
    }


    public ProductRep(long id, String name, float cost, CategoryRep category) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.category = category;
    }

    public ProductRep(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.cost = product.getCost();
        this.category = new CategoryRep(product.getCategory());
    }

    public ProductRep() {
    }


    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public float getCost() {
        return cost;
    }

    public CategoryRep getCategory() {
        return category;
    }

    public void setCategory(CategoryRep category) {
        this.category = category;
    }
}
