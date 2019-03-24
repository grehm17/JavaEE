package service;

import entities.Order;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashMap;


@Stateless
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class OrderRepository extends AbstractRepository<Order> implements Serializable {

    @Override
    public Collection<Order> getAll() {
        return entityManager.createQuery("select c from Order c").getResultList();
    }

    @Override
    public Order getById(long id) {
        return entityManager.find(Order.class, id);
    }
}
