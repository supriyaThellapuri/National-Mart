package com.Centum.NationalMart.dto;

import com.Centum.NationalMart.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


public class OrderRequest {
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public OrderRequest(){

    }

    public OrderRequest(Customer customer) {
        this.customer = customer;
    }
}
