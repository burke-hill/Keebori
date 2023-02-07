package com.Keebori.Keyboards.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pcbs")
public class Pcb {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String color;
    private String material;

    public Pcb(String name, String color, String material) {
        this.name = name;
        this.color = color;
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}