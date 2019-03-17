package servlets;

import entities.Category;
import entities.Product;
import org.primefaces.model.menu.*;
import service.CategoryRepository;
import service.ProductRepository;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ComponentSystemEvent;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Collection;

@ManagedBean(name = "products")
@SessionScoped
public class ProductList {

    @Inject
    private ProductRepository productRepository;

    @Inject
    private CategoryRepository categoryRepository;

    private Product product;


    public long getId() {
        return product.getId();
    }

    public void setId(long id) {
        product.setId(id);
    }

    public String getName() {
        return product.getName();
    }

    public void setName(String name) {
        product.setName(name);
    }

    public float getCost() {
        return product.getCost();
    }

    public void setCost(float cost) {
        product.setCost(cost);
    }


    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Collection<Product> getProductList() {
        return productRepository.getAll();
    }

    public String editAction(Product product) {
        this.setProduct(product);
        System.out.println(this.product.getId());
        return "/product.xhtml?faces-redirect=true";
    }

    public void deleteAction(Product product) {
        productRepository.remove(product);
    }

    public String addAction() {
        this.product = new Product();
        return "/product.xhtml?faces-redirect=true";
    }

    public String saveProduct() {
        productRepository.merge(product);
        return "/productlist.xhtml?faces-redirect=true";
    }

    public String getCategoryId() {
        if (product == null || product.getCategory() == null) {
            return "-1L";
        }
        return String.valueOf(product.getCategory().getId());
    }

    public void setCategoryId(String id) {
        if (id == null || id.isEmpty()) {
            return;
        }
        Category newCategory = categoryRepository.getById(Long.valueOf(id));
        if (newCategory != null) {
            product.setCategory(newCategory);
        }
    }



}