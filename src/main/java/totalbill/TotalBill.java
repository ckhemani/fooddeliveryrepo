package totalbill;

import Interface.IFormatCvs;
import deliveryapp.DeliveryApp;

public class TotalBill implements IFormatCvs{
    private float priceOfItem;
    private static final float TAXRATEINPERCENT = (float) 0.06;
    private static final int FUELSURCHARGE = 1;
    private static final float TIPRATEINPERCENT = (float) 0.1;
    private static final float DELIVERYFEE = (float) 2.99;

    public TotalBill() {
    }

    public TotalBill(float priceOfItem, float deliveryFee) {
        this.priceOfItem = priceOfItem;
    }

    public float getPriceOfItem() {
        return priceOfItem;
    }

    public void setPriceOfItem(float priceOfItem) {
        this.priceOfItem = priceOfItem;
    }


    public String totalCost(){
//        int totalCost = this.priceOfItem + this.deliveryFee;
        float totalCost = this.priceOfItem + this.priceOfItem*TAXRATEINPERCENT + this.priceOfItem * TIPRATEINPERCENT + FUELSURCHARGE + DELIVERYFEE;
        String floatToString = String.format("%.2f", totalCost);
        return floatToString;

    }


    public float toCvsFile1() {
        return getPriceOfItem();
    }

    public String toCvsFile() {
        return "TotalBill";
    }

    @Override
    public String toString() {
        return "TotalBill{" +
                "priceOfItem=" + getPriceOfItem() +
                ", deliveryFee=" + DELIVERYFEE +
                ", TAXRATEINPERCENT=" + TAXRATEINPERCENT +
                ", TIPRATEINPERCENT=" + TIPRATEINPERCENT +
                ", FUELSURCHARGE=" + FUELSURCHARGE +
                '}';
    }
}




