package entities;

public class Order {

    private int id;
    private String status;
    private int number;


    public void setId(int id) {
        this.id = id;
    }

    public Order() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Order(int id) {
        setId(id);
        setNumber(id*1000+id);
        setStatus("Created");

    }

    public void setStatus(String name) {
        this.status = name;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

}
