package DrawingProcess;

import java.util.Scanner;

public class CuttingEdgePuchingRoundHoles implements DawingPorcess{

    private double partLength,partWidth,partHeight;//零件长宽高初始数据
    private double mouldLength = 0,mouldWidth = 0,mouldHeight = 0;//模具长宽高
    private boolean isAuto;//是否自动化

    public CuttingEdgePuchingRoundHoles(double partLength, double partWidth, double partHeight, boolean isAuto) {
        this.partLength = partLength;
        this.partWidth = partWidth;
        this.partHeight = partHeight;
        this.isAuto = isAuto;
    }

    public CuttingEdgePuchingRoundHoles(double partLength, double partWidth, double partHeight) {
        this.partLength = partLength;
        this.partWidth = partWidth;
        this.partHeight = partHeight;
    }

    /**
     * 切边冲孔工艺计算
     */
    @Override
    public void calculate() {
        System.out.println("请输入模具结构");
        System.out.println("1.一般结构\n2.压料板穿刀\n3.CAM\n");
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
            case 3:
                CAMMethod();
                break;

        }
    }

    /**
     * 一般方法
     */
    @Override
    public void normalMethod() {
        if (isAuto){
            mouldLength = partLength + 1100;
            mouldWidth = partWidth + 600;
        }else{
            mouldLength = partLength + 1000;
            mouldWidth = partWidth + 600;
        }
    }

    /**
     * 压料板穿刀
     */
    @Override
    public void otherMethod() {
        if (isAuto){
            mouldLength = partLength + 1100;
            mouldWidth = partWidth + 900;
        }else{
            mouldLength = partLength + 1000;
            mouldWidth = partWidth + 900;
        }
    }

    /**
     * CAM方法
     */
    public void CAMMethod(){

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
