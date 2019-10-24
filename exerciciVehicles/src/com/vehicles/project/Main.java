package com.vehicles.project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main (String[] args) throws Exception {
        System.out.println("Please insert C for car or B for Bike");
        String typeOfVehicle = "b";

        if (typeOfVehicle == "c" || typeOfVehicle == "C" ) {
            Car customerCar = new Car("1a4h5mw", "ford", "blue");
            System.out.println("Your car is a " + customerCar.brand + ", color " + customerCar.color + ", license plate number " + customerCar.plate);
            //ask for wheels brand and diameter to user
            Wheel frontWheelsL = new Wheel("Goodyear", 0.4);
            Wheel frontWheelsR = new Wheel("Goodyear", 0.4);
            Wheel rearWheelsL = new Wheel("Michelin", 4);
            Wheel rearWheelsR = new Wheel("Michelin", 4);
            //create a list to group left and right front wheels in same list
            List<Wheel> frontWheel = new ArrayList<>();
            frontWheel.add(frontWheelsL);
            frontWheel.add(frontWheelsR);
            //create a list to group left and right rear wheels in same list
            List<Wheel> rearWheel = new ArrayList<>();
            rearWheel.add(rearWheelsL);
            rearWheel.add(rearWheelsR);
            //call Car.addwheels to verify the wheels information according to our criteria
            Car.addWheels(frontWheel,rearWheel);
        } else if (typeOfVehicle=="b" || typeOfVehicle=="B"){
            Bike customerBike = new Bike("1a4h5mw", "Yamaha", "Red");
            System.out.println("Your bike is a " + customerBike.brand + ", color " + customerBike.color + ", license plate number " + customerBike.plate);
            //ask for wheels brand and diameter to user
            Wheel bikeFrontWheels = new Wheel("Goodyear", 0.4);
            Wheel bikeRearWheels = new Wheel("Goodyear", 4);
            List<Wheel> frontWheels = new ArrayList<>();
            frontWheels.add(bikeFrontWheels);
            List<Wheel> rearWheels = new ArrayList<>();
            rearWheels.add(bikeRearWheels);
            Bike.addWheels(frontWheels,rearWheels);
        }else {
            System.out.println("This is not a valid type of vehicle, please insert C for car or B for Bike");
            throw new Exception();
        }
    }
}
