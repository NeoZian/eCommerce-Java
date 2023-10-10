/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author DCL
 */
public class classOrder {
    
   private SimpleStringProperty name;
   private SimpleStringProperty num;
   private SimpleStringProperty street;
   private SimpleStringProperty city;
   private SimpleStringProperty country;
   private SimpleIntegerProperty id;

    public classOrder(String name, String num, String street, String city, String country, Integer id) {
        this.name =new SimpleStringProperty( name);
        this.num =new SimpleStringProperty(num);
        this.street = new SimpleStringProperty(street);
        this.city = new SimpleStringProperty(city);
        this.country =new SimpleStringProperty(country);
        this.id = new SimpleIntegerProperty(id);
    }

    public String getName() {
        return name.get();
    }

    public String getNum() {
        return num.get();
    }

    public String getStreet() {
        return street.get();
    }

    public String getCity() {
        return city.get();
    }

    public String getCountry() {
        return country.get();
    }

    public Integer getId() {
        return id.get();
    }

    public void setName(String name) {
        this.name = new SimpleStringProperty( name);
    }

    public void setNum(String num) {
        this.num = new SimpleStringProperty(num);
    }

    public void setStreet(String street) {
        this.street = new SimpleStringProperty( street);
    }

    public void setCity(String city) {
        this.city = new SimpleStringProperty( city);
    }

    public void setCountry(String country) {
        this.country = new SimpleStringProperty( country);
    }

    public void setId(Integer id) {
        this.id = new SimpleIntegerProperty(id);
    }
    
    
    
}
