package week1.day2.homework.flowers;

/**
 * Created by Andriy on 25.10.2016.
 */
class Poppy extends Wildflower {

    Poppy(int freshness, int stemLength, int price) {
        super(freshness, stemLength, price);
    }

    Poppy() {
        super(4, (int)(20 + (Math.random() * 10)), 1);
    }

    @Override
    public String toString(){
        String day = " day";
        if(getFreshness() > 1){
            day = " days";
        }
        return "This POPPY freshness is " + getFreshness() + day + ", stem length is " + getStemLength() + " cm., " +
                "price:" + " $" + getPrice() + ". \n";
    }
}
