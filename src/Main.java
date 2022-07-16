public class Main {
    public static void main(String[] args) {
        int deliveryDistance = 80;
        int deliveryTime = 0;
        if (deliveryDistance <=20) { deliveryTime =deliveryTime + 1;
            System.out.println("Потребуется дней "+ deliveryTime);
        }
        if (deliveryDistance >20 && deliveryDistance <=60) {deliveryTime = deliveryTime +2;
            System.out.println("Потребуется дней "+ deliveryTime);
                   }
        if (deliveryDistance >60 && deliveryDistance <=100) {deliveryTime = deliveryTime +3;
            System.out.println("Потребуется дней "+ deliveryTime);
        }


    }
}