package rocket;

public enum  FuelTank {

    EXTRA(600, 150, 90, 8000), BIG(300, 150, 90,4000),MEDIUM(150, 150, 90,2000),
    SMALL(75, 150, 90,1000),EXTRA_SMALL (35, 150, 90, 500);

    int hight, weight,  width, capacity;

    FuelTank(int hight, int weight, int width, int capacity) {
        this.hight = hight;
        this.weight = weight;
        this.width = width;
        this.capacity = capacity;
    }

}
