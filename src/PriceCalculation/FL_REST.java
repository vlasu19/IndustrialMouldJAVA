package PriceCalculation;

public class FL_REST {
    private double size;
    private double price;

    public FL_REST(double size) {
        this.size = size;
    }

    public void calculation(){
        if (size > 0 && size <= 2200){
            PartPriceCalculation partPriceCalculation = new PartPriceCalculation(8,4,0,3,4,4,8,0,0,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,6,4,0,8,0,0,8,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,20,20,20,1,1,1,1,1,2,1,2);
            partPriceCalculation.numOfPartCalculation();
            price = partPriceCalculation.getSum();
        }else if (size > 2200 && size <= 3600){
            PartPriceCalculation partPriceCalculation = new PartPriceCalculation(8,4,0,3,4,4,8,0,0,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,6,4,0,8,0,0,12,12,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,30,30,30,1,1,1,1,1,2,1,2);
            partPriceCalculation.numOfPartCalculation();
            price = partPriceCalculation.getSum();
        }else if (size > 3600){
            PartPriceCalculation partPriceCalculation = new PartPriceCalculation(8,4,0,3,4,4,8,0,0,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,8,6,4,0,8,0,0,16,16,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,40,40,40,1,1,1,1,1,2,1,2);
            partPriceCalculation.numOfPartCalculation();
            price = partPriceCalculation.getSum();
        }
    }

    public double getPrice() {
        return price;
    }
}
