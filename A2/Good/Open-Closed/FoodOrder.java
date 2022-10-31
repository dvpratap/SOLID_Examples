
    public class FoodOrder implements IDeliveryFee{
        private float distance;
        private int itemPrice;
        private int quantity;
        public void setDistance(float dist){
            distance=dist;
        }
        public float getDistance(){
            return distance;
        }
        public void setItemPrice(int price){
            itemPrice=price;
        }
        public int getItemPrice(){
            return itemPrice;
        }
        public void setQuantity(int qty){
            quantity=qty;
        }
        public int getQuantity(){
            return quantity;
        }

        public float calculateDeliveryFee(float distance){
            float deliveryFee=0.00f;
            if(distance <= 2.5){
                deliveryFee=(distance * 2);
            }
            else if(distance > 2.5 && distance < 7.5){
                deliveryFee=(distance * 5);
            }
            else{
                deliveryFee=(distance * 8);
            }
            return deliveryFee;
        }

        public float generateTotalBill(){
            int bill = (itemPrice * quantity);
            float deliveryFee = calculateDeliveryFee(distance);
            float totalbill = bill + deliveryFee;
            return totalbill;
        }
    }


