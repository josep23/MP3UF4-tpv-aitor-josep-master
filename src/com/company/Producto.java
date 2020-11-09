package com.company;

public class Producto {

    private int id;
    private String nom;
    private float preu;

    public Producto(int id, String nom, float preu) {
        this.id = id;
        this.nom = nom;
        this.preu = preu;
    }

    public Producto() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", preu=" + preu +
                '}';
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPreu() {
        return preu;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }
}
