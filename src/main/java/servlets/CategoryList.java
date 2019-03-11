package servlets;

import entities.Category;
import service.CategoryRepository;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.Collection;

@ManagedBean(name = "categories")
@SessionScoped
public class CategoryList {

    @Inject
    private CategoryRepository categoryRepository;

    private Category category;

    public Integer getId() {
        return category.getId();
    }

    public void setId(Integer id) {
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
        categoryRepository.delete(category);
    }

    public String addAction() {
        this.category = new Category();
        return "/category.xhtml?faces-redirect=true";
    }

    public String saveCategory() {
        System.out.println("<<<<>>>>> " +this.category.getId());
        categoryRepository.save(category);
        return "/categorylist.xhtml?faces-redirect=true";
    }
}