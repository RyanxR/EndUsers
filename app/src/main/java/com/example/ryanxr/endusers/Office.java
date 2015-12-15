package com.example.ryanxr.endusers;

/**
 * Created by kappie on 15-12-2015.
 */
public class Office {
    private int tel;
    private String name;
    private String address;

    public Office(){
        super();
    }

    public Office(int tel, String name, String address) {
        super();
        this.tel = tel;
        this.name = name;
        this.address = address;
    }

    public int getTel() {
        return this.tel;
    }
    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }
}
