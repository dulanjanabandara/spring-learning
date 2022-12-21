package com.example.demo.customer;

import java.util.Collections;
import java.util.List;

//@Repository
//@Primary
public class CustomerRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        // TODO connect to real db
        // return Collections.emptyList();
        return Collections.singletonList(
                new Customer(1L, "TODO. Implement real db.", "password123", "me@gmail.com")
        );
    }
}
