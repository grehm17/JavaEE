package entities;


import entities.representations.ProductRep;
import service.CategoryRepository;

import javax.inject.Inject;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "products")
public class Product implements Serializable,EntityId {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String name;
    @NotNull
    private float cost;
    @NotNull
    @ManyToOne
    private Category category;

    @Inject
    private CategoryRepository categoryRepository;

    public Product() {
    }

    public Product(ProductRep product) {
        this.name = product.getName();
        this.cost = product.getCost();
        this.category = categoryRepository.getById(product.getCategory().getId());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {

    }

    public String getName() {
        return name;
    }

    public float getCost() {
        return cost;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }
}
