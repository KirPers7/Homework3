public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        byte fingers = 5;
        short nights = 1001;
        int miles = 2000000000;
        long milkyWayStars = 100000000000L;
        float pi = 3.14f;
        double something = 0.0123456789;
        System.out.println("Значение переменной fingers с типом byte равно "+fingers);
        System.out.println("Значение переменной nights с типом byte равно "+nights);
        System.out.println("Значение переменной miles с типом byte равно "+miles);
        System.out.println("Значение переменной milkyWayStars с типом byte равно "+milkyWayStars);
        System.out.println("Значение переменной pi с типом byte равно "+pi);
        System.out.println("Значение переменной something с типом byte равно "+something);
        System.out.println();

        //Задача 2
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println();

        //Задача 3
        System.out.println("Задача 3");
        byte lpPupils = 23;
        byte asPupils = 27;
        byte eaPupils = 30;
        short listsAmount = 480;
        short onePupilListsCount = (short) (listsAmount/(lpPupils+asPupils+eaPupils));
        System.out.println("На каждого ученика рассчитано "+onePupilListsCount+" листов бумаги");
        System.out.println();

        //Задача 4
        System.out.println("Задача 4");
        int bottles = 16;
        int fixedTime = 2;
        int machineCapacity = (bottles/fixedTime);
        System.out.println("За 20 минут машина произвела "+machineCapacity*20+" штук бутылок");
        System.out.println("За сутки машина произвела "+machineCapacity*24*60+" штук бутылок");//указаны сутки, то есть все 24 часа
        System.out.println("Решение 1: машина работает 8 часов в день 22 дня в месяц");
        System.out.println("За 3 дня машина произвела "+machineCapacity*3*8*60+" штук бутылок");//указано 3 дня, а не трое суток - берем три восьмичасовых рабочих дня
        System.out.println("За месяц машина произвела "+machineCapacity*22*8*60+" штук бутылок");//указан месяц - 22 рабочих дня по 8 часов
        System.out.println("Решение 2: машина работает непереставая весь указанный период времени");
        System.out.println("За 3 дня машина произвела "+machineCapacity*3*24*60+" штук бутылок");
        System.out.println("За месяц машина произвела "+machineCapacity*30*24*60+" штук бутылок");
        System.out.println();

        //Задача 5
        System.out.println("Задача 5");
        short colorsCan = 120;
        short classes = (short) (colorsCan/(2+4));
        short whiteColor = (short) (classes*2);
        short brownColor = (short) (classes*4);
        System.out.println("В школе, где "+classes+" классов, нужно "+whiteColor+" банок белой краски и "+brownColor+" банок коричневой краски");
        System.out.println();

        //Задача 6
        System.out.println("Задача 6");
        short bananaWeight = 80;//1 банан = 80 г
        short milkWeight = 105;//100 мл молока = 105 г
        short iceCreamWeight = 100;// 1 брикет мороженого = 100 г
        short eggWeight = 70;// 1 яйцо = 70 г
        short blendWeightG = (short) (bananaWeight*5 + milkWeight*2 + iceCreamWeight*2 + eggWeight*4);
        float blendWeightKg = (float) blendWeightG/1000;
        System.out.println(blendWeightG + " г");
        System.out.println(blendWeightKg + " кг");
        System.out.println();

        //Задача 7
        System.out.println("Задача 7");
        short focusWeight = 7*1000;
        short slowWeightLoss = (short) (focusWeight/250);
        short fastWeightLoss = (short) (focusWeight/500);
        short averageWeightLoss = (short) ((slowWeightLoss+fastWeightLoss)/2);
        System.out.println("При похудении на 250 г в день спортсмен сбросит 7 кг своего веса за "+slowWeightLoss+" дней");
        System.out.println("При похудении на 500 г в день спортсмен сбросит 7 кг своего веса за "+fastWeightLoss+" дней");
        System.out.println("При средней скорости похудения спортсмен сбросит 7 кг своего веса за "+averageWeightLoss+" дней");
        System.out.println();

        //Задача 8
        System.out.println("Задача 8");
        int salaryM = 67760;
        int salaryD = 83690;
        int salaryK = 76230;
        int increasedSalaryM = salaryM*110/100;
        int increasedSalaryD = salaryD*110/100;
        int increasedSalaryK = salaryK*110/100;
        int currentYearSalaryM = salaryM*12;
        int currentYearSalaryD = salaryD*12;
        int currentYearSalaryK = salaryK*12;
        int increasedYearSalaryM = increasedSalaryM*12;
        int increasedYearSalaryD = increasedSalaryD*12;
        int increasedYearSalaryK = increasedSalaryK*12;
        System.out.println("Маша теперь получает "+increasedSalaryM+" рублей. Годовой доход вырос на "+(increasedYearSalaryM-currentYearSalaryM)+" рублей");
        System.out.println("Денис теперь получает "+increasedSalaryD+" рублей. Годовой доход вырос на "+(increasedYearSalaryD-currentYearSalaryD)+" рублей");
        System.out.println("Кристина теперь получает "+increasedSalaryK+" рублей. Годовой доход вырос на "+(increasedYearSalaryK-currentYearSalaryK)+" рублей");
    }
}