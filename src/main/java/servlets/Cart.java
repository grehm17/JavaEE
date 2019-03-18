package servlets;

import entities.Product;
import interceptors.DefaultLogger;
import org.primefaces.model.menu.DynamicMenuModel;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.interceptor.Interceptors;
import java.io.Serializable;
import java.util.ArrayList;

@Stateful(name = "cart")
public class Cart implements Serializable {
    private ArrayList<Product> CartList ;

    @PostConstruct
    private void init() {
        CartList = new ArrayList<>();
    }
    @Interceptors({DefaultLogger.class})
    public void addProduct(Product prod){
        CartList.add(prod);
    }
    @Interceptors({DefaultLogger.class})
    public void removeProduct(Product prod){
        CartList.remove(prod);
    }
    @Interceptors({DefaultLogger.class})
    public String returnToList(){
        return "/productlist.xhtml?faces-redirect=true";
    }

    public ArrayList<Product> getCartList() {
        return CartList;
    }
}
