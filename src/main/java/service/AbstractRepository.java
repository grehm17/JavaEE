package service;

import entities.Category;
import entities.EntityId;
import entities.Order;
import entities.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Collection;
import java.util.List;


public abstract class AbstractRepository<T extends EntityId> {

    @PersistenceContext(unitName = "datasource")
    protected EntityManager entityManager;

    protected T getEntity(TypedQuery<T> query) {
        List<T> resultList = query.getResultList();
        if (resultList.isEmpty()) {
            return null;
        }
        return resultList.get(0);
    }

    public abstract T getById(long id);

    public abstract Collection<T> getAll();

    public T merge(T entity) {
        System.out.println("?????????????????????????????????????????????????????????????????????????");
        if (entity == null) {
            return null;
        }

        try {
            return entityManager.merge(entity);
        } catch (Exception ex) {
            throw new IllegalStateException(ex);
        }
    }

    public void remove(T entity) {
        if (entity == null) {
            return;
        }
        try {
            if (entity.getClass() == Product.class){
            Product attached = entityManager.find(Product.class, entity.getId());
            if (attached != null) {
                entityManager.remove(attached);
            }}else if (entity.getClass() == Category.class){
                Category attached = entityManager.find(Category.class, entity.getId());
                if (attached != null) {
                    entityManager.remove(attached);
            }}else if (entity.getClass() == Order.class){
                Order attached = entityManager.find(Order.class, entity.getId());
            if (attached != null) {
                entityManager.remove(attached);
            }}
        } catch (Exception ex) {
            throw new IllegalStateException(ex);
        }
    }
}