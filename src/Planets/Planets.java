package Planets;

public enum Planets {

    MARS(56000000),MOON(384400),SUN(149600000);
    
    long distanceFromEarth;

    Planets(long distanceFromEarth) {
        this.distanceFromEarth = distanceFromEarth;
    }
    
}

