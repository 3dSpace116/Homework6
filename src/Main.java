public class Main {
    public static void main(String[] args) {

        //Задача 1

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        //Задача 2

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //Задача 3

        for (int i = 0; i <= 17; i=i+2) {
            System.out.println(i);}

        //Задача 4

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);}

        //Задача 5

        for (int i = 1904; i <= 2096; i=i+4) {
            System.out.println(i);}

        //Задача 6

        for (int i = 7; i <= 98; i=i+7) {
            System.out.println(i);}

        //Задача 7

        for (int i = 1; i <= 512; i=i*2) {
            System.out.println(i);}

        //Задача 8

        int mounthProfit=29000;
        int totalMoney=0;

        for (int i = 1; i <= 12; i++) {
            totalMoney=totalMoney+mounthProfit;
            System.out.println("Месяц "+i+", сумма накоплений равна "+totalMoney);}

        //Задача 9

        float MounthProfit=29000f;
        float TotalMoney=0f;
        float Percent=1.01f;

        for (int i = 1; i <= 12; i++) {
            TotalMoney=TotalMoney*Percent+MounthProfit;
            System.out.println("Месяц "+i+", сумма накоплений равна "+TotalMoney);}

        //Задача 10

        int result=0;

        for (int i = 1; i <= 10; i++) {
            result=i*2;
            System.out.println("2*"+i+"="+result);}
    }
}