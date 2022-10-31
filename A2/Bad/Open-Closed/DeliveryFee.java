public class DeliveryFee {
    float deliveryFee=0.00f;
    public float calculateDeliveryFee(float distanceFromRestaurant){
        if(distanceFromRestaurant <= 2.5){
            deliveryFee=(distanceFromRestaurant * 2);
        }
        else if(distanceFromRestaurant > 2.5 && distanceFromRestaurant < 7.5){
            deliveryFee=(distanceFromRestaurant * 5);
        }
        else{
            deliveryFee=(distanceFromRestaurant * 8);
        }
        return deliveryFee;
    }
}
