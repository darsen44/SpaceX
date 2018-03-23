package rocket;

public enum Engine {
    RS_25(100,50,90,90),VIKING_5C(110,60,95,95),RS_68(140,70,99,70),
    F_1(105,65,95,91),MERLIN_1D(170,80,110,110);

    int height, width, weight, power;

    Engine(int height, int width, int weight, int power) {
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.power = power;
    }

    public final double firstSpaceSpeed = 7.9;
    public final double seccondSpaceSpeed = 11.2;
}
