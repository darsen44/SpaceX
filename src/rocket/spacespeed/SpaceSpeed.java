package rocket.spacespeed;

public enum SpaceSpeed {

    FIRSTSPACESPEED(7900),SECONDSPACESPEED(11200);


    private double speed;

    public double getSpeed() {
        return speed;
    }

    SpaceSpeed(double speed) {
        this.speed = speed;
    }

}

