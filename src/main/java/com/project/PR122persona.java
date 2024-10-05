package com.project;

import java.io.Serializable;

public class PR122persona implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nom;
    private String cognom;
    private int edat;

    public PR122persona(String nom, String cognom, int edat){
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    public String getCognom() {
        return cognom;
    }
    public int getEdat() {
        return edat;
    }
    public String getNom() {
        return nom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }
    public void setEdat(int edat) {
        this.edat = edat;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Nom: "+nom+" "+cognom+"\nEdat: "+edat+" anys";
    }
}
