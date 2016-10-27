package week1.day2.homework.flowers;

/**
 * Created by Andriy on 25.10.2016.
 */
class Dahlia extends HothouseFlower {

    Dahlia(int freshness, int stemLength, int price) {
        super(freshness, stemLength, price);
    }

    Dahlia() {
        this.setFreshness(1);
        this.setStemLength((int)(50 + (Math.random() * 20)));
        this.setPrice(1);
    }

    @Override
    public String toString(){
        String day = " day";
        if(getFreshness() > 1){
            day = " days";
        }
        return "This DAHLIA freshness is " + getFreshness() + day + ", stem length is " + getStemLength() + " cm., " +
                "price:" + " $" + getPrice() + ". \n";
    }

}
