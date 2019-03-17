package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
@Entity
@Table(name = "orders")
public class Order implements Serializable,EntityId{
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String status;
    @NotNull
    private int number;
    @Override
    public void setId(long id) {
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

    public void setStatus(String name) {
        this.status = name;
    }
    @Override
    public long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

}
