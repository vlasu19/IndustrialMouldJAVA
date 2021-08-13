package PriceCalculation;

public class DR {
    private double size;
    private double price;

    public DR(double size) {
        this.size = size;
    }

    public void calculation(){
        if (size > 0 && size <= 2200){
            PartPriceCalculation partPriceCalculation = new PartPriceCalculation(16,4,6,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,28,2,4,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,16,2,2,3,2,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0);
            partPriceCalculation.numOfPartCalculation();
            price = partPriceCalculation.getSum();
        }else if (size > 2200 && size <= 3600){
            PartPriceCalculation partPriceCalculation = new PartPriceCalculation(16,4,6,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,28,2,4,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,16,2,2,3,2,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0);
            partPriceCalculation.numOfPartCalculation();
            price = partPriceCalculation.getSum();
        }else if (size > 3600){
            PartPriceCalculation partPriceCalculation = new PartPriceCalculation(16,4,6,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,28,2,4,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,16,2,2,3,2,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0);
            partPriceCalculation.numOfPartCalculation();
            price = partPriceCalculation.getSum();
        }
    }

    public double getPrice() {
        return price;
    }
}
