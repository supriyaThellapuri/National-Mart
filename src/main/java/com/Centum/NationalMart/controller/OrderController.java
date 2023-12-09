package com.Centum.NationalMart.controller;

import com.Centum.NationalMart.dto.OrderRequest;
import com.Centum.NationalMart.dto.OrderResponse;
import com.Centum.NationalMart.entity.Customer;
import com.Centum.NationalMart.repository.CustomerRepository;
import com.Centum.NationalMart.repository.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/NationalMart")
public class OrderController {
    @Autowired
    private CustomerRepository customerrepository;
    @Autowired
    private ProductRepository productrepository;
    @PostMapping("/orderyourproducts")
    public Customer placeOrder(@RequestBody OrderRequest request){
        return customerrepository.save(request.getCustomer());
    }
    @GetMapping("findallorders")
    public List<Customer> findAllOrders(){
        return customerrepository.findAll();
    }
    @GetMapping("/getinfo")
    public List<OrderResponse>getjoinInformation(){
        return customerrepository.getJoinInformation();
    }


}
