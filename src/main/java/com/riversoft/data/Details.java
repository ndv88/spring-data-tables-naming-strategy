package com.riversoft.data;


import javax.persistence.Entity;

@Entity
public class Details extends Base {

    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
