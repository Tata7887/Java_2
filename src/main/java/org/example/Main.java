//Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
//        Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
//        *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
//        Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
//        Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
//        Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
//        *Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
        System.out.println("Введите строку 1");
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        System.out.println("Введите строку 2");
        String s2 = in.nextLine();
        if (s1.contains(s2)) {
            int startIndex = s1.indexOf(s2);
            System.out.printf("Строка '%s' содержит строку '%s' начиная с символа под номером %d\n", s1, s2, startIndex);
        } else {
            System.out.printf("Строка '%s' не содержит строку '%s'\n", s1, s2);
        }

        //Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
        StringBuilder str = new StringBuilder(s1);
        if (str.reverse().toString().equals(s2)) {
            System.out.printf("Строка '%s' является вращением '%s'\n", s1, s2);
        } else {
            System.out.printf("Строка '%s' не является вращением '%s'\n", s1, s2);
        }

        //*Напишите программу, чтобы перевернуть строку с помощью рекурсии.
        System.out.printf("Перевернутая строка '%s' = \n", s1);
        System.out.println(reverse(s1));

        //Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
        StringBuilder mathStr = new StringBuilder();
        System.out.println("Введите число 1");
        int i1 = in.nextInt();
        System.out.println("Введите число 2");
        int i2 = in.nextInt();

        mathStr.append(i1).append(" + ").append(i2).append(" = ").append(i1 + i2).append("\n");
        mathStr.append(i1).append(" - ").append(i2).append(" = ").append(i1 - i2).append("\n");
        mathStr.append(i1).append(" * ").append(i2).append(" = ").append(i1 * i2).append("\n");

        System.out.println("Математкиа");
        System.out.println(mathStr);

        //Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
        System.out.println("Математкиа без равно");
        mathStr.insert(mathStr.indexOf("="), "равно");
        mathStr.delete(mathStr.indexOf("="), mathStr.indexOf("=") + 1);
        System.out.println(mathStr);

        //Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        mathStr.replace(mathStr.indexOf("="), mathStr.indexOf("=") + 1, "равно");
        System.out.println(mathStr);

        //*Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
        StringBuilder thousandEq1 = new StringBuilder();
        thousandEq1.append("====================================================================================================");
        thousandEq1.append("====================================================================================================");
        thousandEq1.append("====================================================================================================");
        thousandEq1.append("====================================================================================================");
        thousandEq1.append("====================================================================================================");
        thousandEq1.append("====================================================================================================");
        thousandEq1.append("====================================================================================================");
        thousandEq1.append("====================================================================================================");
        thousandEq1.append("====================================================================================================");
        thousandEq1.append("====================================================================================================");
        long startTime1 = System.currentTimeMillis();
        while (thousandEq1.toString().contains("=")) {
            thousandEq1.insert(thousandEq1.indexOf("="), "равно");
            thousandEq1.delete(thousandEq1.indexOf("="), thousandEq1.indexOf("=") + 1);
        }
        long endTime1 = System.currentTimeMillis();


        StringBuilder thousandEq2 = new StringBuilder();
        thousandEq2.append("====================================================================================================");
        thousandEq2.append("====================================================================================================");
        thousandEq2.append("====================================================================================================");
        thousandEq2.append("====================================================================================================");
        thousandEq2.append("====================================================================================================");
        thousandEq2.append("====================================================================================================");
        thousandEq2.append("====================================================================================================");
        thousandEq2.append("====================================================================================================");
        thousandEq2.append("====================================================================================================");
        thousandEq2.append("====================================================================================================");

        long startTime2 = System.currentTimeMillis();
        while (thousandEq2.toString().contains("=")) {
            thousandEq2.replace(thousandEq2.indexOf("="), thousandEq2.indexOf("=") + 1, "равно");
        }
        long endTime2 = System.currentTimeMillis();

        System.out.println("время выполнения insert delete");
        System.out.println(endTime1 - startTime1);

        System.out.println("время выполнения replace");
        System.out.println(endTime2 - startTime2);
    }

    //*Напишите программу, чтобы перевернуть строку с помощью рекурсии.
    private static String reverse(String s) {
        if (s.length() == 1) {
            return s;
        } else {
            return s.substring(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
        }
    }

}



 