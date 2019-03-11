package servlets;

import entities.Product;
import service.ProductRepository;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.Collection;

@ManagedBean(name = "products")
@SessionScoped
public class ProductList {

    @Inject
    private ProductRepository productRepository;

    private Product product;

    public Integer getId() {
        return product.getId();
    }

    public void setId(Integer id) {
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

    public void setDescription(String desc) {
        product.setDescription(desc);
    }

    public String getDescription() {
        return product.getDescription();
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
        productRepository.delete(product);
    }

    public String addAction() {
        this.product = new Product();
        return "/product.xhtml?faces-redirect=true";
    }

    public String saveProduct() {
        System.out.println("<<<<>>>>> " +this.product.getId());
        productRepository.save(product);
        return "/productlist.xhtml?faces-redirect=true";
    }
}