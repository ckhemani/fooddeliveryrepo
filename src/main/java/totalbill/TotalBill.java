package totalbill;

public class TotalBill {
    private float priceOfItem;
    private static final float TAXRATEINPERCENT = (float) 0.06;
    private static final int FUELSURCHARGE = 1;
    private static final float TIPRATEINPERCENT = (float) 0.1;
    private float deliveryFee;

    public TotalBill() {
    }

    public TotalBill(float priceOfItem, float deliveryFee) {
        this.priceOfItem = priceOfItem;
        this.deliveryFee = deliveryFee;
    }

    public float getPriceOfItem() {
        return priceOfItem;
    }

    public void setPriceOfItem(float priceOfItem) {
        this.priceOfItem = priceOfItem;
    }

    public float getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(float deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public float totalCost(){
//        int totalCost = this.priceOfItem + this.deliveryFee;
        float totalCost = this.priceOfItem + this.priceOfItem*TAXRATEINPERCENT + this.priceOfItem * TIPRATEINPERCENT + FUELSURCHARGE + this.deliveryFee;
        return totalCost;
    }

    @Override
    public String toString() {
        return "TotalBill{" +
                "priceOfItem=" + getPriceOfItem() +
                ", deliveryFee=" + getDeliveryFee() +
                ", TAXRATEINPERCENT=" + TAXRATEINPERCENT +
                ", TIPRATEINPERCENT=" + TIPRATEINPERCENT +
                ", FUELSURCHARGE=" + FUELSURCHARGE +
                '}';
    }
}




