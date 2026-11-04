package io.uprunning.coffee.entity;


import java.util.UUID;

public class Coffee{
    private final String id;
    private String name;

    public Coffee(String id,String name) { //constructor
        this.id=id;
        this.name=name;
    }
    public Coffee(String name ) {  //constructor with one argument, name, automatically id generated
        this(UUID.randomUUID().toString(),name);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }


}