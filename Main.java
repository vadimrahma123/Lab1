import java.util.Scanner;
import java.io.PrintStream;
public class Main {
    // вводим PrintStream для удобного вывода данных
    public static PrintStream out = System.out;
    // вводим Scanner для удобного ввода данных
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // считываем данные 4-х целых чисел и 1 натурального
        out.println("введите 4 целых числа");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        out.println("введите делитель");
        int x = in.nextInt();
        // считаем остаток от деления на х
        int a1 = a % x;
        int b1 = b % x;
        int c1 = c % x;
        int d1 = d % x;
        // вводим переменные для мин остатка и буквы, а также "флаги равности"
        int mn1;
        int mn2;
        int mn11;
        int mn22;
        int mn;
        String lett1;
        String lett2;
        boolean equals = false;
        boolean equals1 = false;

        if (a1 <= b1) {
            mn1 = a1;
            mn11 = a;
            lett1 = "a";
            if (a1 == b1) {
                equals = true;
            }
        } else {
            mn1 = b1;
            mn11 = b;
            lett1 = "b";
        }
        if (c1 <= d1) {
            mn2 = c1;
            lett2 = "c";
            mn22 = c;
            if (c1 == d1) {
                equals1 = true;
            }
        } else {
            mn2 = d1;
            mn22 = d;
            lett2 = "d";
        }
        if (mn11 <= mn22) {
            mn = mn11;
        } else {
            mn = mn22;
        }

        if (mn1 <= mn2) {
            if (mn1 == mn2) {
                if (equals == equals1) {
                    out.println("все элементы равны. Изнач число: " +  a);
                } else {
                    if (equals) {
                        out.println("a b " + lett2 + " имеют одинаковый остаток. Изнач число: " + a);
                    } else {
                        if (equals1) {
                            out.println("c d " + lett1 + " имеют одинаковый остаток. Изнач число: " + mn);
                        } else {
                            out.println(lett1 + lett2 + " имеют одинаковый остаток. Изнач число: " + mn);
                        }
                    }
                }
            } else {
                if (equals) {
                    out.println("a b имеют одинак остаток. Изнач число: " + a);
                }
                else {
                    out.println(lett1 + " имеет мин остаток. Изнач число: " + mn);
                }
            }
        }
        else {
            if (equals) {
                out.println("c d имеют мин остаток. Изнач число: " + c);
            } else {
                out.println(lett2 + " имеет мин остаток. Изнач число: " + mn);
            }
        }
    }
}