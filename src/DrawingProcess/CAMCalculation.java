package DrawingProcess;

import java.util.Scanner;

public class CAMCalculation {

    private double partLength,partWidth,partHeight;//零件长宽高初始数据
    private double mouldLength = 0,mouldWidth = 0,mouldHeight = 0;//模具长宽高
    private boolean isNormal;

    public CAMCalculation(double partLength, double partWidth, double partHeight, boolean isNormal) {
        this.partLength = partLength;
        this.partWidth = partWidth;
        this.partHeight = partHeight;
        this.isNormal = isNormal;
    }

    public void calculation(){
       if (isNormal){
           standardMethod();
       }else {
           otherMethod();
       }
    }

    /**
     * 标准CAM方法
     */
    private void standardMethod(){
        mouldLength = partLength + 300;
        mouldWidth = partWidth +300;
    }

    /**
     * 非标CAM
     */
    private void otherMethod(){
        mouldLength = partLength + 350;
        mouldWidth = partWidth +350;
    }

    public void normalMethod(){
        if (isNormal){
            standardMethod();
        }else{
            otherMethod();
        }
    }

    public void interactMethod(){
        if (isNormal){
            mouldLength = partLength + 500;
            mouldWidth = partWidth + 500;
        }else {
            mouldLength = partLength + 600;
            mouldWidth = partWidth + 600;
        }
    }

    public double getPartLength() {
        return partLength;
    }

    public void setPartLength(double partLength) {
        this.partLength = partLength;
    }

    public double getPartWidth() {
        return partWidth;
    }

    public void setPartWidth(double partWidth) {
        this.partWidth = partWidth;
    }

    public double getPartHeight() {
        return partHeight;
    }

    public void setPartHeight(double partHeight) {
        this.partHeight = partHeight;
    }

    public double getMouldLength() {
        return mouldLength;
    }

    public void setMouldLength(double mouldLength) {
        this.mouldLength = mouldLength;
    }

    public double getMouldWidth() {
        return mouldWidth;
    }

    public void setMouldWidth(double mouldWidth) {
        this.mouldWidth = mouldWidth;
    }

    public double getMouldHeight() {
        return mouldHeight;
    }

    public void setMouldHeight(double mouldHeight) {
        this.mouldHeight = mouldHeight;
    }

    public boolean isNormal() {
        return isNormal;
    }

    public void setNormal(boolean normal) {
        isNormal = normal;
    }
}
