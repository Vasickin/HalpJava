public class ShowMenu {
    void showMenu() {
        System.out.println("\n=== ГЛАВНОЕ МЕНЮ ===");
        System.out.println("1. Операторы управления программой");
        System.out.println("2. Циклы");
        System.out.println("3. Классы");
        System.out.println("q. Выход из программы");
    }

    void showControlOperators() {
        System.out.println("\n--- Операторы управления ---");
        System.out.println("1. Оператор if");
        System.out.println("2. Оператор switch");
        System.out.println("3. Тернарный оператор");
        System.out.println("b. Назад в главное меню");
    }

    void showLoops() {
        System.out.println("\n--- Циклы ---");
        System.out.println("1. Цикл for");
        System.out.println("2. Цикл while");
        System.out.println("3. Цикл do-while");
        System.out.println("4. Enhanced for loop");
        System.out.println("b. Назад в главное меню");
    }

    void showClasses() {
        System.out.println("\n--- Классы ---");
        System.out.println("1. Определение классов");
        System.out.println("2. Поля и методы");
        System.out.println("3. Конструкторы");
        System.out.println("4. Модификаторы доступа");
        System.out.println("b. Назад в главное меню");
    }
}
