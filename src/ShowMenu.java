/**
 * Класс для отображения различных меню программы.
 * Содержит методы для показа главного меню и подменю разделов.
 */
public class ShowMenu {

    /**
     * Отображает главное меню программы с основными разделами.
     * Показывает доступные варианты выбора и команду для выхода.
     */
    void showMainMenu() {
        System.out.println("\n=== ГЛАВНОЕ МЕНЮ ===");
        System.out.println("1. Операторы управления программой");
        System.out.println("2. Циклы");
        System.out.println("3. Классы");
        System.out.println("q. Выход из программы");
    }

    /**
     * Отображает подменю раздела "Операторы управления".
     * Содержит список операторов и команду для возврата назад.
     */
    void showControlOperators() {
        System.out.println("\n--- Операторы управления ---");
        System.out.println("1. Оператор if");
        System.out.println("2. Оператор switch");
        System.out.println("3. Тернарный оператор");
        System.out.println("b. Назад в главное меню");
    }

    /**
     * Отображает подменю раздела "Циклы".
     * Содержит различные типы циклов в Java.
     */
    void showLoops() {
        System.out.println("\n--- Циклы ---");
        System.out.println("1. Цикл for");
        System.out.println("2. Цикл while");
        System.out.println("3. Цикл do-while");
        System.out.println("4. Enhanced for loop");
        System.out.println("b. Назад в главное меню");
    }

    /**
     * Отображает подменю раздела "Классы".
     * Содержит основные концепции работы с классами в Java.
     */
    void showClasses() {
        System.out.println("\n--- Классы ---");
        System.out.println("1. Определение классов");
        System.out.println("2. Поля и методы");
        System.out.println("3. Конструкторы");
        System.out.println("4. Модификаторы доступа");
        System.out.println("b. Назад в главное меню");
    }
}
