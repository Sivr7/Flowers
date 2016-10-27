package week1.day2.homework.flowers;

/**
 * Created by Andriy on 26.10.2016.
 */
class Wrapper extends Accessory {

    Wrapper(int price) {
        super(price);
    }

    Wrapper(){
        this.setPrice(1);
    }

    @Override
    public String toString(){
        return "Wrapper. Price: $" + getPrice() + ". \n";
    }
}
