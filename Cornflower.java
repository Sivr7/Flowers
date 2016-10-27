package week1.day2.homework.flowers;

/**
 * Created by Andriy on 25.10.2016.
 */
class Cornflower extends Wildflower {

    Cornflower(int freshness, int stemLength, int price) {
        super(freshness, stemLength, price);
    }

    Cornflower() {
        super(2, (int)(5 + (Math.random() * 3)), 1);
    }

    @Override
    public String toString(){
        String day = " day";
        if(getFreshness() > 1){
            day = " days";
        }
        return "This CORNFLOWER freshness is " + getFreshness() + day + ", stem length is " + getStemLength() + " cm., " +
                "price:" + " $" + getPrice() + ". \n";
    }

}
