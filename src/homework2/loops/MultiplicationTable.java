package homework2.loops;

/**
 * 1.5 Вывести таблицу умножения в консоль.
 */
public class MultiplicationTable {

    public static String fillMultiplicationTable(int fromNumber, int toNumber) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            for (int j = fromNumber; j < toNumber; j++) {
                int count = i * j;
                if (count >= 10 && i >= 10) {
                    builder.append(" ").append(j).append(" x ").append(i).append(" = ").
                            append(count).append("|");
                } else if (count >= 10) {
                    builder.append(" ").append(j).append(" x ").append(i).append(" = ").
                            append(count).append(" |");
                } else {
                    builder.append(" ").append(j).append(" x ").append(i).append(" = ").
                            append(count).append("  |");
                }
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}

