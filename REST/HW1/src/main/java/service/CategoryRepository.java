package service;

import entities.Category;


import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import java.io.Serializable;
import java.util.Collection;

@Stateless
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class CategoryRepository extends AbstractRepository<Category> implements Serializable {

    @Override
    public Collection<Category> getAll() {
        return entityManager.createQuery("select c from Category c").getResultList();
    }

    @Override
    public Category getById(long id) {
        return entityManager.find(Category.class, id);
    }
}
