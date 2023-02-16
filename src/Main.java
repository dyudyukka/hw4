
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int a = 16;
        int b = 21;
        System.out.println("Можно ли водить при возрасте " + a);
        if (a >= 18) {
            System.out.println("Ты можешь водить");
        }
        if (a <= 18) {
            System.out.println("Ты не можешь водить");
        }
        System.out.println("Можно ли водить при возрасте " + b);
        if (b >= 18) {
            System.out.println("Ты можешь водить");
        } else {
            System.out.println("Ты не можешь водить");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int t1 = 5;
        int t2 = 1;
        System.out.println("1.На улице " +t1+ " градусов,");
        if (t1 >= 5) {
            System.out.println(" можно идти без шапки");
        } else {
            System.out.println(" нужно надеть шапку");
        }
        System.out.println("2.На улице " +t2+ " градус(ов),");
        if (t2 >= 5) {
            System.out.println(" можно идти без шапки");
        } else {
            System.out.println(" нужно надеть шапку");
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int V1 = 57;
        int V2 = 70;
        System.out.println("1.Если скорость " +V1+ " км/ч,");
        if (V1 > 60) {
            System.out.println(" придется заплатить штраф");
        } else {
            System.out.println(" можно ездить спокойно");
        }
        System.out.println("2.Если скорость " +V2+ " км/ч,");
        if (V2 > 60) {
            System.out.println(" придется заплатить штраф");
        } else {
            System.out.println(" можно ездить спокойно");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int age1 = 4;
        int age2 = 10;
        int age3 = 21;
        int age4 = 28;

        System.out.println("1.Ваш возраст " +age1+", вам нужно ходить ");
        if (age1 >= 2 && age1 <= 6) {
            System.out.println(" в садик");
        }
        if (age1 >= 7 && age1 <= 18) {
            System.out.println(" в школу");
        }
        if (age1 >= 19 && age1 <= 24) {
            System.out.println(" в университет");
        }
        if (age1 >= 24 ) {
            System.out.println(" на работу");
        }

        System.out.println("2.Ваш возраст " +age2+", вам нужно ходить ");
        if (age2 >= 2 && age2 <= 6) {
            System.out.println(" в садик");
        }
        if (age2 >= 7 && age2 <= 18) {
            System.out.println(" в школу");
        }
        if (age2 >= 19 && age2 <= 24) {
            System.out.println(" в университет");
        }
        if (age2 >= 24 ) {
            System.out.println(" на работу");
        }

        System.out.println("3.Ваш возраст " +age3+", вам нужно ходить ");
        if (age3 >= 2 && age3 <= 6) {
            System.out.println(" в садик");
        }
        if (age3 >= 7 && age3 <= 18) {
            System.out.println(" в школу");
        }
        if (age3 >= 19 && age3 <= 24) {
            System.out.println(" в университет");
        }
        if (age3 >= 24 ) {
            System.out.println(" на работу");
        }

        System.out.println("4.Ваш возраст " +age4+", вам нужно ходить ");
        if (age4 >= 2 && age4 <= 6) {
            System.out.println(" в садик");
        }
        if (age4 >= 7 && age4 <= 18) {
            System.out.println(" в школу");
        }
        if (age4 >= 19 && age4 <= 24) {
            System.out.println(" в университет");
        }
        if (age4 >= 24 ) {
            System.out.println(" на работу");
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int pAge1 = 4;
        int pAge2 = 10;
        int pAge3 = 16;

        System.out.println("1.Ваш возраст " +pAge1);
        if (pAge1 < 5 ) {
            System.out.println("вам нельзя кататься на аттракционе");
        }
        if (pAge1 >= 5 && pAge1 < 14) {
            System.out.println(" можно кататься на атракционе в сопровождении взрослого");
        }
        if (pAge1 > 14 ) {
            System.out.println(" можно кататься на атракционе без сопровождения");
        }

        System.out.println("2.Ваш возраст " +pAge2);
        if (pAge2 < 5 ) {
            System.out.println("вам нельзя кататься на аттракционе");
        }
        if (pAge2 >= 5 && pAge2 < 14) {
            System.out.println(" можно кататься на атракционе в сопровождении взрослого");
        }
        if (pAge2 > 14 ) {
            System.out.println(" можно кататься на атракционе без сопровождения");
        }

        System.out.println("3.Ваш возраст " +pAge3);
        if (pAge3 < 5 ) {
            System.out.println("вам нельзя кататься на аттракционе");
        }
        if (pAge3 >= 5 && pAge3 < 14) {
            System.out.println(" можно кататься на атракционе в сопровождении взрослого");
        }
        if (pAge3 > 14 ) {
            System.out.println(" можно кататься на атракционе без сопровождения");
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");
        int pMestVsego = 102;
        int pMestSid = 60;
        int pMestStoya = pMestVsego-pMestSid;
        int pMestSidZanyato = 57;
        int pMestStoyaZanyato = 24;
        int pVsegoFree = pMestVsego - (pMestStoyaZanyato+pMestSidZanyato);
        if (pMestStoyaZanyato+pMestSidZanyato < pMestVsego) {
            System.out.println("Всего свободных мест в вагоне -> " + pVsegoFree);
            int pMestSidFree = pMestSid - pMestSidZanyato;
            System.out.println("из них сидячих -> " + pMestSidFree);
            int pMestStoyaFree = pMestStoya - pMestStoyaZanyato;
            System.out.println("стоячих -> " + pMestStoyaFree);
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int pOne = 2;
        int pTwo = 40;
        int pThree = 57;
        System.out.println("найти наибольшее число из " +pOne+"  "+pTwo+"  "+pThree);
        if (pOne>pTwo && pOne>pThree) {
            System.out.println("найти наибольшее число из трех ->" + pOne);
        }
        if (pOne<pTwo && pTwo>pThree) {
            System.out.println("найти наибольшее число из трех ->" + pTwo);
        }
        if (pThree>pTwo && pOne<pThree) {
            System.out.println("найти наибольшее число из трех ->" + pThree);
        }
    }
}
