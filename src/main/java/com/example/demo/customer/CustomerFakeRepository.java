package com.example.demo.customer;

import java.util.Arrays;
import java.util.List;

//@Repository(value = "fake")
public class CustomerFakeRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "James Bond", "password123", "mefake1@gmail.com"),
                new Customer(2L, "Jamila Ahmed", "password123", "mefake2@gmail.com")
        );
    }

}
