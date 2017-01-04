package com.API.entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by myworklaptopmyworklaptop on 12/27/16.
 */
@Entity
public class Manager extends Employee {

    @OneToMany(mappedBy = "manager")
    private List<Employee> employees;

    public Manager() {
        super();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
