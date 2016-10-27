package week1.day2.homework.flowers;

/**
 * Created by Andriy on 25.10.2016.
 */
class Mayweed extends Wildflower {

    Mayweed(int freshness, int stemLength, int price) {
        super(freshness, stemLength, price);
    }

    Mayweed() {
        super(3, (int)(10 + (Math.random() * 10)), 1);
    }

    @Override
    public String toString(){
        String day = " day";
        if(getFreshness() > 1){
            day = " days";
        }
        return "This MAYWEED freshness is " + getFreshness() + day + ", stem length is " + getStemLength() + " cm., " +
                "price:" + " $" + getPrice() + ". \n";
    }
}
