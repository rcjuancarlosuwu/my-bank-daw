package me.rcjuancarlos.mybankdaw.models;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="accounts")
public class AccountModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;
    private String type;

    @CreationTimestamp
    private Date openedIn;
    private double balance;
    @ManyToOne()
    @JoinColumn(name="holderId", referencedColumnName = "id")
    private HolderModel holder;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getOpenedIn() {
        return openedIn;
    }

    public void setOpenedIn(Date openedIn) {
        this.openedIn = openedIn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public HolderModel getHolder() {
        return holder;
    }

    public void setHolder(HolderModel holder) {
        this.holder = holder;
    }
}
