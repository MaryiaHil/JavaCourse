package homework1;

public class OperatorsPrecedence {
    public static void main(String[] args) {
        int y = 2;
        int x = 8;

        int a = 5 + 2 / 8; // результат: 5, т.к. 2/8 = 0 (числа после запятой отбрасываются), 5 + 0 = 5
        System.out.println(a);

        int b = (5 + 2) / 8; // результат: 0, т.к. 5 + 2 = 7, 7 / 8 = 0 (числа после запятой отбрасываются)
        System.out.println(b);

        int c = (5 + y++) / 8; // результат: 0, т.к. 5 + 2 = 7, 7 / 8 = 0 (числа после запятой отбрасываются)
        // При этом в итоге в переменной y сохраняется 3
        System.out.println(c);

        y = 2;
        int d = (5 + y++) / --x; // результат: 1, т.к. 5 + 2 = 7, --8 = 7, 7 / 7 = 1
        System.out.println(d);


        y = 2;
        x = 8;
        int e = (5 * 2 >> y++) / --x; // результат: 0, т.к. 5 * 2 = 10, 10 >> 2 (или 10 / 4) = 2
        // --8 = 7, 2 / 7 = 0 (числа после запятой отбрасываются)
        System.out.println(e);

        y = 2;
        x = 8;
        int f = (5 + 7 > 20 ? 68 : 22 * 2 >> y++) / --x; // результат: 1, т.к. 5 + 7 = 12, 12 > 20 = false,
        // поэтому выполняется ветка else: 22 * 2 = 44, 44 >> 2 (или 44 / 4) = 11,
        // --8 = 7, 11 / 7 = 1 (числа после запятой отбрасываются)
        System.out.println(f);

        y = 2;
        x = 8;
        //int g = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> y++) / --x; // не скомпилируется, т.к. результат 68 >= 68 = false,
        // а результат 22 * 2 >> y++ = 11 (int)


        boolean h = 6 - 2 > 3 && 12 * 12 <= 119; // результат: false, т.к. 6 - 2 > 3 = true,
        // 12 * 12 (т.е.144) <= 119 = false, true AND false = false
        System.out.println(h);

        boolean i = true && false; // результат: false, т.к. true AND false = false
        System.out.println(i);

    }
}
