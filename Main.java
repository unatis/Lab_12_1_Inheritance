package com.company;

public class Main {

    public static void main(String[] args) {

         Car Mercedes = new Car();
         Mercedes.BrandName = "MGM";
         Mercedes.Type = "sport";
         Mercedes.CarModel = "SLK 320";
         Mercedes.MotorType = "disel";
         Mercedes.Drive();
         Mercedes.Brake();

        Bicycle bike = new Bicycle();
        bike.BrandName = "Specialized";
        bike.Type = "Montain";
        bike.BikeModel = "sp10";
        bike.Drive();
    }

}
