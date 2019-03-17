package servlets;

import entities.Category;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.DynamicMenuModel;
import org.primefaces.model.menu.MenuItem;
import service.CategoryRepository;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ComponentSystemEvent;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Collection;

@ManagedBean(name = "categories")
@SessionScoped
public class CategoryList {

    @Inject
    private CategoryRepository categoryRepository;

    private Category category;

    private DynamicMenuModel model;

    private Collection<Category> categoryList;

    @PostConstruct
    private void init() {
        model = new DynamicMenuModel();
        categoryList = new ArrayList<>();
        categoryList = categoryRepository.getAll();
    }

    public long getId() {
        return category.getId();
    }

    public void setId(long id) {
        category.setId(id);
    }

    public String getName() {
        return category.getName();
    }

    public void setName(String name) {
        category.setName(name);
    }

    public Category getcategory() {
        return this.category;
    }

    public void setcategory(Category category) {
        this.category = category;
    }

    public Collection<Category> getCategoryList() {
        return categoryRepository.getAll();
    }

    public String editAction(Category category) {
        this.setcategory(category);
        System.out.println(this.category.getId());
        return "/category.xhtml?faces-redirect=true";
    }

    public void deleteAction(Category category) {
        categoryRepository.remove(category);
    }

    public String addAction() {
        this.category = new Category();
        return "/category.xhtml?faces-redirect=true";
    }

    public String saveCategory() {
        categoryRepository.merge(category);
        return "/categorylist.xhtml?faces-redirect=true";
    }

    public Collection<Category> getAll() {
        return categoryList;
    }

    private MenuItem createMenuItem(String id, String name) {
        DefaultMenuItem item = new DefaultMenuItem(name);
        item.setId(id);
        item.setCommand("#{categories.actionSelectCategory}");
        item.setParam("categoryId", id);
        return item;
    }

}