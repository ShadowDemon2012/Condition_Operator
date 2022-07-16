public class Main {
    public static void main(String[] args) {
        int year=2008;
        boolean leapYear = (year % 4 ==0 && year % 100!=0 || year %400==0);
        if ( leapYear ) System.out.println("год високосный");
        else System.out.println("год не високосный");
    }
}