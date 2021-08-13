package PriceCalculation;

public class BL {
    private double size;
    private double price;

    public BL(double size) {
        this.size = size;
    }

    public void calculation(){
        if (size > 0 && size <= 2200){
            PartPriceCalculation partPriceCalculation = new PartPriceCalculation(0,4,0,0,4,4,2,4,4,4,4,2,5,25,2,8,10,2,2,0,0,0,0,11,11,8,8,2,2,4,8,16,8,36,0,0,12,12,0,0,0,0,0,4,4,27,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0);
            partPriceCalculation.numOfPartCalculation();
            price = partPriceCalculation.getSum();
        }else if (size > 2200 && size <= 3600){
            PartPriceCalculation partPriceCalculation = new PartPriceCalculation(0,4,0,0,4,4,2,4,4,4,4,2,5,25,2,8,10,2,2,0,0,0,0,11,11,8,8,2,2,4,8,16,8,36,0,0,24,24,0,0,0,0,0,4,4,27,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0);
            partPriceCalculation.numOfPartCalculation();
            price = partPriceCalculation.getSum();
        }else if (size > 3600){
            PartPriceCalculation partPriceCalculation = new PartPriceCalculation(0,4,0,0,4,4,2,4,4,4,4,2,5,25,2,8,10,2,2,0,0,0,0,11,11,8,8,2,2,4,8,16,8,36,0,0,36,36,0,0,0,0,0,4,4,27,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0);
            partPriceCalculation.numOfPartCalculation();
            price = partPriceCalculation.getSum();
        }
    }

    public double getPrice() {
        return price;
    }
}
