import Railcars.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    private RailwaySystem system = new RailwaySystem();
    private Scanner input = new Scanner(System.in);
    public void showMenu(){

        System.out.println("Welcome in railway system simulator");


        while (true)
        {

            System.out.println("1. Add new train");
            System.out.println("2. Add new railcar");
            System.out.println("3. Add new railway station");
            System.out.println("4. Assign railcar to train");
            System.out.println("5. List all trains");
            System.out.println("6. List all railcars");
            System.out.println("7. List all railway stations");
            System.out.println("8. List all available trains");
            System.out.println("9. Exit");

            System.out.print("Type option number:");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice)
            {
                case 1 -> { addNewTrain(); }
                case 2 -> { addNewRailcar(); }
                case 3 -> {}
                case 4 -> {}
                case 5 -> { listAllTrains(); }
                case 6 -> {}
                case 7 -> {}
                case 8 -> { listAllAvailableTrains(); }
                case 9 -> {
                    System.out.println("Closing simulation...");
                    return;
                }
            }
        }
    }

    private void addNewTrain(){

        String name;
        int maxWeight;
        int maxQuantity;
        int maxElectricalRailcars;

        System.out.print("Type train name:");
        name = input.nextLine();
        System.out.println("Type max weight:");
        maxWeight = Integer.parseInt(input.nextLine());
        System.out.println("Type max railcars quantity:");
        maxQuantity = Integer.parseInt(input.nextLine());
        System.out.println("Type max electrical railcars quantity:");
        maxElectricalRailcars = Integer.parseInt(input.nextLine());

        Train newTrain = new Train(name, maxWeight, maxQuantity, maxElectricalRailcars);
        system.addTrain(newTrain);

        System.out.println("Succesfulyy added new train \"" + newTrain.getName() + "\"");
    }

    private void listAllTrains(){
        ArrayList<Train> trains = system.getAllTrains();

        System.out.println("[LIST OF ALL TRAINS]");

        int index = 1;
        for(Train t : trains)
        {
            System.out.println("[" + index + "] " + t.toString());
            index++;
        }
    }

    private void listAllAvailableTrains(){
        ArrayList<Train> trains = system.getAllAvailableTrains();

        System.out.println("[LIST OF AVAILABLE TRAINS]");

        int index = 1;
        for(Train t : trains)
        {
            System.out.println("[" + index + "] " + t.toString());
            index++;
        }
    }

    private void addNewRailcar(){

        // pytac do ktorego pociagu podlaczac


        int weight;

        ArrayList<String> railcarTypes = new ArrayList<String>();
        railcarTypes.add("PASSENGER");
        railcarTypes.add("POSTAL");
        railcarTypes.add("PORTERPOSTAL");
        railcarTypes.add("RESTAURANT");
        railcarTypes.add("CARGO");
        railcarTypes.add("CARGOPLUS");
        railcarTypes.add("REFRIGATOR");
        railcarTypes.add("LIQUIDTANK");
        railcarTypes.add("GASTANK");
        railcarTypes.add("EXPLOSIVES");
        railcarTypes.add("TOXICMATERIALS");
        railcarTypes.add("TOXICLIQUIDS");

        System.out.println("Chose railcar type:");
        System.out.print("[ ");
        for (String rt : railcarTypes) {
            System.out.print(rt + " ");
        }
        System.out.println("]");


        String choice = input.nextLine();
        switch ( choice ){
            case "PASSENGER" -> {
                int numberOfSeats;
                boolean isFirstClass = false;
                boolean isCompartmentCar = false;
                boolean isSleeper = false;
                System.out.print("Type railcar weight:");
                weight = Integer.parseInt(input.nextLine());
                System.out.print("Type number of seats:");
                numberOfSeats = Integer.parseInt(input.nextLine());
                System.out.print("Is first class?");
                String temp1 = input.nextLine();
                if(temp1.equals("yes")) isFirstClass = true;
                System.out.print("Are there compartments?");
                String temp2 = input.nextLine();
                if(temp2.equals("yes")) {
                    isCompartmentCar = true;
                }
                System.out.print("Is it sleeper?");
                String temp3 = input.nextLine();
                if(temp3.equals("yes")) isSleeper = true;

                RailcarPassenger passenger = new RailcarPassenger(weight, numberOfSeats, isFirstClass, isCompartmentCar, isSleeper);
                System.out.println("Succesfulyy added new passenger railcar!");

            }
            case "POSTAL" -> {
                int parcelsAmount;
                int maxParcels;
                int weightNetto;
                int weightBrutto;

                System.out.print("Type railcar weight:");
                weight = Integer.parseInt(input.nextLine());
                System.out.print("Type amount of parcels:");
                parcelsAmount = Integer.parseInt(input.nextLine());
                System.out.print("Type max amount of parcels:");
                maxParcels = Integer.parseInt(input.nextLine());
                System.out.print("Type weight netto:");
                weightNetto = Integer.parseInt(input.nextLine());
                System.out.print("Type weight brutto:");
                weightBrutto = Integer.parseInt(input.nextLine());
                RailcarPostal postal = new RailcarPostal(weight, parcelsAmount, maxParcels, weightNetto, weightBrutto);
                System.out.println("Succesfulyy added new postal railcar!");


            }
            case "PORTERPOSTAL" -> {
                int parcelsAmount;
                int maxParcels;
                int packageAmount;
                int maxPackage;
                int weightNetto;
                int weightBrutto;


                System.out.print("Type railcar weight:");
                weight = Integer.parseInt(input.nextLine());
                System.out.print("Type amount of parcels:");
                parcelsAmount = Integer.parseInt(input.nextLine());
                System.out.print("Type max amount of parcels:");
                maxParcels = Integer.parseInt(input.nextLine());
                System.out.print("Type amount of packages:");
                packageAmount = Integer.parseInt(input.nextLine());
                System.out.print("Type max amount of packages:");
                maxPackage = Integer.parseInt(input.nextLine());
                System.out.print("Type weight netto:");
                weightNetto = Integer.parseInt(input.nextLine());
                System.out.print("Type weight brutto:");
                weightBrutto = Integer.parseInt(input.nextLine());
                RailcarPorterPostal porterPostal = new RailcarPorterPostal(weight, parcelsAmount, maxParcels, packageAmount, maxPackage, weightNetto, weightBrutto);
                System.out.println("Succesfulyy added new porter-postal railcar!");

            }
            case "RESTAURANT" -> {
                int numberOfSeats;
                int numberOfEmployees;
                int numberOfTables;

                System.out.print("Type railcar weight:");
                weight = Integer.parseInt(input.nextLine());
                System.out.print("Type number of seats:");
                numberOfSeats = Integer.parseInt(input.nextLine());
                System.out.print("Type number of employees:");
                numberOfEmployees = Integer.parseInt(input.nextLine());
                System.out.print("Type number of tables:");
                numberOfTables = Integer.parseInt(input.nextLine());
                RailcarRestaurant restaurant = new RailcarRestaurant(weight, numberOfSeats, numberOfEmployees, numberOfTables);
                System.out.println("Succesfulyy added new porter-postal railcar!");

            }
            case "CARGO" -> {
                int maxAvailableSpace;
                int currentUsedSpace=0;
                int maxGoodsWeight;
                int currentGoodsWeight=0;
                boolean temp3 = true;
                boolean temp4 = true;

                System.out.print("Type railcar weight:");
                weight = Integer.parseInt(input.nextLine());
                System.out.print("Type max available space:");
                maxAvailableSpace = Integer.parseInt(input.nextLine());
                while (temp3) {
                    System.out.print("Type used space:");
                    currentUsedSpace = Integer.parseInt(input.nextLine());
                    if (!(currentUsedSpace>maxAvailableSpace)) temp3 = false;
                }
                System.out.print("Type max goods weight:");
                maxGoodsWeight = Integer.parseInt(input.nextLine());
                while (temp4) {
                    System.out.print("Type current goods weight:");
                    currentGoodsWeight = Integer.parseInt(input.nextLine());
                    if (!(currentGoodsWeight>maxGoodsWeight)) temp4 = false;
                }
                RailcarCargo cargo = new RailcarCargo(weight, maxAvailableSpace, currentUsedSpace, maxGoodsWeight, currentGoodsWeight);
                System.out.println("Succesfulyy added new cargo railcar!");


            }
            case "CARGOPLUS" -> {
                int maxAvailableSpace;
                int currentUsedSpace=0;
                int maxGoodsWeight;
                int currentGoodsWeight=0;
                boolean temp5 = true;
                boolean temp6 = true;

                System.out.print("Type railcar weight:");
                weight = Integer.parseInt(input.nextLine());
                System.out.print("Type max available space:");
                maxAvailableSpace = Integer.parseInt(input.nextLine());
                while (temp5) {
                    System.out.print("Type used space:");
                    currentUsedSpace = Integer.parseInt(input.nextLine());
                    if (!(currentUsedSpace>maxAvailableSpace)) temp5 = false;
                }
                System.out.print("Type max goods weight:");
                maxGoodsWeight = Integer.parseInt(input.nextLine());
                while (temp6) {
                    System.out.print("Type current goods weight:");
                    currentGoodsWeight = Integer.parseInt(input.nextLine());
                    if (!(currentGoodsWeight>maxGoodsWeight)) temp6 = false;
                }
                RailcarCargo cargo = new RailcarCargo(weight, maxAvailableSpace, currentUsedSpace, maxGoodsWeight, currentGoodsWeight);
                System.out.println("Succesfulyy added new porter-postal railcar!");
            }
            case "REFRIGATOR" -> {}
            case "LIQUIDTANK" -> {}
            case "GASTANK" -> {}
            case "EXPLOSIVES" -> {}
            case "TOXICMATERIALS" -> {}
            case "TOXICLIQUIDS" -> {}
        }


    }





}
