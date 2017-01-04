package com.API.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * Created by myworklaptopmyworklaptop on 12/27/16.
 */
@Entity
public class Employee {
    private String name;
    @OneToOne
    private Address address;

    public Employee() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
