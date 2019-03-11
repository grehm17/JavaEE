package servlets;


import entities.Order;
import service.OrderRepository;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.Collection;

@ManagedBean(name = "orders")
@SessionScoped
public class OrderList {

    @Inject
    private OrderRepository orderRepository;

    private Order order;

    public Integer getId() {
        return order.getId();
    }

    public void setId(Integer id) {
        order.setId(id);
    }

    public Integer getNumber() {
        return order.getNumber();
    }

    public void setNumber(Integer numb) {
        order.setNumber(numb);
    }

    public String getStatus() {
        return order.getStatus();
    }

    public void setStatus(String status) {
        order.setStatus(status);
    }
    
    public Order getOrder() {
        return this.order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Collection<Order> getOrderList() {
        return orderRepository.getAll();
    }

    public String editAction(Order order) {
        this.setOrder(order);
        System.out.println(this.order.getId());
        return "/order.xhtml?faces-redirect=true";
    }
    
    public String saveOrder() {
        orderRepository.save(order);
        return "/orderlist.xhtml?faces-redirect=true";
    }
}