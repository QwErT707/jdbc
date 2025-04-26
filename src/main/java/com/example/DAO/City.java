package com.example.DAO;

import jakarta.persistence.*;

@Entity
@Table(name="city")
public class City {

    private int id_city;
    private String name_city;
    private int id_country;

    public String climate;


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="id_city")
    public int getId_city() {
        return id_city;
    }

    public void setId_city(int id_city) {
        this.id_city = id_city;
    }

    @Column(name="name_city")
    public String getName_city() {
        return name_city;
    }

    public void setName_city(String name_city) {
        this.name_city = name_city;
    }

    @Column(name="id_country")
    public int getId_country() {
        return id_country;
    }

    public void setId_country(int id_country) {
        this.id_country = id_country;
    }

    @Column(name="Climate")
    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    @Override
   public String toString(){
        return String.format("%-3d %-50s %4d",
        getId_city(),getName_city(),getId_country(), getClimate());
    }
}
