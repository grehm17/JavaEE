package webservices;

import entities.Category;
import entities.Product;
import entities.representations.ProductRep;
import service.CategoryRepository;
import service.ProductRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class SubService {

    @Inject
    private ProductRepository productRepository;

    @Inject
    private CategoryRepository categoryRepository;


    public long addProduct(ProductRep product) {
        Product productPers = new Product();
        productPers.setId(0l);
        productPers.setName(product.getName());
        productPers.setCost(product.getCost());
        productPers.setCategory(categoryRepository.getById(product.getCategory().getId()));
        productPers = productRepository.merge(productPers);
        return productPers.getId();
    }


    public void deleteProduct(long id) {
        Product product = productRepository.getById(id);
        productRepository.remove(product);
    }


    public void addProdCategory(long id, long catId) {
        Category newCat = categoryRepository.getById(catId);
        Product product = productRepository.getById(id);
        product.setCategory(newCat);
        productRepository.merge(product);
    }


    public ProductRep getById(long id){
        Product product = productRepository.getById(id);
        return new ProductRep(product);
    }


    public ProductRep getByName(String name){
        Product product = productRepository.getByName(name);
        return new ProductRep(product);
    }


    public List<ProductRep> getAll() {
        return productRepository.getAll()
                .stream()
                .map(ProductRep::new)
                .collect(Collectors.toList());
    }


    public List<ProductRep> getByCategory(long id) {
        return productRepository.getByCategory(id)
                .stream()
                .map(ProductRep::new)
                .collect(Collectors.toList());
    }
}
