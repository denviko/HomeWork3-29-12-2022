public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();



    }
    public static void Task1(){
        System.out.println("Задача 1");
        int snow = 1234567891;
        System.out.println("Значение переменной Snow " + "с типом int" + " равно " + snow);
        byte winter = -25;
        System.out.println("Значение переменной winter " + "с типом byte " + "равно " + winter);
        short ChristmasTree = 12345;
        System.out.println("Значение переменной ChristmasTree " + "с типом short " + "равно " + ChristmasTree);
        long snowman = 9223372036854775807L;
        System.out.println("Значение переменной snowman " + "с типом long " + "равно " + snowman);
        float santaClaus = 1.123456f;
        System.out.println("Значение переменной santaClaus " + "с типом float " + "равно " + santaClaus);
        double snowFlake = 1.123456789;
        System.out.println("Значение переменной snowFlake " + "с типом double " + "равно " + snowFlake);
    }
    public static void Task2(){
        System.out.println("Задача 2");
        float santaClaus = 27.12f;
        System.out.println("Значению " + santaClaus + " присвоин тип float");
        long snowman = 987678965549L;
        System.out.println("Значению " + snowman + " присвоин тип long");
        float SantaClaus = 2.786f;
        System.out.println("Значению " + SantaClaus + " присвоин тип float");
short cristmasTree = 569;
        System.out.println("Значению " + cristmasTree + " присвоин тип short");
short CristmasTree = -159;
        System.out.println("Значению " + CristmasTree + " присвоин тип short");
        short cristmasTreee = 27897;
        System.out.println("Значению " + cristmasTreee + " присвоин тип short");
        byte winter = 67;
        System.out.println("Значению " + winter + " присвоин тип byte");
    }
    public static void Task3(){
        System.out.println("Задача 3");
        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        short totalPaper = 480;
        byte threeClasses = (byte) (LP + AS + EA);
        byte paperEachStudent = (byte) (totalPaper / threeClasses);
System.out.println("На каждого ученика рассчитано " + paperEachStudent + " листов бумаги");
    }
    public static void Task4() {
        System.out.println("Задача 4");
        byte twoMinutes = 2;
        byte bottles = 16;
        byte twentyMinutes = 20;
        short performanceTwentyMinutes = (short) (twentyMinutes / twoMinutes * bottles);
        System.out.println("За " + twentyMinutes + " минут" + " машина произвела " + performanceTwentyMinutes + " штук бутылок");
        short oneDay = 1440;
        short performanceOneDay = (short) (oneDay / twoMinutes * bottles);
        System.out.println("За сутки машина произвела " + performanceOneDay + " штук бутылок");
        short threeDays = 4320;
        int performanceThreeDays = threeDays / twoMinutes * bottles;
        System.out.println("За 3 дня машина произвела " + performanceThreeDays + " штук бутылок");
        int oneMonth = 43200;
        int performanceOneMonth = oneMonth / twoMinutes * bottles;
        System.out.println("За 1 месяц машина произвела " + performanceOneMonth + " штук бутылок");

    }
    public static void Task5() {
        System.out.println("Задача 5");
        byte totalCansPaints = 120;
        byte twoCansWhitePaint = 2;
        byte fourCansBrownPaint = 4;
        byte numberCansPerClassroom = (byte) (twoCansWhitePaint + fourCansBrownPaint);
        byte totalClassrooms = (byte) (totalCansPaints / numberCansPerClassroom);
        byte totalCansWhitePaint = (byte) (twoCansWhitePaint * totalClassrooms);
        byte totalCansBrownPaint = (byte) (fourCansBrownPaint * totalClassrooms);
        System.out.println("В школе, где " + totalClassrooms + " классов, нужно " + totalCansWhitePaint + " банок белой краски и " + totalCansBrownPaint + " банок коричневой краски.");
    }

    public static void Task6() {
        System.out.println("Задача 6");
byte totalBananas = 5;
byte weightOneBanana = 80;
short totalMilk = 2;
byte weight100mlMilk = 105;
byte totalIceCream = 2;
byte weightOneBriquetteIceCream = 100;
byte totalEggs = 4;
byte weightOneEgg = 70;
short breakfastWeightGrams = (short) ((totalBananas * weightOneBanana) + (totalMilk * weight100mlMilk) + (totalIceCream * weightOneBriquetteIceCream) + (totalEggs * weightOneEgg));
float breakfastWeightKilograms = (float) ((float) breakfastWeightGrams * 0.001);
System.out.println("Вес (количество граммов) такого спортзавтрака составляет " + breakfastWeightGrams + " грамм., и " + breakfastWeightKilograms + " килограмм.");

    }
    public static void Task7() {
        System.out.println("Задача 7");
short needLoseSevenKilograms = 7000;
short weightLoss250Grams = 250;
short weightLoss500Grams = 500;
byte NumberDaysLose250Grams = (byte) (needLoseSevenKilograms / weightLoss250Grams);
byte NumberDaysLose500Grams = (byte) (needLoseSevenKilograms / weightLoss500Grams);
byte numberDaysAverage = (byte) ((NumberDaysLose250Grams + NumberDaysLose500Grams) / 2);
System.out.println(NumberDaysLose250Grams + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + weightLoss250Grams + "" + " грамм, а если будет терять по " + weightLoss500Grams + " грамм то потребуется " + NumberDaysLose500Grams + " дней.");
System.out.println("В среднем, чтобы добиться результата похудения, спортсмену потребуется " + numberDaysAverage + " день.");
    }
    public static void Task8() {
        System.out.println("Задача 8");
        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        int MashaSalaryPerYear = Masha * 12;
        int DenisSalaryPerYear = Denis * 12;
        int KristinaSalaryPerYear = Kristina * 12;
        int MashaTenPercent = (int) ((Masha * 0.1) + Masha);
        int DenisTenPercent = (int) ((Denis * 0.1) + Denis);
        int KristinaTenPercent = (int) ((Kristina * 0.1) + Kristina);
        int MashSalaryPerYearTenPercent = MashaTenPercent * 12;
        int DenisSalaryPerYearTenPercent = DenisTenPercent * 12;
        int KristinaSalaryPerYearTenPercent = KristinaTenPercent * 12;
        int MashaAnnualIncomeDifference = MashSalaryPerYearTenPercent - MashaSalaryPerYear;
        int DenisAnnualIncomeDifference = DenisSalaryPerYearTenPercent - DenisSalaryPerYear;
        int KristinaAnnualIncomeDifference = KristinaSalaryPerYearTenPercent - KristinaSalaryPerYear;
        System.out.println("Маша, теперь получает " + MashaTenPercent + " рублей. Годовой доход вырос на " + MashaAnnualIncomeDifference + " рублей.");
System.out.println("Денис, теперь получает " + DenisTenPercent + " рублей. Годовой доход вырос на " + DenisAnnualIncomeDifference + " рублей." );
System.out.println("Кристина, теперь получает " + KristinaTenPercent + " рублей. Годовой доход вырос на " + KristinaAnnualIncomeDifference + " рублей.");

    }
}