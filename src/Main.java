import java.util.Scanner;

public class Main {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean menu = true;
        int taskSelection = 0;

        while (menu){
            System.out.println("Введи номер задания ..");
            taskSelection = sc.nextInt();
            switch (taskSelection){
                case 1:
                    First();
                break;

                case 2:
                    Second();
                break;

                case 3:
                    Third();
                break;

                case 4:
                    Fourth();
                break;

                case 5:
                    Fifth();
                break;

                case 6:
                    Sixth();
                break;

                case 7:
                    Seventh();
                break;

                case 8:
                    Eighth();
                break;

                case 9:
                    Ninth();
                break;

                case 10:
                    Tenth();
                break;

                case 11:
                    Eleventh();
                break;

                case 0:
                    System.out.println("___EXIT___");
                    menu = false;
                break;

                default:
                    System.out.println("не правильно, попробуйте еще раз ..");
                break;
            }
        }
    }
    // task # 1
    public static void First(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Число A");
        float a = sc.nextFloat();

        System.out.println("Число B");
        float b = sc.nextFloat();

        float c = a + b;
        System.out.println("сумма чисел A + B = " + c);
    }

    // task # 2
    public static void Second(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите высоту треугольника");
        float h = sc.nextFloat();

        System.out.println("Введите ширину прямоугльника");
        float a = sc.nextFloat();

        float s = (float)0.5 * a * h;
        System.out.println("S треугольника = " + s);
    }

    // task # 3
    public static void Third(){
        Scanner sc = new Scanner(System.in);

        System.out.println("первая сторона треугольника");
        float a = sc.nextFloat();

        System.out.println("вторая сторона треугольника");
        float b = sc.nextFloat();

        System.out.println("третья сторона треугольника");
        float c = sc.nextFloat();

        float p = a + b + c;
        System.out.println("периметр треугольника - " + p);

        float sp = p / 2; // semiperimeter

        float s = (float)Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));

        System.out.println("Площадь прямоугольника = " + s);
    }

    // task # 4
    public static void Fourth(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число");
        float a = sc.nextFloat();

        System.out.println("Введите второе число");
        float b = sc.nextFloat();

        if (a == b)
            System.out.println("числа равны");
        else
            System.out.println("числа не равны");

        if (a % b == 0)
            System.out.println("делится без остатка");
        else
            System.out.println("делится с остатком");

        if (a > b)
            System.out.println("a > b");
        else
            System.out.println("a < b");
    }

    // task # 5
    public static void Fifth(){
        Scanner sc = new Scanner(System.in);

        System.out.println("введите число a ..");
        float a = sc.nextFloat();

        System.out.println("введите число b ..");
        float b = sc.nextFloat();

        System.out.println("введите число c ..");
        float c = sc.nextFloat();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        if(a > b && a > c)
            System.out.println("а наибольшее число");

        if (b > a && b > c)
            System.out.println("b наибольшее число");

        if (c > a && c > b)
            System.out.println("с наибольшее число");

        if (a < b && a < c)
            System.out.println("a наименьшее число");

        if (b < a && b < c)
            System.out.println("b наименьшее число");

        if (c < a && c < b)
            System.out.println("c наименьшее число");

        if ((a > b && a < c) || (a > c && a < a))
            System.out.println("A - промежуточное число между B и C");

        if ((b > a && b < c) || (b > c && b < a))
            System.out.println("B - промежуточное число между A и C");

        if ((c > a && c < b) || (c > b && c < a))
            System.out.println("C - промежуточное число между A и B");
    }

    // task # 6
    public static void Sixth (){
        Scanner sc = new Scanner(System.in);

        System.out.println("числоа a");
        float a = sc.nextFloat();

        System.out.println("число b");
        float b = sc.nextFloat();

        System.out.println("число c");
        float c = sc.nextFloat();

        if (a == b || a == c){
            System.out.println("A ровняется одному из чисел");
        }

        if (c == a || c == b)
            System.out.println("C ровняется одному из чисел");

        if (b == a || b == c)
            System.out.println("B ровняется одному из чисел");

        if (a > b || a > c)
            System.out.println("A больше одного из других чисел");

        if (b > a || b > c)
            System.out.println("B больше одного из других чисел");

        if (c > a || c > b)
            System.out.println("C больше одного из других чисел");
    }

    // task # 7
    public static void Seventh(){
        Scanner sc = new Scanner(System.in);
        String color = "";

        System.out.println("Введите название цвета. Варианты выбора:");
        System.out.println("black\nred\nblue\ngreen\nyellow\npurple\ncyan\nwhite");
        color = sc.next();

        if(color.equals("blue"))
            System.out.println(ANSI_BLUE + "Hello World");

        if (color.equals("red"))
            System.out.println(ANSI_RED + "Hello World");

        if (color.equals("green"))
            System.out.println(ANSI_GREEN + "Hello World");

        if (color.equals("cyan"))
            System.out.println(ANSI_CYAN + "Hello World");

        if (color.equals("purple"))
            System.out.println(ANSI_PURPLE + "Hello World");

        if (color.equals("white"))
            System.out.println(ANSI_WHITE + "Hello World");

        if (color.equals("yellow"))
            System.out.println(ANSI_YELLOW + "Hello World");

//        System.out.println("введите по 2 символа на каждый цвет в формате - 5f");
//        System.out.println("введите крассный");
//        String colorRed = sc.nextLine();
//
//        System.out.println("введите зеленый");
//        String colorGreen = sc.nextLine();
//
//        System.out.println("введите синий");
//        String colorBlue = sc.nextLine();
//
//        String colorRGB = "#" + colorRed + colorGreen + colorBlue;
//
//        int r = Integer.valueOf(colorRGB.substring(1,3), 16);
//        int g = Integer.valueOf(colorRGB.substring(3,5), 16);
//        int b = Integer.valueOf(colorRGB.substring(5,7), 16);

    }

    // task # 8
    public static void Eighth (){
        Scanner sc = new Scanner(System.in);
        String color1 = "";
        String color2 = "";
        String color3 = "";

        System.out.println("Выберите 3 цвета. Варианты выбора:");
        System.out.println("red\nblue\ngreen\nyellow\npurple\ncyan\nwhite");

        System.out.println("первый цвет ..");
        color1 = sc.next();

        System.out.println("второй цвет ..");
        color2 = sc.next();

        System.out.println("третий цвет ..");
        color3 = sc.next();

        // top color
        if(color1.equals("blue")) {
            System.out.println(ANSI_BLUE + "        _");
            System.out.println(ANSI_BLUE + "       ___");
            System.out.println(ANSI_BLUE + "      _____");
        }

        if(color1.equals("red")) {
            System.out.println(ANSI_RED + "        _");
            System.out.println(ANSI_RED + "       ___");
            System.out.println(ANSI_RED + "      _____");
        }

        if (color1.equals("green")) {
            System.out.println(ANSI_GREEN + "        _");
            System.out.println(ANSI_GREEN + "       ___");
            System.out.println(ANSI_GREEN + "      _____");
        }

        if (color1.equals("cyan")){
            System.out.println(ANSI_CYAN + "        _");
            System.out.println(ANSI_CYAN + "       ___");
            System.out.println(ANSI_CYAN + "      _____");
        }

        if (color1.equals("purple")){
            System.out.println(ANSI_PURPLE + "        _");
            System.out.println(ANSI_PURPLE + "       ___");
            System.out.println(ANSI_PURPLE + "      _____");
        }

        if (color1.equals("white")){
            System.out.println(ANSI_WHITE + "        _");
            System.out.println(ANSI_WHITE + "       ___");
            System.out.println(ANSI_WHITE + "      _____");
        }

        if (color1.equals("yellow")){
            System.out.println(ANSI_YELLOW + "        _");
            System.out.println(ANSI_YELLOW + "       ___");
            System.out.println(ANSI_YELLOW + "      _____");
        }

        // mid color
        if(color2.equals("blue")) {
            System.out.println(ANSI_BLUE + "     _______");
            System.out.println(ANSI_BLUE + "    _________");
            System.out.println(ANSI_BLUE + "   ___________");
        }

        if(color2.equals("red")) {
            System.out.println(ANSI_RED + "     _______");
            System.out.println(ANSI_RED + "    _________");
            System.out.println(ANSI_RED + "   ___________");
        }

        if (color2.equals("green")) {
            System.out.println(ANSI_GREEN + "     _______");
            System.out.println(ANSI_GREEN + "    _________");
            System.out.println(ANSI_GREEN + "   ___________");
        }

        if (color2.equals("cyan")){
            System.out.println(ANSI_CYAN + "     _______");
            System.out.println(ANSI_CYAN + "    _________");
            System.out.println(ANSI_CYAN + "   ___________");
        }

        if (color2.equals("purple")){
            System.out.println(ANSI_PURPLE + "     _______");
            System.out.println(ANSI_PURPLE + "    _________");
            System.out.println(ANSI_PURPLE + "   ___________");
        }

        if (color2.equals("white")){
            System.out.println(ANSI_WHITE + "     _______");
            System.out.println(ANSI_WHITE + "    _________");
            System.out.println(ANSI_WHITE + "   ___________");
        }

        if (color2.equals("yellow")){
            System.out.println(ANSI_YELLOW + "     _______");
            System.out.println(ANSI_YELLOW + "    _________");
            System.out.println(ANSI_YELLOW + "   ___________");
        }

        //bottom color
        if(color3.equals("blue")) {
            System.out.println(ANSI_BLUE + "  _____________");
            System.out.println(ANSI_BLUE + " _______________");
            System.out.println(ANSI_BLUE + "_________________");
        }

        if(color3.equals("red")) {
            System.out.println(ANSI_RED+ "  _____________");
            System.out.println(ANSI_RED+ " _______________");
            System.out.println(ANSI_RED + "_________________");
        }

        if (color3.equals("green")) {
            System.out.println(ANSI_GREEN + "  _____________");
            System.out.println(ANSI_GREEN + " _______________");
            System.out.println(ANSI_GREEN + "_________________");
        }

        if (color3.equals("cyan")){
            System.out.println(ANSI_CYAN + "  _____________");
            System.out.println(ANSI_CYAN + " _______________");
            System.out.println(ANSI_CYAN + "_________________");
        }

        if (color3.equals("purple")){
            System.out.println(ANSI_PURPLE + "  _____________");
            System.out.println(ANSI_PURPLE + " _______________");
            System.out.println(ANSI_PURPLE + "_________________");
        }

        if (color3.equals("white")){
            System.out.println(ANSI_WHITE + "  _____________");
            System.out.println(ANSI_WHITE + " _______________");
            System.out.println(ANSI_WHITE + "_________________");
        }

        if (color3.equals("yellow")){
            System.out.println(ANSI_YELLOW + "  _____________");
            System.out.println(ANSI_YELLOW + " _______________");
            System.out.println(ANSI_YELLOW + "_________________");
        }

        System.out.print(ANSI_RESET);
    }

    // task # 9
    public static void Ninth(){
        Scanner sc = new Scanner(System.in);
        String str1 = "";
        String str2 = "";
        int num1 = 0;

        System.out.println("первая фраза");
        str1 = sc.next();

        System.out.println("вторая фраза");
        str2 = sc.next();

        System.out.println("количество отступов");
        num1 = sc.nextInt();

        StringBuffer newStr = new StringBuffer(str1);
        newStr.insert(num1, str2);
        System.out.println(newStr);
    }

    // task # 10
    public static void Tenth(){
        Scanner sc = new Scanner(System.in);
        String str1 = "";
        String str2 = "";

        System.out.println("введите первую фразу ..");
        str1 = sc.next();

        System.out.println("введите вторую фразу ..");
        str2 = sc.next();
    }

    // task # 11
    public static void Eleventh(){
        // coming soon ..
    }
}