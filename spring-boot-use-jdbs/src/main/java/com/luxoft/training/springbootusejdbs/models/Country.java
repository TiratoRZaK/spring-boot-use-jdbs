package com.luxoft.training.springbootusejdbs.models;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class Country implements Serializable{

    private static final long serialVersionUID = 1L;

    private int id;

    private String name;

    private String codeName;

    public Country(String name, String codeName) {
        this.name = name;
        this.codeName = codeName;
    }

    public String toString() {
        return id + ". " + name + " (" + codeName + ")";
    }
}
