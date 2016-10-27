package week1.day2.homework.flowers;

/**
 * Created by Andriy on 26.10.2016.
 */
class Ribbon extends Accessory {

    Ribbon(int price) {
        super(price);
    }

    Ribbon(){
        this.setPrice(1);
    }

    @Override
    public String toString(){
        return "Ribbon. Price: $" + getPrice();
    }


}
