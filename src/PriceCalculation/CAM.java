package PriceCalculation;

public class CAM {
    private double size;
    private double price;

    public CAM(double size) {
        this.size = size;
    }

    public void calculation(){
        if (size > 0 && size <= 2200){
            PartPriceCalculation partPriceCalculation = new PartPriceCalculation(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,10,10,4,0,2,2,2,1,1,2,2,0,0,0,0,0,0,0,0,0,0,0);
            partPriceCalculation.numOfPartCalculation();
            price = partPriceCalculation.getSum();
        }else if (size > 2200 && size <= 3600){
            PartPriceCalculation partPriceCalculation = new PartPriceCalculation(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,20,10,4,1,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0);
            partPriceCalculation.numOfPartCalculation();
            price = partPriceCalculation.getSum();
        }else if (size > 3600){
            PartPriceCalculation partPriceCalculation = new PartPriceCalculation(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,40,10,4,2,2,2,2,2,2,3,3,0,0,0,0,0,0,0,0,0,0,0);
            partPriceCalculation.numOfPartCalculation();
            price = partPriceCalculation.getSum();
        }
    }

    public double getPrice() {
        return price;
    }
}
