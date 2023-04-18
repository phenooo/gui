import Railcars.*;
import java.util.ArrayList;
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
            System.out.println("9. List all available railcars");
            System.out.println("10. Exit");

            System.out.print("Type option number:");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice)
            {
                case 1 -> { addNewTrain(); }
                case 2 -> { addNewRailcar(); }
                case 3 -> {}
                case 4 -> {}
                case 5 -> { listAllTrains(); }
                case 6 -> { listAllRailcars();}
                case 7 -> { addRailcarToTrain();}
                case 8 -> { listAllAvailableTrains(); }
                case 9 -> { listAllAvailableRailcars(); }
                case 10 -> {
                    System.out.println("Closing simulation...");
                    return;
                }
            }
        }
    }

    private void addRailcarToTrain() {
        Train temp = new Train();
        String name;
        System.out.println("To which train you want connect railcars? Type name");
        name = input.nextLine();



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
        System.out.print("[ ");
        for (RailcarType rt : RailcarType.values()) {
            System.out.print(rt + " ");
        }
        System.out.println("]");

        System.out.println("Chose railcar type:");
        String choice = input.nextLine();
        switch ( choice ){
            case "PASSENGER" -> {
                addingPassenger();
            }
            case "POSTAL" -> {
               addingPostal();
            }
            case "PORTERPOSTAL" -> {
                addingPorterPostal();
            }
            case "RESTAURANT" -> {
                addingRestaurant();
            }
            case "CARGO" -> {
                addingCargo();
            }
            case "CARGOPLUS" -> {
                addingCargoPlus();
            }
            case "REFRIGATOR" -> {
                addingRefrigator();
            }
            case "LIQUIDTANK" -> {
                addingLiquidTank();
            }
            case "GASTANK" -> {
                addingGasTank();
            }
            case "EXPLOSIVES" -> {
                addingExplosives();
            }
            case "TOXICMATERIALS" -> {
                addingToxicMaterials();
            }
            case "TOXICLIQUIDS" -> {}
        }


    }

    private void addingPassenger(){
        int weight;
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
        system.addRailcar(passenger);
        System.out.println("Succesfulyy added new passenger railcar!");
    }
    private void addingPostal(){
        int weight;
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
        system.addRailcar(postal);
        System.out.println("Succesfulyy added new postal railcar!");
    }
    private void addingPorterPostal(){
        int weight;
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
        system.addRailcar(porterPostal);
        System.out.println("Succesfulyy added new porter-postal railcar!");
    }
    private void addingRestaurant(){
        int weight;
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
        system.addRailcar(restaurant);
        System.out.println("Succesfulyy added new porter-postal railcar!");
    }
    private void addingCargo(){
        int weight;
        int maxAvailableSpace;
        int currentUsedSpace=0;
        int maxGoodsWeight;
        int currentGoodsWeight=0;
        boolean temp1 = true;
        boolean temp2 = true;

        System.out.print("Type railcar weight:");
        weight = Integer.parseInt(input.nextLine());
        System.out.print("Type max available space:");
        maxAvailableSpace = Integer.parseInt(input.nextLine());
        while (temp1) {
            System.out.print("Type used space:");
            currentUsedSpace = Integer.parseInt(input.nextLine());
            if (!(currentUsedSpace>maxAvailableSpace)) temp1 = false;
        }
        System.out.print("Type max goods weight:");
        maxGoodsWeight = Integer.parseInt(input.nextLine());
        while (temp2) {
            System.out.print("Type current goods weight:");
            currentGoodsWeight = Integer.parseInt(input.nextLine());
            if (!(currentGoodsWeight>maxGoodsWeight)) temp2 = false;
        }
        RailcarCargo cargo = new RailcarCargo(RailcarType.REFRIGATOR, weight, maxAvailableSpace, currentUsedSpace, maxGoodsWeight, currentGoodsWeight);
        system.addRailcar(cargo);
        System.out.println("Succesfulyy added new cargo railcar!");
    }
    private void addingCargoPlus(){
        int weight;
        int maxAvailableSpace;
        int currentUsedSpace=0;
        int maxGoodsWeight;
        int currentGoodsWeight=0;
        int additionalCompartments;
        boolean temp1 = true;
        boolean temp2 = true;

        System.out.print("Type railcar weight:");
        weight = Integer.parseInt(input.nextLine());
        System.out.print("Type max available space:");
        maxAvailableSpace = Integer.parseInt(input.nextLine());
        while (temp1) {
            System.out.print("Type used space:");
            currentUsedSpace = Integer.parseInt(input.nextLine());
            if (!(currentUsedSpace>maxAvailableSpace)) temp1 = false;
        }
        System.out.print("Type max goods weight:");
        maxGoodsWeight = Integer.parseInt(input.nextLine());
        while (temp2) {
            System.out.print("Type current goods weight:");
            currentGoodsWeight = Integer.parseInt(input.nextLine());
            if (!(currentGoodsWeight>maxGoodsWeight)) temp2 = false;
        }
        System.out.print("Type additional compartments");
        additionalCompartments = Integer.parseInt(input.nextLine());

        RailcarCargoPlus cargoPlus = new RailcarCargoPlus(RailcarType.CARGOPLUS,weight, maxAvailableSpace, currentUsedSpace, maxGoodsWeight, currentGoodsWeight, additionalCompartments);
        system.addRailcar(cargoPlus);
        System.out.println("Succesfulyy added new cargo-plus railcar!");
    }
    private void addingRefrigator(){
        int weight;
        int maxAvailableSpace;
        int currentUsedSpace=0;
        int maxGoodsWeight;
        int currentGoodsWeight=0;
        double shippingTemperature;
        boolean temp1 = true;
        boolean temp2 = true;

        System.out.print("Type railcar weight:");
        weight = Integer.parseInt(input.nextLine());
        System.out.print("Type max available space:");
        maxAvailableSpace = Integer.parseInt(input.nextLine());
        while (temp1) {
            System.out.print("Type used space:");
            currentUsedSpace = Integer.parseInt(input.nextLine());
            if (!(currentUsedSpace>maxAvailableSpace)) temp1 = false;
        }
        System.out.print("Type max goods weight:");
        maxGoodsWeight = Integer.parseInt(input.nextLine());
        while (temp2) {
            System.out.print("Type current goods weight:");
            currentGoodsWeight = Integer.parseInt(input.nextLine());
            if (!(currentGoodsWeight>maxGoodsWeight)) temp2 = false;
        }
        System.out.print("Type shipping temperature:");
        shippingTemperature = Integer.parseInt(input.nextLine());

        RailcarRefrigator refrigator = new RailcarRefrigator(weight, maxAvailableSpace, currentUsedSpace, maxGoodsWeight, currentGoodsWeight, shippingTemperature);
        system.addRailcar(refrigator);
        System.out.println("Succesfulyy added new refrigator railcar!");
    }
    private void addingLiquidTank(){
        int weight;
        int maxAvailableSpace;
        int currentUsedSpace=0;
        int maxGoodsWeight;
        int currentGoodsWeight=0;
        //int capacity;
        boolean temp1 = true;
        boolean temp2 = true;

        System.out.print("Type railcar weight:");
        weight = Integer.parseInt(input.nextLine());
        System.out.print("Type max available space:");
        maxAvailableSpace = Integer.parseInt(input.nextLine());
        while (temp1) {
            System.out.print("Type used space:");
            currentUsedSpace = Integer.parseInt(input.nextLine());
            if (!(currentUsedSpace>maxAvailableSpace)) temp1 = false;
        }
        System.out.print("Type max goods weight:");
        maxGoodsWeight = Integer.parseInt(input.nextLine());
        while (temp2) {
            System.out.print("Type current goods weight:");
            currentGoodsWeight = Integer.parseInt(input.nextLine());
            if (!(currentGoodsWeight>maxGoodsWeight)) temp2 = false;
        }


        RailcarLiquidTank liquidTank = new RailcarLiquidTank(weight, maxAvailableSpace, currentUsedSpace, maxGoodsWeight, currentGoodsWeight);
        system.addRailcar(liquidTank);
        System.out.println("Succesfulyy added new liquid tank railcar!");
    }
    private void addingGasTank(){
        int weight;
        int maxAvailableSpace;
        int currentUsedSpace=0;
        int maxGoodsWeight;
        int currentGoodsWeight=0;
        int capacity;
        boolean temp1 = true;
        boolean temp2 = true;

        System.out.print("Type railcar weight:");
        weight = Integer.parseInt(input.nextLine());
        System.out.print("Type max available space:");
        maxAvailableSpace = Integer.parseInt(input.nextLine());
        while (temp1) {
            System.out.print("Type used space:");
            currentUsedSpace = Integer.parseInt(input.nextLine());
            if (!(currentUsedSpace>maxAvailableSpace)) temp1 = false;
        }
        System.out.print("Type max goods weight:");
        maxGoodsWeight = Integer.parseInt(input.nextLine());
        while (temp2) {
            System.out.print("Type current goods weight:");
            currentGoodsWeight = Integer.parseInt(input.nextLine());
            if (!(currentGoodsWeight>maxGoodsWeight)) temp2 = false;
        }


        RailcarGasTank gasTank = new RailcarGasTank(weight, maxAvailableSpace, currentUsedSpace, maxGoodsWeight, currentGoodsWeight);
        system.addRailcar(gasTank);
        System.out.println("Succesfulyy added new gas tank railcar!");
    }
    private void addingExplosives(){
        int weight;
        int maxAvailableSpace;
        int currentUsedSpace=0;
        int maxGoodsWeight;
        int currentGoodsWeight=0;
        int additionalCompartments;
        boolean temp1 = true;
        boolean temp2 = true;

        System.out.print("Type railcar weight:");
        weight = Integer.parseInt(input.nextLine());
        System.out.print("Type max available space:");
        maxAvailableSpace = Integer.parseInt(input.nextLine());
        while (temp1) {
            System.out.print("Type used space:");
            currentUsedSpace = Integer.parseInt(input.nextLine());
            if (!(currentUsedSpace>maxAvailableSpace)) temp1 = false;
        }
        System.out.print("Type max goods weight:");
        maxGoodsWeight = Integer.parseInt(input.nextLine());
        while (temp2) {
            System.out.print("Type current goods weight:");
            currentGoodsWeight = Integer.parseInt(input.nextLine());
            if (!(currentGoodsWeight>maxGoodsWeight)) temp2 = false;
        }
        System.out.print("Type additional compartments:");
        additionalCompartments = Integer.parseInt(input.nextLine());

        RailcarExplosives explosives = new RailcarExplosives(weight, maxAvailableSpace, currentUsedSpace, maxGoodsWeight, currentGoodsWeight, additionalCompartments);
        system.addRailcar(explosives);
        System.out.println("Succesfulyy added new explosives railcar!");
    }
    private void addingToxicMaterials(){
        int weight;
        int maxAvailableSpace;
        int currentUsedSpace=0;
        int maxGoodsWeight;
        int currentGoodsWeight=0;
        int additionalCompartments;
        boolean temp1 = true;
        boolean temp2 = true;

        System.out.print("Type railcar weight:");
        weight = Integer.parseInt(input.nextLine());
        System.out.print("Type max available space:");
        maxAvailableSpace = Integer.parseInt(input.nextLine());
        while (temp1) {
            System.out.print("Type used space:");
            currentUsedSpace = Integer.parseInt(input.nextLine());
            if (!(currentUsedSpace>maxAvailableSpace)) temp1 = false;
        }
        System.out.print("Type max goods weight:");
        maxGoodsWeight = Integer.parseInt(input.nextLine());
        while (temp2) {
            System.out.print("Type current goods weight:");
            currentGoodsWeight = Integer.parseInt(input.nextLine());
            if (!(currentGoodsWeight>maxGoodsWeight)) temp2 = false;
        }
        System.out.print("Type additional compartments:");
        additionalCompartments = Integer.parseInt(input.nextLine());

        RailcarToxicMaterials toxicMaterials = new RailcarToxicMaterials(weight, maxAvailableSpace, currentUsedSpace, maxGoodsWeight, currentGoodsWeight, additionalCompartments);
        system.addRailcar(toxicMaterials);
        System.out.println("Succesfulyy added new toxic materials railcar!");
    }
    private void listAllRailcars(){
        for(Railcar r : system.getAllRailcars()){
            System.out.println(r);
        }
    }

    private void listAllAvailableRailcars(){
        for(Railcar r : system.getAllAvailableRailcars()){
            System.out.println(r);
        }
    }





}
