package rpek.enumdemo.enumfield;

/**
 * Created by r.pek on 02.10.2017.
 */

public enum Fruit {
    //initialize value to constructor
    APPLE("LIKE"),
    PINE_APPLE("DONT_LIKE"),
    BANANA("NORMAL");

    //Field
    public String fruit;

    //constructor
    Fruit(String fruit) {
        this.fruit = fruit;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }
}
