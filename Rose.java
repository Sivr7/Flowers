package week1.day2.homework.flowers;

/**
 * Created by Andriy on 25.10.2016.
 */
class Rose extends HothouseFlower {

    Rose(int freshness, int stemLength, int price) {
        super(freshness, stemLength, price);
    }

    Rose() {
        super(4,(int)(30 + (Math.random() * 20)), 3);
    }

    @Override
    public String toString(){
        String day = " day";
        if(getFreshness() > 1){
            day = " days";
        }
        return "This ROSE freshness is " + getFreshness() + day + ", stem length is " + getStemLength() + " cm., " +
                "price:" + " $" + getPrice() + ". \n";
    }
}
