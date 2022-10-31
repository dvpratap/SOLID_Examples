public class CourierService implements IDeliveryFee{
    private float length;
    private float width;
    private float depth;
    private float weight;
    public void setWeight(float w){
        weight=w;
    }
    public void getPackageDimension(float l, float w, float d){
        length=l;
        width=w;
        depth=d;
    }
    public float totalDimension(){
        return (length + width + depth);
    }
    public float standardCharge(){
        float dimensions=totalDimension();
        float charge=0.00f;
        if(dimensions > 53 && weight > 20){
            charge=(dimensions+weight);
        }
        else{
            charge=(dimensions+weight)+20;
        }
        return charge;
    }
    public float calculateDeliveryFee(float distance){
        float stdCharge = standardCharge();
        float deliveryCharge=0.00f;
        if(distance <= 2.5){
            deliveryCharge= stdCharge+distance;
        }
        else if(distance > 2.5 && distance <= 10){
            deliveryCharge = (stdCharge * 0.05f) + distance + stdCharge;
        }
        else if(distance > 10 && distance <= 100){
            deliveryCharge = (stdCharge * 0.2f) + distance + stdCharge;
        }
        else{
            deliveryCharge = (stdCharge * 2) + distance + stdCharge;
        }
        return deliveryCharge;
    }

}
