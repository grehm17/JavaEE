package entities.representations;

import entities.Category;
import entities.EntityId;
import entities.Product;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;



public class CategoryRep {

    private long id;

    private String name;

    public CategoryRep(Category category) {
        id = category.getId();
        name = category.getName();
    }

    public CategoryRep(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategoryRep() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }}

