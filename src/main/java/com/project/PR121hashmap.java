package com.project;

import java.io.Serializable;
import java.util.HashMap;

public class PR121hashmap implements Serializable {
    private static final long serialVersionUID = 1L;
    private HashMap<String, Integer> persones;

    public PR121hashmap() {
        this.persones = new HashMap<>();
    }

    public HashMap<String, Integer> getPersones() {
        return persones;
    }

    public void setPersones(HashMap<String, Integer> persones) {
        this.persones = persones;
    }
}
