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
    System.out.println(a1);
    short a2 = 100;
    System.out.println(a2);
    int a3 = 700;
    System.out.println(a3);
    long a4 = 1000L;
    System.out.println(a4);
    float f = 3.76f;
    System.out.println(f);
    double d =37.53;
    System.out.println(d);

    byte b1 = 67;
    System.out.println(b1);
    short b2 = 569;
    System.out.println(b2);
    short b22 = -159;
    System.out.println(b22);
    int b3 = 27897;
    System.out.println(b3);
    long b4 = 987678965549L;
    System.out.println(b4);
    float f1 = 2.786f;
    System.out.println(f1);
    double d1 = 27.12;
    System.out.println(d1);

    byte LyudmilaPavlovna = 23;
    System.out.println(LyudmilaPavlovna);
    short AnnaSergeevna =27;
    System.out.println(AnnaSergeevna);
    int EkaterinaAndreevna =30;
    System.out.println(EkaterinaAndreevna);
    long SheetsPaper = 480L;
    System.out.println(SheetsPaper);
    int TotalStudents = LyudmilaPavlovna +AnnaSergeevna + EkaterinaAndreevna;
    System.out.println(TotalStudents);
    long NumberSheetsPaperCalculatedPerStudents = SheetsPaper / TotalStudents;
    System.out.println(NumberSheetsPaperCalculatedPerStudents);

    byte BottleCapacity =16;
    System.out.println(BottleCapacity);
    short PerformanceTime = 2;
    System.out.println(PerformanceTime);
    int ProductivityPerMinute = BottleCapacity / PerformanceTime;
    System.out.println(ProductivityPerMinute);
    long TwentyMinutes = ProductivityPerMinute * 20;
    System.out.println(TwentyMinutes);
    long MinutesInDay = 24 * 60;
    System.out.println(MinutesInDay);
    long ProductivityPerDay = ProductivityPerMinute * MinutesInDay;
    System.out.println(ProductivityPerDay);
    long ThreeDays = ProductivityPerDay * 3;
    System.out.println(ThreeDays);
    long Month = ProductivityPerDay * 30;
    System.out.println(Month);

    byte White = 2;
    System.out.println(White);
    short Brown = 4;
    System.out.println(Brown);
    int ConsumptionClass = White + Brown;
    System.out.println(ConsumptionClass);
    int AllClasses = 120 / ConsumptionClass;
    System.out.println(AllClasses);
    int ConsumptionWhitePaint = White * 20;
    System.out.println(ConsumptionWhitePaint);
    int ConsumptionBrownPaint = Brown * 20;
    System.out.println(ConsumptionBrownPaint);
    int ResultPlaner = ConsumptionWhitePaint+ ConsumptionBrownPaint;
    System.out.println(ResultPlaner);

    byte Banana = 80;
    System.out.println(Banana);
    short Milk = 105;
    System.out.println(Milk);
    int IceCream = 200;
    System.out.println(IceCream);
    long RawEgg = 70;
    System.out.println(RawEgg);
    long Bananas = Banana * 5;
    System.out.println(Bananas);
    long Milk2 = Milk * 2;
    System.out.println(Milk2);
    long RawEggs = RawEgg * 4;
    System.out.println(RawEggs);
    long Gramm = Bananas + Milk2 + IceCream + RawEggs;
    System.out.println(Gramm);
    float KG = Gramm / 1000f;
    System.out.println(KG);

    var Kilogram = 7;
    System.out.println(Kilogram);
    var Gram1 = 250;
    System.out.println(Gram1);
    var Gramm2 = 500;
    System.out.println(Gramm2);
    long Gram = Kilogram * 1000;
    System.out.println(Gram);
    long Day250 = Gram / 250;
    System.out.println(Day250);
    long Day500 = Gram / 500;
    System.out.println(Day500);
    long AverageLossWess = (Gram1 +Gramm2) / 2;
    System.out.println(AverageLossWess);
    double AverageNumberDays = Gram / 375f;
    System.out.println(AverageNumberDays);

    int Masha = 67760;
    System.out.println(Masha);
    float NewSalaryM = Masha * 1.10f;
    System.out.println(NewSalaryM);
    int AnnualIncomeM = Masha * 12;
    System.out.println(AnnualIncomeM);
    float AnnualIncomeAfteM = NewSalaryM * 12;
    System.out.println(AnnualIncomeAfteM);
    float DifferenceM = AnnualIncomeAfteM - AnnualIncomeM;
    System.out.println(DifferenceM);

    int Denis = 83690;
    System.out.println(Denis);
    float NewSalaryD = Denis * 1.10f;
    System.out.println(NewSalaryD);
    int AnnualIncomeD = Denis * 12;
    System.out.println(AnnualIncomeD);
    float AnnualIncomeAfteD = NewSalaryD * 12;
    System.out.println(AnnualIncomeAfteD);
    float DifferenceD = AnnualIncomeAfteD - AnnualIncomeD;
    System.out.println(DifferenceD);

    int Christina = 76230;
    System.out.println(Christina);
    float NewSalaryC = Christina * 1.10f;
    System.out.println(NewSalaryC);
    int AnnualIncomeC = Christina * 12;
    System.out.println(AnnualIncomeC);
    float AnnualIncomeAfteC = NewSalaryC * 12;
    System.out.println(AnnualIncomeAfteC);
    float DifferenceC = AnnualIncomeAfteC - AnnualIncomeC;
    System.out.println(DifferenceC);
















}
