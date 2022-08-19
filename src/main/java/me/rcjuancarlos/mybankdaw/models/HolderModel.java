package me.rcjuancarlos.mybankdaw.models;

import java.util.Collection;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="holders")
public class HolderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;
    private String name;
    private String city;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "holder")
    @JsonIgnoreProperties(value = {"holder"})
    private Collection<AccountModel> accounts;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Collection<AccountModel> getAccounts() {
        return accounts;
    }

    public void setAccounts(Collection<AccountModel> accounts) {
        this.accounts = accounts;
    }
}
