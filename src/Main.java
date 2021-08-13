import DrawingProcess.CuttingEdgePuchingRoundHoles;
import DrawingProcess.Drawing;
import DrawingProcess.FlangingSizing;
import DrawingProcess.HeightCalculation;
import PriceCalculation.InnerPartCalculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double partLength;//零件长
        double partWidth;//零件宽
        double partHeight;//零件高
        double price;//模具成本价格
        double mouldLength,mouldWidth,mouldHeight;//模具长宽高
        boolean isAuto;//是否自动化
        boolean isInsert;//是否有镶块
        int judgeCraft;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入零件长度,零件宽度,零件高度");
        partLength = sc.nextDouble();
        partWidth = sc.nextDouble();
        partHeight = sc.nextDouble();
        System.out.println("请输入使用工艺方法：");
        System.out.println("1.拉延\n2.切边冲孔\n3.翻边整形\n");

        judgeCraft = sc.nextInt();
        System.out.println("请输入选择手工(flase)或是自动化(true)操作");
        isAuto = sc.nextBoolean();
        System.out.println("请输入有(true)无(false)镶块");
        isInsert = sc.nextBoolean();

        Drawing drawing = new Drawing(partLength,partWidth,partHeight,isAuto);
        CuttingEdgePuchingRoundHoles cuttingEdgePuchingRoundHoles = new CuttingEdgePuchingRoundHoles(partLength,partWidth,partHeight,isAuto);
        FlangingSizing flangingSizing = new FlangingSizing(partLength,partWidth,partHeight,isAuto);

        switch (judgeCraft){
            case 1:
                drawing.calculate();
                mouldLength = drawing.getMouldLength();
                mouldWidth = drawing.getMouldWidth();

                break;
            case 2:
                cuttingEdgePuchingRoundHoles.calculate();
                mouldLength = cuttingEdgePuchingRoundHoles.getMouldLength();
                mouldWidth = cuttingEdgePuchingRoundHoles.getMouldWidth();
                break;
            case 3:
                flangingSizing.calculate();
                mouldLength = flangingSizing.getMouldLength();
                mouldWidth = flangingSizing.getMouldWidth();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + judgeCraft);
        }

        HeightCalculation heightCalculation = new HeightCalculation(partHeight,mouldLength,isAuto,isInsert);
        heightCalculation.mouldHeightCalculation();
        mouldHeight = heightCalculation.getMouldHeight();

        System.out.println("模具长度：" + mouldLength + "\n模具宽度：" + mouldWidth + "\n模具高度：" + mouldHeight);

        //内板件模具成本计算
        InnerPartCalculation innerPartCalculation = new InnerPartCalculation();
        innerPartCalculation.setMouldLength(mouldLength);
        innerPartCalculation.setMouldWidth(mouldWidth);
        innerPartCalculation.priceCalculation();

        price = innerPartCalculation.getPrice();

        System.out.println("模具成本价格：" + price + "元");

    }



}
