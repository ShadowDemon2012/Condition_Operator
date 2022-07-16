public class Main {
        public static void main(String[] args) {
        int age=19;
        int salary=60_000;
        float baseStake=0.1F;
        float maxPayment=salary/2;
        int timeCredit=12;
        int wantedSum= 330_000;
        if (age >=18 && age<23) baseStake=baseStake+0.01F;
           else if (age>=23 && age<30) baseStake=baseStake+0.005F;
        if (salary>=80_000) baseStake= baseStake-0.007F;
        float monthPayment=(baseStake*wantedSum+wantedSum)/timeCredit;
        if (maxPayment>monthPayment && age>=18)
                System.out.println("Максимальный платеж при ЗП "+ salary+" равен " + maxPayment +" Рублей. Платеж по кредиту " + monthPayment + " рублей. Одобрено");
        else System.out.println("Максимальный платеж при ЗП "+ salary+" равен " + maxPayment +" Рублей. Платеж по кредиту " + monthPayment + " рублей. Отказано");

    }
}