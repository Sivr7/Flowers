package week1.day2.homework.flowers;

/**
 * Created by Andriy on 25.10.2016.
 */
class Chrysanthemum extends HothouseFlower{

    Chrysanthemum(int freshness, int stemLength, int price) {
        super(freshness, stemLength, price);
    }

    Chrysanthemum() {
        super(3, (int)(40 + (Math.random() * 20)), 2);
    }

    @Override
    public String toString(){
        String day = " day";
        if(getFreshness() > 1){
            day = " days";
        }
        return "This CHRYSANTHEMUM freshness is " + getFreshness() + day + ", stem length is " + getStemLength() + " cm., " +
                "price:" + " $" + getPrice() + ". \n";
    }

}
