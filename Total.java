package com.example.myapplication;

import java.io.Serializable;

public class Total implements Serializable {

    int total;


    public Total(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
