package rocket;

import rocket.cabins.CabinsProvider;
import rocket.engines.EngineProvider;
import rocket.fueltanks.FuelTankProvider;

public abstract class Rocket {

    private EngineProvider[] engines;
    private CabinsProvider cabin;
    private FuelTankProvider[] fuelTanks;

    public EngineProvider[] getEngine() {
        return engines;
    }

    public CabinsProvider getCabin() {
        return cabin;
    }

    public FuelTankProvider[] getFuelTank() {
        return fuelTanks;
    }

    public void setEngines(EngineProvider[] engines) {
        this.engines = engines;
    }

    public void setCabin(CabinsProvider cabin) {
        this.cabin = cabin;
    }

    public void setFuelTanks(FuelTankProvider[] fuelTanks) {
        this.fuelTanks = fuelTanks;
    }
}
