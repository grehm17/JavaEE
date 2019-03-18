package servlets;

import interceptors.DefaultLogger;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.interceptor.Interceptors;

@ManagedBean(name = "main")
@SessionScoped
public class MainBean {

    @EJB
    private ProductList products;

    @EJB
    private OrderList orders;

    @EJB
    private CategoryList categories;

    public ProductList getProducts(){
        return this.products;
    }
    @Interceptors({DefaultLogger.class})
    public String showProductList(){
        return "/productlist.xhtml?faces-redirect=true";
    }

    public OrderList getOrders(){
        return this.orders;
    }
    @Interceptors({DefaultLogger.class})
    public String showOrdersList(){
        return "/orderlist.xhtml?faces-redirect=true";
    }

    public CategoryList getCategories(){
        return this.categories;
    }

    public String showCategoriesList(){
        return "/categorylist.xhtml?faces-redirect=true";
    }


}