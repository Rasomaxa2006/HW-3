//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }

    byte a1 = 1;
    System.out.println("Значение переменной a1 с типом byte равно " + a1);
    short a2 = 100;
    System.out.println("Значение переменной a2 с типом short равно " + a2);
    int a3 = 700;
    System.out.println("Значение переменной a3 с типом int равно " + a3);
    long a4 = 1000L;
    System.out.println("Значение переменной a4 с типом long равно " + a4);
    float f = 3.76f;
    System.out.println("Значение переменной f с типом float равно " + f);
    double d =37.53;
    System.out.println("Значение переменной d с типом doude равно " + d);

    byte b1 = 67;
    System.out.println(b1);
    short b2 = 569;
    System.out.println(b2);
    short aB1 = -159;
    System.out.println(aB1);
    int b3 = 27897;
    System.out.println(b3);
    long b4 = 987678965549L;
    System.out.println(b4);
    float f1 = 2.786f;
    System.out.println(f1);
    double d1 = 27.12;
    System.out.println(d1);

    var LyudmilaPavlovna = 23;
    System.out.println(LyudmilaPavlovna);
    var AnnaSergeevna =27;
    System.out.println(AnnaSergeevna);
    var EkaterinaAndreevna =30;
    System.out.println(EkaterinaAndreevna);
    var SheetsPaper = 480;
    System.out.println(SheetsPaper);
    int totalStudents = LyudmilaPavlovna + AnnaSergeevna + EkaterinaAndreevna;
    System.out.println(totalStudents);
    int numberSheetsPaperCalculatedPerStudents = SheetsPaper / totalStudents;
    System.out.println(numberSheetsPaperCalculatedPerStudents);

    var bottleCapacity =16;
    System.out.println(bottleCapacity);
    var performanceTime = 2;
    System.out.println(performanceTime);
    int productivityPerMinute = bottleCapacity / performanceTime;
    System.out.println(productivityPerMinute);
    long twentyMinutes = productivityPerMinute * 20;
    System.out.println(twentyMinutes);
    long minutesInDay = 24 * 60;
    System.out.println(minutesInDay);
    long productivityPerDay = productivityPerMinute * minutesInDay;
    System.out.println(productivityPerDay);
    long threeDays = productivityPerDay * 3;
    System.out.println(threeDays);
    long month = productivityPerDay * 30;
    System.out.println(month);

    var White = 2;
    System.out.println(White);
    var Brown = 4;
    System.out.println(Brown);
    int consumptionClass = White + Brown;
    System.out.println(consumptionClass);
    int allClasses = 120 / consumptionClass;
    System.out.println(allClasses);
    int consumptionWhitePaint = White * 20;
    System.out.println(consumptionWhitePaint);
    int consumptionBrownPaint = Brown * 20;
    System.out.println(consumptionBrownPaint);
    int resultPlaner = consumptionWhitePaint+ consumptionBrownPaint;
    System.out.println(resultPlaner);

    var banana = 80;
    System.out.println(banana);
    var milk = 105;
    System.out.println(milk);
    var iceCream = 200;
    System.out.println(iceCream);
    var rawEgg = 70;
    System.out.println(rawEgg);
    long bananas = banana * 5;
    System.out.println(bananas);
    long milk2 = milk * 2;
    System.out.println(milk2);
    long rawEggs = rawEgg * 4;
    System.out.println(rawEggs);
    long gramm = bananas + milk2 + iceCream + rawEggs;
    System.out.println(gramm);
    float kG = gramm / 1000f;
    System.out.println(kG);

    var kilogram = 7;
    System.out.println(kilogram);
    var gram1 = 250;
    System.out.println(gram1);
    var gramm2 = 500;
    System.out.println(gramm2);
    long gram = kilogram * 1000;
    System.out.println(gram);
    long day250 = gram / 250;
    System.out.println(day250);
    long day500 = gram / 500;
    System.out.println(day500);
    long averageLossWess = (gram1 +gramm2) / 2;
    System.out.println(averageLossWess);
    double averageNumberDays = gram / 375f;
    System.out.println(averageNumberDays);

    int masha = 67760;
    System.out.println(masha);
    float newSalaryM = masha * 1.10f;
    System.out.println(newSalaryM);
    int annualIncomeM = masha * 12;
    System.out.println(annualIncomeM);
    float annualIncomeAfteM = newSalaryM * 12;
    System.out.println(annualIncomeAfteM);
    float differenceM = annualIncomeAfteM - annualIncomeM;
    System.out.println(differenceM);

    int denis = 83690;
    System.out.println(denis);
    float newSalaryD = denis * 1.10f;
    System.out.println(newSalaryD);
    int annualIncomeD = denis * 12;
    System.out.println(annualIncomeD);
    float annualIncomeAfteD = newSalaryD * 12;
    System.out.println(annualIncomeAfteD);
    float differenceD = annualIncomeAfteD - annualIncomeD;
    System.out.println(differenceD);

    int christina = 76230;
    System.out.println(christina);
    float newSalaryC = christina * 1.10f;
    System.out.println(newSalaryC);
    int annualIncomeC = christina * 12;
    System.out.println(annualIncomeC);
    float annualIncomeAfteC = newSalaryC * 12;
    System.out.println(annualIncomeAfteC);
    float differenceC = annualIncomeAfteC - annualIncomeC;
    System.out.println(differenceC);
















}
