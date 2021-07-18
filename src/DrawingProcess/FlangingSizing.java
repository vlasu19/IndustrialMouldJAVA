package DrawingProcess;

import java.util.Scanner;

public class FlangingSizing implements DawingPorcess{

    private double partLength;//零件长
    private double partWidth;//零件宽
    private  double partHeight;//零件高
    private double mouldLength = 0,mouldWidth = 0,mouldHeight = 0;//模具长宽高
    private boolean isAuto;//是否自动化

    public FlangingSizing(double partLength, double partWidth, double partHeight, boolean isAuto) {
        this.partLength = partLength;
        this.partWidth = partWidth;
        this.partHeight = partHeight;
        this.isAuto = isAuto;
    }

    public FlangingSizing(double partLength, double partWidth, double partHeight) {
        this.partLength = partLength;
        this.partWidth = partWidth;
        this.partHeight = partHeight;
    }

    /**
     * 翻边整形工艺计算
     */
    @Override
    public void calculate() {
        System.out.println("请输入模具结构");
        System.out.println("1.一般结构\n2.压料板穿刀\n3.一般CAM方法\n4.互动CAM方法\n");
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
                normalCamMethod();
                break;
            case 4:
                interactionCamMethod();
                break;
        }
    }

    /**
     * 一般方法
     */
    @Override
    public void normalMethod() {
        if (isAuto){//自动化
            mouldLength = partLength + 900;
            mouldWidth = partWidth + 600;
        }else{//手工
            mouldLength = partLength + 800;
            mouldWidth = partWidth + 600;
        }
    }

    /**
     * 压料板穿刀
     */
    @Override
    public void otherMethod() {
        if (isAuto) {//自动化
            mouldLength = partLength + 900;
            mouldWidth = partWidth + 900;
        } else {//手工
            mouldLength = partLength + 900;
            mouldWidth = partWidth + 900;
        }
    }

    /**
     * 一般CAM
     */
    public void normalCamMethod(){

    }

    /**
     * 互动CAM
     */
    public void interactionCamMethod(){

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
