package entities;

public class Category {

    private int id;
    private String name;


    public void setId(int id) {
        this.id = id;
    }

    public Category() {
    }

    public Category(int id) {
        setId(id);
        setName("Category" + id);

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
