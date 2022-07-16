//Людям старше (или равно) 23 лет мы предоставляем лимит в размере 3 зарплат.
//Людям младше 23 лет мы предоставляем лимит в размере 2 зарплат.
//Если заработная плата клиента выше (или равно) 50 тысяч, мы увеличиваем лимит в 1.2 раза.
//Если заработная плата выше (или равно) 80 тысяч, мы увеличиваем лимит в 1.5 раза.
//Наша задача: написать программу, которая показывает, какую сумму на кредитке может получить клиент.
public class Main {
        public static void main(String[] args) {
        int age=19;
        float salary=58_000F;
        float creditLimit= salary;
        if (age >=23) creditLimit=salary * 3;
           else if (age>=18 && age<23) creditLimit= salary*2;
        if (salary >=50_000 && salary <80_000) creditLimit = creditLimit*1.2F;
           else if (salary>=80_000) creditLimit= creditLimit*1.5F;
            System.out.println("Мы готовы выдать вам карту с лимитом " + (int) creditLimit+ " рублей");


    }
}