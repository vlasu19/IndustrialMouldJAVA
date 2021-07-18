package DrawingProcess;

import java.util.Scanner;

public class Drawing implements DawingPorcess{

    private double partLength,partWidth,partHeight;//零件长宽高初始数据
    private double mouldLength = 0,mouldWidth = 0,mouldHeight = 0;//模具长宽高
    private boolean isAuto;//是否自动化

    public Drawing(double partLength, double partWidth, double partHeight, boolean isAuto) {
        this.partLength = partLength;
        this.partWidth = partWidth;
        this.partHeight = partHeight;
        this.isAuto = isAuto;
    }

    public Drawing(double partLength, double partWidth, double partHeight) {
        this.partLength = partLength;
        this.partWidth = partWidth;
        this.partHeight = partHeight;
    }

    /**
     * 拉延工艺计算
     */
    @Override
    public void calculate(){
        System.out.println("请输入模具结构");
        System.out.println("1.一般结构\n2.箱体结构\n");
        int judgement;
        Scanner sc = new Scanner(System.in);
        judgement = sc.nextInt();
        switch (judgement){
            case 1:
                normalMethod();
                break;
            case 2:
                otherMethod();
                break;
        }
    }

    /**
     * 一般结构
     */
    @Override
    public void normalMethod(){
        if (isAuto){
            mouldLength =  partLength + 900;
            mouldWidth = partWidth + 700;
        }else{
            mouldLength = partLength + 800;
            mouldWidth = partWidth + 600;
        }
    }

    /**
     * 箱式结构
     */
    @Override
    public void otherMethod() {
        if (isAuto){
            mouldLength =  partLength + 1100;
            mouldWidth = partWidth + 850;
        }else{
            mouldLength = partLength + 1000;
            mouldWidth = partWidth + 800;
        }
    }

    public void setAuto(boolean auto) {
        isAuto = auto;
    }

    public double getMouldLength() {
        return mouldLength;
    }

    public double getMouldWidth() {
        return mouldWidth;
    }

    public double getMouldHeight() {
        return mouldHeight;
    }
}
