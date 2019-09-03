package ife.elijah.movieStudio;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name, email;
    private int age, customerBill;
    private List<Movies> myCustomerMovies = new ArrayList<>();

    public Customer() {

    }

    public int getCustomerBill() {
        return customerBill;
    }

    public List<Movies> getMyCustomerMovies() {
        return myCustomerMovies;
    }

    public void setMyCustomerMovies(List<Movies> myCustomerMovies) {
        this.myCustomerMovies = myCustomerMovies;
    }

    public void setCustomerBill(int customerBill) {
        this.customerBill = customerBill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
