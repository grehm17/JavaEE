package servlets;

import entities.Category;
import entities.Product;
import interceptors.DefaultLogger;
import service.CategoryRepository;
import service.ProductRepository;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import java.util.Collection;

@Stateless
public class ProductList{

    @EJB
    private ProductRepository productRepository;

    @EJB
    private CategoryRepository categoryRepository;

    @EJB
    private Cart currentCart;

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

    @Interceptors({DefaultLogger.class})
    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    @Interceptors({DefaultLogger.class})
    public Collection<Product> getProductList() {
        return productRepository.getAll();
    }
    @Interceptors({DefaultLogger.class})
    public String editAction(Product product) {
        this.setProduct(product);
        System.out.println(this.product.getId());
        return "/product.xhtml?faces-redirect=true";
    }
    @Interceptors({DefaultLogger.class})
    public void deleteAction(Product product) {
        productRepository.remove(product);
    }
    @Interceptors({DefaultLogger.class})
    public String addAction() {
        this.product = new Product();
        return "/product.xhtml?faces-redirect=true";
    }
    @Interceptors({DefaultLogger.class})
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
    @Interceptors({DefaultLogger.class})
    public void cartAddAction(Product product) {
        currentCart.addProduct(product);
    }

    public String viewCart() {
        this.product = new Product();
        return "/cart.xhtml?faces-redirect=true";
    }

    public Cart getCurrentCart(){
        return currentCart;
    }

}