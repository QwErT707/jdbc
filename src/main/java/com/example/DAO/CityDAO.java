package com.example.DAO;

import java.util.List;

public interface CityDAO {

    City findById(int id_city);
    List<City> findAll();
  List<City> findByTitle(String name_city);
    void insert(City city);
    void update(City city);
    void delete(int id_city);
}
