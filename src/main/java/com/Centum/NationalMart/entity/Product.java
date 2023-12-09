package com.Centum.NationalMart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int pid;
    public String productname;
    public String productqty;
    public String productprice;
    public String promoprice;
    public Date promostart;
    public Date promoend;
    public String description;

    public Product(int pid, String productname, String productqty, String productprice, String promoprice, Date promostart, Date promoend, String description) {
        this.pid = pid;
        this.productname = productname;
        this.productqty = productqty;
        this.productprice = productprice;
        this.promoprice = promoprice;
        this.promostart = promostart;
        this.promoend = promoend;
        this.description = description;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductqty() {
        return productqty;
    }

    public void setProductqty(String productqty) {
        this.productqty = productqty;
    }

    public String getProductprice() {
        return productprice;
    }

    public void setProductprice(String productprice) {
        this.productprice = productprice;
    }

    public String getPromoprice() {
        return promoprice;
    }

    public void setPromoprice(String promoprice) {
        this.promoprice = promoprice;
    }

    public Date getPromostart() {
        return promostart;
    }

    public void setPromostart(Date promostart) {
        this.promostart = promostart;
    }

    public Date getPromoend() {
        return promoend;
    }

    public void setPromoend(Date promoend) {
        this.promoend = promoend;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
