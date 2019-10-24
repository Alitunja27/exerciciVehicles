package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public class Bike extends Vehicle {
    Integer i,letter, number;
	public Bike(String plate, String brand, String color) throws Exception {
	    super(plate, brand, color);// It's calling from Vehicle class the Vehicle class
                                   // because it have the same parameters

        //the license plate should have 4 numbers and 2 or 3 numbers
        List<Character> licensePlate = new ArrayList<>();
        for (char ch : plate.toCharArray()) {//to load the list licensePlate with characters of plate

            licensePlate.add(ch);
        }
        letter = number = 0;
        for (i = 0; i < licensePlate.size(); i++) {
            if (((licensePlate.get(i) >= 'A') && (licensePlate.get(i) <= 'Z')) ||
                    ((licensePlate.get(i) >= 'a') && (licensePlate.get(i) <= 'z'))) {
                letter = letter + 1;
            } else if (Character.isDigit(licensePlate.get(i)) == true) {
                number = number + 1;
            } else {
                System.out.println("This license plate contain a character that is not a number or a letter");
                throw new Exception();
            }
        }
        if (letter + number >= 6 || letter + number <= 7) {
            if (letter == 4) {
                if (number >= 2 && number <= 3) {
                    System.out.println("This license plate is valid");
                } else {
                    System.out.println("This license plate is not valid");
                    throw new Exception();
                }
            } else {
                System.out.println("This license plate is not valid");
                throw new Exception();
            }
        }
    }

    public static void addWheels(List<Wheel> frontWheels, List<Wheel> rearWheels) throws Exception {
        addTwoWheels(frontWheels);
        addTwoWheels(rearWheels);
    }

    public static void addTwoWheels(List<Wheel> wheels) throws Exception {

        if (wheels.size() != 1)
            throw new Exception();
        Wheel frontWheel = wheels.get(0);

        //diameter should be between 0.4 and 4

        double diameterMin = 0.4;
        double diameterMax = 4;
        if (Double.compare(frontWheel.diameter, diameterMin) == 1) {
            if (Double.compare(frontWheel.diameter, diameterMin) == 0) {
                if (Double.compare(frontWheel.diameter, diameterMax) == -1) {
                    if (Double.compare(frontWheel.diameter, diameterMax) == 0) {
                    } else {
                        System.out.println("The diameter is not between 0.4 and 4");
                        throw new Exception();
                    }
                }
            }
        }
        wheels.add(frontWheel);
    }

}


