package PriceCalculation;

import java.util.Scanner;

public class InnerPartCalculation {
    private double mouldLength, mouldWidth;
    private double size;
    private double price;

    public void priceCalculation(){
        size = mouldLength + mouldWidth;
        System.out.println("=======================正在进行内板件模具价格计算...=======================");
        System.out.println("||请选择要计算的模具类型||");
        System.out.println("1、BL\n2、DR\n3、TR,PI\n4、FL,REST\n5、CAM");
        Scanner sc = new Scanner(System.in);
        int judge = sc.nextInt();
        switch (judge){
            case 1:
                BL bl = new BL(size);
                bl.calculation();
                price = bl.getPrice();
                break;
            case 2:
                DR dr = new DR(size);
                dr.calculation();
                price = dr.getPrice();
                break;
            case 3:
                TR_PI tr_pi = new TR_PI(size);
                tr_pi.calculation();
                price = tr_pi.getPrice();
                break;
            case 4:
                FL_REST fl_rest = new FL_REST(size);
                fl_rest.calculation();
                price = fl_rest.getPrice();
                break;
            case 5:
                CAM cam = new CAM(size);
                cam.calculation();
                price = cam.getPrice();
                break;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setMouldLength(double mouldLength) {
        this.mouldLength = mouldLength;
    }

    public void setMouldWidth(double mouldWidth) {
        this.mouldWidth = mouldWidth;
    }
}
