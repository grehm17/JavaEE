package entities;

public class Product {

    private int id;
    private String name;
    private float cost;
    private String description;

    public void setId(int id) {
        this.id = id;
    }

    public Product() {
    }

    public Product(int id) {
        setId(id);
        setName("Product" + id);
        setCost(1000*id);
        setDescription("This is Product №"+id);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }
}
