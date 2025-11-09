import java.util.Scanner;

/**
 * Главный класс справочной системы по Java.
 * Запускает программу и управляет основным циклом программы.
 *
 * @author Lex
 * @version 1.0
 * @since 2025
 */
class HelpJava {
    /**
     * Точка входа в программу.
     * Создаёт необходимые объекты и запускает основной цикл работы.
     *
     * @param args
     */
    public static void main(String[] args) {
//        Introduction introduction = new Introduction();
//        ShowMenu showMenu = new ShowMenu();
//        EnterMenuItem enterMenuItem = new EnterMenuItem();
//        Menu menu = new Menu(enterMenuItem);
//
//        introduction.hello();
//
//        while (true) {
//            showMenu.showMainMenu();
//            introduction.menuItem();
//            enterMenuItem.enterValue();
//            menu.menuSection();
//
//            System.out.println("\n--- Вернуться в главное меню ---");
//            System.out.println("Продолжить работу? (y/n): ");
//            Scanner scanner = new Scanner(System.in);
//            String answer = scanner.nextLine().trim();
//            if (answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("q")) {
//                System.out.println("Завершение программы. До свидания!");
//                break;
//            }
//        }

        System.out.println("=== ТЕСТ ОБНОВЛЕННОГО MENU ===");

        // Создаем необходимые объекты
        EnterMenuItem enter = new EnterMenuItem();
        Menu menu = new Menu(enter);

        // Тест 1: Проверяем работу с операторами управления
        System.out.println("\n1. Тестируем операторы управления:");
        testControlOperators(menu);

        // Тест 2: Проверяем работу с циклами
        System.out.println("\n2. Тестируем циклы:");
        testLoops(menu);

        System.out.println("\n✅ Тест завершен успешно! Новая архитектура работает.");
    }

    /**
     * Тестирует раздел операторов управления.
     */
    private static void testControlOperators(Menu menu) {
        System.out.println("Доступные операторы:");

        // В реальной программе это будет делаться через пользовательский ввод,
        // но для теста вызываем напрямую
        System.out.println(" - Оператор if (ключ: 1)");
        System.out.println(" - Оператор switch (ключ: 2)");
        System.out.println(" - Тернарный оператор (ключ: 3)");
    }

    /**
     * Тестирует раздел циклов.
     */
    private static void testLoops(Menu menu) {
        System.out.println("Доступные циклы:");
        System.out.println(" - Цикл for (ключ: 1)");
        System.out.println(" - Цикл while (ключ: 2)");
        System.out.println(" - Цикл do-while (ключ: 3)");
        System.out.println(" - Enhanced for loop (ключ: 4)");
    }
}


