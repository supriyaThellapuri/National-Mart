package com.Centum.NationalMart.repository;


import com.Centum.NationalMart.dto.OrderResponse;
import com.Centum.NationalMart.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer>
{
    @Query("SELECT new com.Centum.NationalMart.dto.OrderResponse(c.customername,p.productname) FROM Customer c JOIN c.product p")
    public List<OrderResponse> getJoinInformation();
}
