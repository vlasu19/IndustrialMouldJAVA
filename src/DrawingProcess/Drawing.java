package DrawingProcess;

import java.util.Scanner;

public class Drawing implements DawingPorcess{

    private double partLength,partWidth,partHeight;//零件长宽高初始数据
    private double mouldLength = 0,mouldWidth = 0,mouldHeight = 0;//模具长宽高
    private double drawingPartLength,drawingPartWidth,drawingPartHeight; //一般拉延零件料片长
    private boolean isAuto;//是否自动化

    public Drawing(double partLength, double partWidth, double partHeight, boolean isAuto) {
        this.partLength = partLength;
        this.partWidth = partWidth;
        this.partHeight = partHeight;
        this.isAuto = isAuto;
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
            case 3:
                System.out.println("选择标准（true）或非标（false）CAM方法");
                boolean isNormal = sc.nextBoolean();
                CAMCalculation cam = new CAMCalculation(partLength,partWidth,partHeight,isNormal);
                cam.calculation();
                mouldLength = cam.getMouldLength();
                mouldWidth = cam.getMouldWidth();
                break;
        }
    }

    /**
     * 一般结构
     */
    @Override
    public void normalMethod(){
        drawingPartLength = partLength + partHeight + 140;
        drawingPartWidth = partWidth + partHeight + 140;
        if (isAuto){
            mouldLength =  drawingPartLength + 900;
            mouldWidth = drawingPartWidth + 700;
        }else{
            mouldLength = drawingPartLength + 800;
            mouldWidth = drawingPartWidth + 600;
        }
    }

    /**
     * 箱式结构
     */
    @Override
    public void otherMethod() {
        drawingPartLength = partLength + partHeight + 140;
        drawingPartWidth = partWidth + partHeight + 140;
        if (isAuto){
            mouldLength =  drawingPartLength + 1100;
            mouldWidth = drawingPartWidth + 850;
        }else{
            mouldLength = drawingPartLength + 1000;
            mouldWidth = drawingPartWidth + 800;
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
