package rocket.engines;

import rocket.spacespeed.SpaceSpeed;

public enum Engine implements EngineProvider {

    RS_25(650, 170, 90, 625), VIKING_5C(310, 160, 95, 595), RS_68(250, 70, 99, 470),
    F_1(105, 65, 95, 391), MERLIN_1D(170, 80, 110, 410);


    private int height;
    private int weight;
    private int width;
    private int power;

    Engine(int height, int weight, int width, int power) {
        this.height = height;
        this.weight = weight;
        this.width = width;
        this.power = power;
    }

    public int getHeight() {
        return height;
    }


    public int getWidth() {
        return width;
    }


    public int getWeight() {
        return weight;
    }


    public int getPower() {
        return power;
    }


    public double getAccelerationToFirstSpaceSpeed(){
        return SpaceSpeed.FIRSTSPACESPEED.getSpeed() / 3225; // 2*12742 / 7900 = 3225
    }

    public double getAccelerationToSecondSpaceSpeed(){
        return SpaceSpeed.SECONDSPACESPEED.getSpeed() / 2275; // 2*12742 / 11200 = 2275
    }

    public void showAll() {
        System.out.println("Engine: " + this.name());
        System.out.println("Height\t" + "Wight\t" + "Weight\t" + "Power\t");
        System.out.println("-----------------------------------------");
        System.out.println(this.height + "\t\t" + this.width + "\t\t" + this.weight +"\t\t"+ this.power);
        }

    }

