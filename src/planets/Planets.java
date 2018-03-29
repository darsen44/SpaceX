package planets;

public enum Planets {

    MARS(56000000),MOON(384400),SUN(149600000);

    long distanceFromEarth;

    Planets(long distanceFromEarth) {
        this.distanceFromEarth = distanceFromEarth;
    }

    public long getDistanceFromEarth() {
        return distanceFromEarth;
    }

    public void showAll() {
        System.out.println("Planet: " + this.name());
        System.out.println("Distance from Earth: " + this.distanceFromEarth);

    }

}
