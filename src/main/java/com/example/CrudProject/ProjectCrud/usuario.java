package com.example.CrudProject.ProjectCrud;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  id;
    private String nome;
    private String email;



    public String getNome(){
        return nome;
    }

    public String setNome(String name){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public String setEmail(String name){
        return email;
    }


}
