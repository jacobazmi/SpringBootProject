package com.softwareinstitute.jacob.SBProject;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class CatCollection {
    private List<Cat> catCollection = new ArrayList();

    public CatCollection(){
        this.catCollection.add(new Cat("Ella",11));
        this.catCollection.add(new Cat("Lola",3));
        this.catCollection.add(new Cat("Garfield",12));
    }

    public List<Cat> getCatCollection(){
        return this.catCollection;
    }

    public String toString(){
        String json = new Gson().toJson(catCollection);
        return json;
    }
}
