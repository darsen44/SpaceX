package rocket;

public enum Cabins {

    SPACIK(200,100,100,100),ZACHID(300,150,190,80),BANDERA(250,130,120,110),
    CTULHU(150,90,102,111),ILONCHIK(222,135,105,101);

    public int height, width, weight, capacity;

    Cabins(int height, int width, int weight, int capacity) {
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.capacity = capacity;
    }

}
