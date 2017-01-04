package com.API.entities;



import javax.persistence.*;

/**
 * Created by Niloufar on 12/27/16.
 */
@Entity
public class Restaurant extends BaseEntity{
    private int startHour;
    private int endHour;
    private int phoneNumber;
    @OneToOne
    private Address address;
    @ManyToOne
    private Employee employee;
    @Enumerated(EnumType.STRING)
    private District district;

    public Restaurant() {
        super();
    }

    public int getStartHour() {
        return startHour;
    }

    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    public int getEndHour() {
        return endHour;
    }

    public void setEndHour(int endHour) {
        this.endHour = endHour;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
}
