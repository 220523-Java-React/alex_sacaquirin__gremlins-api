package com.revature.model;

import java.io.Serializable;
import java.util.Objects;

public class Gremlin implements Serializable {
    private String name;
    private Integer age;
    private String color;
    private Boolean isEvil;

    public Gremlin(){
    }

    public Gremlin(String name, Integer age, String color, Boolean isEvil) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.isEvil = isEvil;
    }

    public String getName() {
        return name;
    }

    public Gremlin setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Gremlin setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Gremlin setColor(String color) {
        this.color = color;
        return this;
    }

    public Boolean getIsEvil() {
        return isEvil;
    }

    public Gremlin setEvil(Boolean evil) {
        isEvil = evil;
        return this;
    }

    @Override
    public String toString() {
        return "gremlin{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", isEvil=" + isEvil +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gremlin)) return false;
        Gremlin gremlin = (Gremlin) o;
        return Objects.equals(name, gremlin.name) && Objects.equals(age, gremlin.age) && Objects.equals(color, gremlin.color) && Objects.equals(isEvil, gremlin.isEvil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color, isEvil);
    }


}