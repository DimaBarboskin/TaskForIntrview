public class Main {
    public static void main(String[] args) {
        int amountOfNumbersWithReminder = printAmountOfNumbersWithReminder(1000, 7, 2, 2);
        System.out.println(amountOfNumbersWithReminder);
    }
    /**
     * Выводит на экран числа из выборки от 1 до {@param max}, которые делятся на {@param divider}
     * с остатком {@param reminder} с интервалом {@param collectionDivider} и возвращает их общее кол-во
     * @param max максимальное значение в выборке (от 1 до {@param collectionDivider})
     * @param divider делитель числа из выборки
     * @param reminder остаток от деления числа из выборки на {@param divider}
     * @param collectionDivider интервал с которым выводит числа на экран(пример: каждое 2ое)
     * @return общее кол-во чисел, подходящих под условие
     */
    public static int printAmountOfNumbersWithReminder(int max, int divider, int reminder, int collectionDivider) {
        if (max < 0 || divider <= reminder || reminder < 0 || collectionDivider <= 0)
            throw new IllegalArgumentException("Передаются некорректные значения");
        int amountOfNumbersWithReminder = 0;
        int current = reminder;
        int count = 1;
        while (current < max) {
            if (count % collectionDivider == 0)
                System.out.print(current + " ");
            current = current + divider;
            amountOfNumbersWithReminder++;
            count++;
        }
        System.out.println();
        return amountOfNumbersWithReminder;
    }

}
