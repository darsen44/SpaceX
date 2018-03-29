package rocket.cabins;

public enum Cabins implements CabinsProvider {


    SPACIK(200, 100, 100, 100), ZACHID(300, 150, 190, 80), BANDERA(250, 130, 120, 110),
    CTULHU(150, 90, 102, 111), ILONCHIK(222, 135, 105, 101);

    private int height;
    private int width;
    private int weight;
    private int capacity;

    Cabins(int height, int width, int weight, int capacity) {

        this.height = height;
        this.width = width;
        this.weight = weight;
        this.capacity = capacity;
    }

//

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getWeight() {
        return weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void showAll() {
        System.out.println("Cabin: " + this.name());
        System.out.println("Height\t" + "Wight\t" + "Weight\t" + "Capacity\t");
        System.out.println("-----------------------------------------");
        System.out.println(this.height + "\t\t" + this.width + "\t\t" + this.weight +"\t\t"+ this.capacity);

    }



}
