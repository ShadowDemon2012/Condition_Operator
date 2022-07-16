public class Main {
    public static void main(String[] args) {
        int clientOs=1;
        int clientDeviceYear=2000;
        if (clientOs ==0 && clientDeviceYear>=2015 )
            System.out.println("Установите версию приложения для iOS по ссылке");
            else {
            if (clientOs ==0 && clientDeviceYear < 2015)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        if (clientOs !=0 && clientDeviceYear>=2015 )
            System.out.println("Установите версию приложения для Android по ссылке");
            else {
            if (clientOs != 0 && clientDeviceYear < 2015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }


    }
}