package DrawingProcess;


/**
 * 拉延成型模高度计算
 */
public class HeightCalculation {

    final int BASE_HANDMADE_LESS_THAN_2000_NO_INSERT = 700;
    final int BASE_HANDMADE_LESS_THAN_2000_INSERT = 750;
    final int BASE_HANDMADE_MORE_THAN_2000_NO_INSERT = 750;
    final int BASE_HANDMADE_MORE_THAN_2000_INSERT = 800;

    private double partHeight;//零件高度
    private double mouldLength;//模具长度
    private boolean isAuto;//是否自动化
    private double mouldHeight;//模具高度
    private boolean isInsert;//是否有镶块

    public HeightCalculation(double partHeight, double mouldLength, boolean isAuto, boolean isInsert) {
        this.partHeight = partHeight;
        this.mouldLength = mouldLength;
        this.isAuto = isAuto;
        this.isInsert = isInsert;
    }


    public void mouldHeightCalculation() {
        if (!isAuto) {
            if (isInsert) {
                if (mouldLength < 2000) {//手工，有镶块，模具长度小于2000
                    mouldHeight = partHeightJudgement(partHeight, BASE_HANDMADE_LESS_THAN_2000_INSERT);
                } else {//手工，有镶块，模具长度大于2000
                    mouldHeight = partHeightJudgement(partHeight, BASE_HANDMADE_MORE_THAN_2000_INSERT);
                }
            } else {
                if (mouldLength < 2000) {//手工，无镶块，模具长度小于2000
                    mouldHeight =  partHeightJudgement(partHeight, BASE_HANDMADE_LESS_THAN_2000_NO_INSERT);
                } else {//手工，无镶块，模具长度大于2000
                    mouldHeight = partHeightJudgement(partHeight, BASE_HANDMADE_MORE_THAN_2000_NO_INSERT);
                }
            }
        }else {//自动化
            if (partHeight < 50){
                mouldHeight = 1000;
            }else if (partHeight >= 51 && partHeight <= 100){
                mouldHeight = 1100;
            }else if (partHeight >= 101 && partHeight <= 150) {
                mouldHeight = 1100;
            }else if (partHeight >= 151 && partHeight <= 200) {
                mouldHeight = 1100;
            }else if (partHeight >= 201 && partHeight <= 250) {
                mouldHeight = 1200;
            }else if (partHeight >= 251 && partHeight <= 300) {
                mouldHeight = 1200;
            }else if (partHeight >= 301 && partHeight <= 350) {
                mouldHeight = 1300;
            }else if (partHeight > 350) {
                mouldHeight = 1300;
            }
        }
    }

        public double partHeightJudgement(double partHeight,double baseHeight){
            if (partHeight < 50){
                return baseHeight;
            }else if (partHeight >= 51 && partHeight <= 100){
                return baseHeight + 50;
            }else if (partHeight >= 101 && partHeight <= 150) {
                return baseHeight + 100;
            }else if (partHeight >= 151 && partHeight <= 200) {
                return baseHeight + 150;
            }else if (partHeight >= 201 && partHeight <= 250) {
                return baseHeight + 200;
            }else if (partHeight >= 251 && partHeight <= 300) {
                return baseHeight + 250;
            }else if (partHeight >= 301 && partHeight <= 350) {
                return baseHeight + 300;
            }else if (partHeight > 350) {
                return baseHeight + 350;
            }
            return baseHeight;
        }

    public double getMouldHeight() {
        return mouldHeight;
    }
}
