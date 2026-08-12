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

    byte ЛюдмилаПавловна = 23;
    System.out.println(ЛюдмилаПавловна);
    short АннаСергеевна =27;
    System.out.println(АннаСергеевна);
    int ЕкатеринаАндреевна =30;
    System.out.println(ЕкатеринаАндреевна);
    long ЛистыБумаги = 480L;
    System.out.println(ЛистыБумаги);
    int ВсегоУчеников = ЛюдмилаПавловна +АннаСергеевна + ЕкатеринаАндреевна;
    System.out.println(ВсегоУчеников);
    long НаКаждогоУченикаРассчитаноЛистовБумаги = ЛистыБумаги / ВсегоУчеников;
    System.out.println(НаКаждогоУченикаРассчитаноЛистовБумаги);

    byte ПроизводительностьБутылок =16;
    System.out.println(ПроизводительностьБутылок);
    short ВремяПроизводительности = 2;
    System.out.println(ВремяПроизводительности);
    int ПроизводительностьВминуту = ПроизводительностьБутылок / ВремяПроизводительности;
    System.out.println(ПроизводительностьВминуту);
    long ДвадцатьМинут = ПроизводительностьВминуту * 20;
    System.out.println(ДвадцатьМинут);
    long МинутВсутках = 24 * 60;
    System.out.println(МинутВсутках);
    long ПроизводительностьВсутки = ПроизводительностьВминуту * МинутВсутках;
    System.out.println(ПроизводительностьВсутки);
    long ТроеСуток = ПроизводительностьВсутки * 3;
    System.out.println(ТроеСуток);
    long Месяц = ПроизводительностьВсутки * 30;
    System.out.println(Месяц);

    byte белая = 2;
    System.out.println(белая);
    short коричневая = 4;
    System.out.println(коричневая);
    int расходнакласс = белая + коричневая;
    System.out.println(расходнакласс);
    int всегоклассов = 120 / расходнакласс;
    System.out.println(всегоклассов);
    int расходбелойкраки = белая * 20;
    System.out.println(расходбелойкраки);
    int расходкоричневойкраски = коричневая * 20;
    System.out.println(расходкоричневойкраски);
    int ИтогБанок = расходбелойкраки + расходкоричневойкраски;
    System.out.println(ИтогБанок);

    byte банан = 80;
    System.out.println(банан);
    short молоко = 105;
    System.out.println(молоко);
    int МороженноеПломбир = 200;
    System.out.println(МороженноеПломбир);
    long ЯйцоСырое = 70;
    System.out.println(ЯйцоСырое);
    long бананы = банан * 5;
    System.out.println(бананы);
    long молоко2 = молоко * 2;
    System.out.println(молоко2);
    long ЯйцаСырые = ЯйцоСырое * 4;
    System.out.println(ЯйцаСырые);
    long грамм = бананы + молоко2 + МороженноеПломбир + ЯйцаСырые;
    System.out.println(грамм);
    float кг = грамм / 1000f;
    System.out.println(кг);

    byte килограмм = 7;
    System.out.println(килограмм);
    short грамм1 = 250;
    System.out.println(грамм1);
    int грамм2 = 500;
    System.out.println(грамм2);
    long г = килограмм * 1000;
    System.out.println(г);
    long День250 = г / 250;
    System.out.println(День250);
    long День500 = г / 500;
    System.out.println(День500);
    long СредняяПотеряВесса = (грамм1 +грамм2) / 2;
    System.out.println(СредняяПотеряВесса);
    double СреднееКоличествоДней = г / 375f;
    System.out.println(СреднееКоличествоДней);

    int Маша = 67760;
    System.out.println(Маша);
    float НоваяЗарплатаМ = Маша * 1.10f;
    System.out.println(НоваяЗарплатаМ);
    int ГодовойДоходМ = Маша * 12;
    System.out.println(ГодовойДоходМ);
    float ГодовойДоходПослеМ = НоваяЗарплатаМ * 12;
    System.out.println(ГодовойДоходПослеМ);
    float РазницаМ = ГодовойДоходПослеМ - ГодовойДоходМ;
    System.out.println(РазницаМ);

    int Денис = 83690;
    System.out.println(Денис);
    float НоваяЗарплатаД = Денис * 1.10f;
    System.out.println(НоваяЗарплатаД);
    int ГодовойДоходД = Денис * 12;
    System.out.println(ГодовойДоходД);
    float ГодовойДоходПослеД = НоваяЗарплатаД * 12;
    System.out.println(ГодовойДоходПослеД);
    float РазницаД = ГодовойДоходПослеД - ГодовойДоходД;
    System.out.println(РазницаД);

    int Кристина = 76230;
    System.out.println(Кристина);
    float НоваяЗарплатаК = Кристина * 1.10f;
    System.out.println(НоваяЗарплатаК);
    int ГодовойДоходК = Кристина * 12;
    System.out.println(ГодовойДоходК);
    float ГодовойДоходПослеК = НоваяЗарплатаК * 12;
    System.out.println(ГодовойДоходПослеК);
    float РазницаК = ГодовойДоходПослеК - ГодовойДоходК;
    System.out.println(РазницаК);
















}
