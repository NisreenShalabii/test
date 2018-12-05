package com.example.demo.resource;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import io.swagger.annotations.ApiModelProperty;

public class Electricity {
    @ApiModelProperty(notes = " this is billing of the requested electricity")
    int billing ;
    @ApiModelProperty(notes = " this is amount of the requested electricity")
    int amount;

    public Electricity(int billing, int amount) {
        this.billing = billing;
        this.amount = amount;
    }

    public Electricity() {
    }  
    
    public int getBilling() {
        return billing;
    }

    public void setBilling(int billing) {
        this.billing = billing;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    
    
            
    
}
