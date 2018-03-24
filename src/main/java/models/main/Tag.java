package models.main;

import models.interfaces.IModel;

public class Tag implements IModel {

    private Integer id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getId() {
        return null;
    }
}
