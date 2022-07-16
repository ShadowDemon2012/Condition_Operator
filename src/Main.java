public class Main {
    public static void main(String[] args) {
        int deliveryDistance = 95;
        int deliveryTime = 1;

        if (deliveryDistance>20) { deliveryTime++;}

        if (deliveryDistance >60) {deliveryTime++;
        }
        System.out.println("Потребуется дней "+ deliveryTime);


    }
}