package rocket.fueltanks;

public enum  FuelTank implements FuelTankProvider {


    EXTRA(600, 150, 90, 80000), BIG(300, 65, 90,40000),MEDIUM(150, 60, 90,20000),
    SMALL(75, 15, 90,10000),EXTRA_SMALL (35, 15, 90, 50000);
    private int height;
    private int weight;
    private int width;
    private int capacity;
    private static int countOfTanks;

    FuelTank(int height, int weight, int width, int capacity) {

        this.height = height;
        this.weight = weight;
        this.width = width;
        this.capacity = capacity;
    }

    public static void setCountOfTanks(int count) {
        countOfTanks = count;
    }
    public static int getCountOfTanks() {
        return countOfTanks ;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getWidth() {
        return width;
    }

    public int getCapacity() {
        return capacity;
    }
    public void showAll() {
        System.out.println("FuelTank: " + this.name());
        System.out.println("Height\t" + "Wight\t" + "Weight\t" + "Capacity\t");
        System.out.println("-----------------------------------------");
        System.out.println(this.height + "\t\t" + this.width + "\t\t" + this.weight +"\t\t"+ this.capacity);

    }

}
