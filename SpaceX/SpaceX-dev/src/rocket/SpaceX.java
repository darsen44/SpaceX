package rocket;

import planets.Planets;
import rocket.cabins.Cabins;
import rocket.cabins.CabinsProvider;
import rocket.engines.Engine;
import rocket.engines.EngineProvider;
import rocket.fueltanks.FuelTank;
import rocket.fueltanks.FuelTankProvider;
import rocket.input.Input;
import rocket.spacespeed.SpaceSpeed;

public class SpaceX extends Rocket {

    public void startSpaceX() {


        Input input = new Input();

        input.chooseCabin();
        input.chooseCountOfEngine();

        int i = FuelTank.getCountOfTanks();
        EngineProvider engine[] = new Engine[i];
        FuelTank tank[] = new FuelTank[FuelTank.getCountOfTanks()];

        for (; i > 0; i--) {
            engine[i - 1] = input.chooseEngine();
            input.countOfTanks();
            tank[i - 1] = input.chooseFuelTank();
            if (tank[i - 1].getHeight() > engine[i - 1].getHeight()
                    || tank[i - 1].getWeight() > engine[i - 1].getWeight()
                    || tank[i - 1].getWidth() > engine[i - 1].getWidth()
                    ) {

                System.out.println("FuelTank must be smaller than Engine!!\n" + "Please,choose correct: ");
                tank[i - 1] = input.chooseFuelTank();
            }

        }
        Planets planet = input.choosePlanet();
        getDestinationAndTime(planet, tank, engine);
    }

    public void getDestinationAndTime(Planets planet, FuelTankProvider tank[], EngineProvider engine[]) {
        int sumFuel = 0;
        for (int i = FuelTank.getCountOfTanks(); i > 0; i--) {
            sumFuel = +tank[i-1].getCapacity();
        }
        int sumPower = 0;
        for (int i = FuelTank.getCountOfTanks(); i > 0; i--) {
            sumPower = +engine[i-1].getPower();
        }
        if (planet.getDistanceFromEarth() / sumFuel < (sumPower / 3)) {
            System.out.println("Congratulation! You are on " + planet.name());
            double t = planet.getDistanceFromEarth() / (SpaceSpeed.SECONDSPACESPEED.getSpeed() * (sumPower / 3) * 0.3);
            System.out.println("Your destinatin time: " + t + " days");
        } else System.out.println("Sorry, but you're somewhere in the cosmos((");

    }


}
