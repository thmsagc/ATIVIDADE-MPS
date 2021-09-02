package com.mps.model;

public class Herald {

    private final String nome;
    private String mascotName;
    private String mascotSpecies;

    public Herald(String nome){
        this.nome = nome;
    }

    public String helloMessage(){
        return "[HERALD "+ this.nome +"] Hello, World!";
    }

    public void createMascot(String name, String species){
        this.mascotName = name;
        this.mascotSpecies = species;
    }

    public String presentMascot(){
        if(this.mascotName != null)
            return "[HERALD "+ this.nome +"] My mascot's called " + this.mascotName + ". It's a " + this.mascotSpecies + ".";
        else return "[HERALD "+ this.nome +"] I don't have a mascot.";
    }
}
