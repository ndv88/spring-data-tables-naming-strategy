package com.riversoft.data;

import javax.persistence.Entity;

@Entity
public class Company extends Base {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
