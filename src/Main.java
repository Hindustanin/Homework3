public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");

        int ot = 100_500;
        byte topota = -28;
        short kopit = 31_665;
        long pil = -8_903_9541_234L;
        float poPoly = -3.15f;
        double letit = 8.800555535;

        System.out.println("Значение переменной 'ot' с типом 'int' = " + ot);
        System.out.println("Значение переменной 'topota' с типом 'byte' = " + topota);
        System.out.println("Значение переменной 'kopit' с типом 'short' = " + kopit);
        System.out.println("Значение переменной 'pil' с типом 'long' = " + pil);
        System.out.println("Значение переменной 'poPoly' с типом 'float' = " + poPoly);
        System.out.println("Значение переменной 'letit' с типом 'double' = " + letit);

        // Задача 2
        System.out.println();
        System.out.println("Задача 2");

        float znachenie1 = 27.12f;
        long znachenie2 = 987_678_965_549L;
        float znachenie3 = 2.786f;
        short znachenie4 = 569;
        short znachenie5 = -159;
        short znachenie6 = 27_897;
        byte znachenie7 = 67;

        System.out.println("Значение переменной 1 с типом 'float' = " + znachenie1);
        System.out.println("Значение переменной 2 с типом 'long' = " + znachenie2);
        System.out.println("Значение переменной 3 с типом 'float' = " + znachenie3);
        System.out.println("Значение переменной 4 с типом 'short' = " + znachenie4);
        System.out.println("Значение переменной 5 с типом 'short' = " + znachenie5);
        System.out.println("Значение переменной 6 с типом 'short' = " + znachenie6);
        System.out.println("Значение переменной 7 с типом 'byte' = " + znachenie7);

        // Задача 3
        System.out.println();
        System.out.println("Задача 3");

        byte vP = 23;
        byte aS = 27;
        byte eA = 30;
        short listov = 480;
        int listovNaYchenika = listov/(vP+aS+eA);

        System.out.println("На каждого ученика расчитано " + listovNaYchenika + " листов бумаги");

        // Задача 4
        System.out.println();
        System.out.println("Задача 4");

        byte vvodnieBytilki = 16;
        byte vvodnieMinyti = 2;
        int za20Minut = vvodnieBytilki/vvodnieMinyti*20;
        int sytki = vvodnieBytilki/vvodnieMinyti*60*24;
        int dnya3 = sytki*3;
        int mesac = sytki*30;

        System.out.println("За 20 минут машина произвела " + za20Minut + " штук бутылок");
        System.out.println("За сутки машина произвела " + sytki + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + dnya3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + mesac + " штук бутылок");

        // Задача 5
        System.out.println();
        System.out.println("Задача 5");

        byte vsegoBankok = 120;
        byte beloiNaKlass = 2;
        byte korichnevoiNaKlass = 4;
        int klassov = vsegoBankok/(beloiNaKlass+korichnevoiNaKlass);
        int beloi = klassov*beloiNaKlass;
        int korichnedoi = klassov*korichnevoiNaKlass;

        System.out.println("В школе, где " + klassov + " классов нужно " + beloi + " банок белой краски и " + korichnedoi + " банок коричневой краски");

        // Задача 6
        System.out.println();
        System.out.println("Задача 6");

        short banani = 5*80;
        short moloko = 200/100*105;
        short morogenoe = 2*100;
        short yaica = 4*70;
        int bludo = banani+moloko+morogenoe+yaica;
        float bludoKG = bludo/1000f;

        System.out.println("Блюдо " + bludo + " грамм");
        System.out.println("Блюдо " + bludoKG + " килограмм");

        // Задача 7
        System.out.println();
        System.out.println("Задача 7");

        byte sbrosit = 7;
        short izKgVGr = 1000;
        int sbrositGr = sbrosit*izKgVGr;
        short racion1 = 250;
        short racion2 = 500;
        int po250 = sbrositGr/racion1;
        int po500 = sbrositGr/racion2;
        int vSrednem = (po250+po500)/2;

        System.out.println("При потере по 250 грамм в день потребуется " + po250 + " дней");
        System.out.println("При потере по 500 грамм в день потребуется " + po500 + " дней");
        System.out.println("В среднем потребуется " + vSrednem + " дней");

        // Задача 8
        System.out.println();
        System.out.println("Задача 8");

        int masha = 67_760;
        int denis = 83_690;
        int kristina = 76_230;
        float premia = 1.1f;
        byte god = 12;
        float mashaPremia = masha*premia;
        float denisPremia = denis*premia;
        float kristinaPremia = kristina*premia;
        float mashaRaznicaGod = (mashaPremia-masha)*god;
        float denisRaznicaGod = (denisPremia-denis)*god;
        float kristinaRaznicaGod = (kristinaPremia-kristina)*god;

        System.out.println("Маша теперь получает " + mashaPremia + " рублей. Годовой доход вырос на " + mashaRaznicaGod + " рублей");
        System.out.println("Денис теперь получает " + denisPremia + " рублей. Годовой доход вырос на " + denisRaznicaGod + " рублей");
        System.out.println("Кристина теперь получает " + kristinaPremia + " рублей. Годовой доход вырос на " + kristinaRaznicaGod + " рублей");

    }
    }