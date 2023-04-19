/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mubsi
 */
public class Cars {
    
    private String car_brand;
    private String car_name;
    private String type_of_fuel;
    private String type_of_gear;
    private int car_price;

    public Cars(String car_brand, String car_name, String type_of_fuel, String type_of_gear, int car_price) {
        this.car_brand = car_brand;
        this.car_name = car_name;
        this.type_of_fuel = type_of_fuel;
        this.type_of_gear = type_of_gear;
        this.car_price = car_price;
    }

    public String getCar_brand() {
        return car_brand;
    }

    public void setCar_brand(String car_brand) {
        this.car_brand = car_brand;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public String getType_of_fuel() {
        return type_of_fuel;
    }

    public void setType_of_fuel(String type_of_fuel) {
        this.type_of_fuel = type_of_fuel;
    }

    public String getType_of_gear() {
        return type_of_gear;
    }

    public void setType_of_gear(String type_of_gear) {
        this.type_of_gear = type_of_gear;
    }

    public int getCar_price() {
        return car_price;
    }

    public void setCar_price(int car_price) {
        this.car_price = car_price;
    }
    
}
