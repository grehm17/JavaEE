package webservices;

import entities.representations.CategoryRep;
import entities.representations.ProductRep;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface ServiceInterface {

    @WebMethod
    void addProduct(ProductRep product);

    @WebMethod
    void deleteProduct(long id);

    @WebMethod
    void addProdCategory(long id, long catId);

    @WebMethod
    ProductRep getById(long id);

    @WebMethod
    ProductRep getByName(String name);

    @WebMethod
    List<ProductRep> getAll();

    @WebMethod
    List<ProductRep> getByCategory(long id);

}
