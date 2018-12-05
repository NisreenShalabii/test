package com.example.demo.resource;

import io.swagger.annotations.ApiModelProperty;

public class User {

        int id ;
    @ApiModelProperty(notes = " this is name of the user")
        String name ;
    @ApiModelProperty(notes = " this is billing of the user ")
        double billing ;

    public User(String name, double billing) {
        this.name = name;
        this.billing = billing;
    }

    public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getBilling() {
            return billing;
        }

        public void setBilling(double billing) {
            this.billing = billing;
        }

        public Electricity requestFromMarket(int mony){
            Electricity x =new Electricity(0,0);
            if(mony==0){
                System.out.println("Error");
                System.out.println("Error 123456778");
            }
            else{

                x.billing = mony;
                x.amount = mony*2;


            }
            return x;

        }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", billing=" + billing +
                '}';
    }
}