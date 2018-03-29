package rocket.input;

import planets.Planets;
import rocket.cabins.Cabins;
import rocket.engines.Engine;
import rocket.fueltanks.FuelTank;

import java.util.Scanner;

public class Input {

    private Scanner input = new Scanner(System.in);



    public Cabins chooseCabin() {
        System.out.println("You can select 1 of 5 Cabins");
        Cabins[] cabins = Cabins.values();
        for (Cabins cabin : cabins) {
            cabin.showAll();
        }
        System.out.println("Select Cabin: ");
        Cabins cabin;
        do {
            cabin = getCabin(input.nextLine(), cabins);
        } while (cabin == null);

        return cabin;
    }

    private Cabins getCabin(String name, Cabins[] cabins) {
        for (Cabins cabin : cabins) {
            if (cabin.name().equalsIgnoreCase(name)) {
                return cabin;
            }
        }
        System.out.println("Wrong input! Repeat, please");
        return null;
    }
    /////////////////////////////////////////////////////////

    public void chooseCountOfEngine() {
        Engine[] engines = Engine.values();
        for (Engine engine : engines) {
            engine.showAll();
        }
        System.out.println("You can select 3,4 or 5 Engines");
        System.out.println("How many engines you want? Enter number: ");
        while (!input.hasNextInt()) {
            input.nextLine();
            System.out.println("It's not number, please enter number(3,4,5):");
        }
        int n = input.nextInt();
        FuelTank.setCountOfTanks(n);
    }




    public Engine chooseEngine() {
        Engine[] engines = Engine.values();
        System.out.println("Select Engine: ");
        Engine engine;
        do {
            engine = getEngine(input.next(), engines);
        } while (engine == null);

        return engine;
    }

    private Engine getEngine(String name, Engine[] engines) {
        for (Engine engine : engines) {
            if (engine.name().equalsIgnoreCase(name)) {
                return engine;
            }
        }
        System.out.println("Wrong input! Repeat, please");
        return null;
    }
    ////////////////////////////////////////////////////////////////
    public void countOfTanks() {
        FuelTank[] tanks = FuelTank.values();
        for (FuelTank tank : tanks) {
            tank.showAll();
        }
    }

    public FuelTank chooseFuelTank() {
        FuelTank[] tanks = FuelTank.values();
        System.out.println("Select FuelTank: ");
        FuelTank tank;
        do {
            tank = getFuelTank(input.next(), tanks);
        } while (tank == null);

        return tank;
    }
    private FuelTank getFuelTank(String name, FuelTank[] tanks) {
        for (FuelTank tank : tanks) {
            if (tank.name().equalsIgnoreCase(name)) {
                return tank;
            }
        }
        System.out.println("Wrong input! Repeat, please");
        return null;
    }
    ////////////////////////////////////////////////////
    public Planets choosePlanet(){
        Planets[] planets = Planets.values();
        for (Planets planet : planets) {
            planet.showAll();
        }
        System.out.println("Select Planet: ");
        Planets planet;
        do {
            planet = getPlanets(input.next(), planets);
        } while (planet == null);

        return planet;

    }
    private Planets getPlanets(String name, Planets[] planets) {
        for (Planets planet : planets) {
            if (planet.name().equalsIgnoreCase(name)) {
                return planet;
            }
        }
        System.out.println("Wrong input! Repeat, please");
        return null;
    }
}
