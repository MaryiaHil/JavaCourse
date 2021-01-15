package homework2.loops;

/**
 * 1.5 Вывести таблицу умножения в консоль.
 */
public class MultiplicationTableMain {
    public static void main(String[] args) {
        printMultiplicationTable();
    }

    public static void printMultiplicationTable() {
        System.out.println("----------------------------------------------------");
        fillTable(2, 6);
        System.out.println("----------------------------------------------------");
        fillTable(6, 10);
        System.out.println("----------------------------------------------------");
    }

    public static void fillTable(int fromNumber, int toNumber) {
        for (int i = 1; i <= 10; i++) {
            for (int j = fromNumber; j < toNumber; j++) {
                int count = i * j;
                if (count >= 10 && i >= 10) {
                    System.out.print(" " + j + " x " + i + " = " + count + "|");
                } else if (count >= 10) {
                    System.out.print(" " + j + " x " + i + " = " + count + " |");
                } else {
                    System.out.print(" " + j + " x " + i + " = " + count + "  |");
                }
            }
            System.out.println("");
        }
    }
}

