public class Main {
    public static void main(String[] args) {

        int[] expenses = {156544, 2343, 65434, 239234, 43234};
        int totalExpenses = 0;
        for (int i = 0; i < expenses.length; i++) {
            totalExpenses += expenses[i];
        }
        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей");

        int[] expenses2 = {15435, 65843, 634, 2234, 46534};
        int minExpense = expenses2[0];
        int maxExpense = expenses2[0];
        for (int i = 1; i < expenses2.length; i++) {
            if (expenses2[i] < minExpense) {
                minExpense = expenses2[i];
            }
            if (expenses2[i] > maxExpense) {
                maxExpense = expenses2[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей. Максимальная сумма трат за неделю составила " + maxExpense + " рублей");

        int[] expenses3 = {24214, 8534, 2674987, 546754, 6556};
        int totalExpenses3 = 0;
        for (int a = 0; a < expenses3.length; a++) {
            totalExpenses3 += expenses3[a];
        }
        int averageValue = totalExpenses3 / expenses3.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int b = reverseFullName.length - 1; b >= 0; b--) {
            System.out.print(reverseFullName[b]);
        }

    }
}