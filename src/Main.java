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

    int lyudmilaPavlovna = 23;
    System.out.println(lyudmilaPavlovna);
    int annaSergeevna =27;
    System.out.println(annaSergeevna);
    int ekaterinaAndreevna =30;
    System.out.println(ekaterinaAndreevna);
    int sheetsPaper = 480;
    System.out.println(sheetsPaper);
    int totalStudents = lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
    System.out.println(totalStudents);
    int numberSheetsPaperCalculatedPerStudents = sheetsPaper / totalStudents;
    System.out.println(numberSheetsPaperCalculatedPerStudents);

    int bottleCapacity =16;
    System.out.println(bottleCapacity);
    int performanceTime = 2;
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

    int white = 2;
    System.out.println(white);
    int brown = 4;
    System.out.println(brown);
    int consumptionClass = white + brown;
    System.out.println(consumptionClass);
    int allClasses = 120 / consumptionClass;
    System.out.println(allClasses);
    int consumptionWhitePaint = white * 20;
    System.out.println(consumptionWhitePaint);
    int consumptionBrownPaint = brown * 20;
    System.out.println(consumptionBrownPaint);
    int resultPlaner = consumptionWhitePaint+ consumptionBrownPaint;
    System.out.println(resultPlaner);

    int banana = 80;
    System.out.println(banana);
    int milk = 105;
    System.out.println(milk);
    int iceCream = 200;
    System.out.println(iceCream);
    int rawEgg = 70;
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

    int kilogram = 7;
    System.out.println(kilogram);
    int gram1 = 250;
    System.out.println(gram1);
    int gramm2 = 500;
    System.out.println(gramm2);
    int gram = kilogram * 1000;
    System.out.println(gram);
    int day250 = gram / 250;
    System.out.println(day250);
    int day500 = gram / 500;
    System.out.println(day500);
    int averageLossWess = (gram1 + gramm2) / 2;
    System.out.println(averageLossWess);
    long averageNumberDays = (day250 +day500) / 2;
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
