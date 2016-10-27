package week1.day2.homework.flowers;

/**
 * Created by Andriy on 26.10.2016.
 */
class GreetingCard extends Accessory {

    GreetingCard(int price) {
        super(price);
    }

    GreetingCard(){
        super(1);
    }

    @Override
    public String toString(){
        return "Greeting card. Price: $" + getPrice() + ". \n";
    }
}
