package webservices;

import entities.Category;
import entities.Product;
import entities.representations.CategoryRep;
import entities.representations.ProductRep;
import javassist.NotFoundException;
import service.CategoryRepository;
import service.ProductRepository;

import javax.inject.Inject;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@WebService(endpointInterface = "webservices.ServiceInterface")
public class NewMainService implements ServiceInterface {

    @Inject
    private ProductRepository productRepository;

    @Inject
    private CategoryRepository categoryRepository;

    @Override
    public void addProduct(ProductRep product) {
        Product productPers = new Product();
        productPers.setId(0l);
        productPers.setName(product.getName());
        productPers.setCost(product.getCost());
        productPers.setCategory(categoryRepository.getById(product.getCategory().getId()));
        productRepository.merge(productPers);
    }

    @Override
    public void deleteProduct(long id) {
        Product product = productRepository.getById(id);
        productRepository.remove(product);
    }

    @Override
    public void addProdCategory(long id, long catId) {
        Category newCat = categoryRepository.getById(catId);
        Product product = productRepository.getById(id);
        product.setCategory(newCat);
        productRepository.merge(product);
    }

    @Override
    public ProductRep getById(long id){
        Product product = productRepository.getById(id);
        return new ProductRep(product);
    }

    @Override
    public ProductRep getByName(String name){
        Product product = productRepository.getByName(name);
        return new ProductRep(product);
    }

    @Override
    public List<ProductRep> getAll() {
        return productRepository.getAll()
                .stream()
                .map(ProductRep::new)
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductRep> getByCategory(long id) {
        return productRepository.getByCategory(id)
                .stream()
                .map(ProductRep::new)
                .collect(Collectors.toList());
    }
}
