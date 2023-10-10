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
public class custclas {
    public SimpleIntegerProperty id;
    private SimpleStringProperty fname;
    private SimpleStringProperty lname;
    private SimpleStringProperty email;
    private SimpleStringProperty pass;

    private SimpleStringProperty city;

    public custclas(Integer id,String fname, String lname, String email, String pass, String city) {
        this.id = new SimpleIntegerProperty(id);
        this.fname = new SimpleStringProperty(fname);
        this.lname = new SimpleStringProperty(lname);
        this.email = new SimpleStringProperty(email);
        this.pass = new SimpleStringProperty(pass);
        this.city = new SimpleStringProperty(city);
    }

    
  
    public int getId() {
        return id.get();
    }

    public String getFname() {
        return fname.get();
    }

    public String getLname() {
        return lname.get();
    }

    public String getEmail() {
        return email.get();
    }

    public String getPass() {
        return pass.get();
    }

    public String getCity() {
        return city.get();
    }

    public void setId(int id) {
        this.id = new SimpleIntegerProperty(id);
    }

    public void setFname(String fname) {
        this.fname = new SimpleStringProperty(fname);
    }

    public void setLname(String lname) {
        this.lname =  new SimpleStringProperty(lname);
    }

    public void setEmail(String email) {
        this.email =  new SimpleStringProperty(email);
    }

    public void setPass(String pass) {
        this.pass =  new SimpleStringProperty(pass);
    }

    public void setCity(String city) {
        this.city =  new SimpleStringProperty(city);
    }

    
    
}
