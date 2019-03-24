import webservices.CategoryRep;
import webservices.NewMainServiceService;
import webservices.ProductRep;
import webservices.ServiceInterface;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Client {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/HW4/NewMainService?WSDL");
        NewMainServiceService MainServiceService = new NewMainServiceService(url);
        ServiceInterface serviceInterface = MainServiceService.getNewMainServicePort();

        CategoryRep category = new CategoryRep();
        category.setId(1l);
        category.setName("main");
        ProductRep product = new ProductRep();
        product.setId(100l);
        product.setCategory(category);
        product.setCost(1000);
        product.setName("NewProd");

        serviceInterface.addProduct(product);
        serviceInterface.addProdCategory(1l,1l);
        ArrayList<ProductRep> prodList = (ArrayList) serviceInterface.getAll();
        System.out.println(prodList);
        prodList = (ArrayList) serviceInterface.getByCategory(1);
        System.out.println(prodList);
        ProductRep testProd = serviceInterface.getById(1l);
        System.out.println(testProd);
        testProd = serviceInterface.getByName("NewProd");
        System.out.println(testProd);
        serviceInterface.deleteProduct(1l);
    }

}
