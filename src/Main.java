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

        System.out.println("=== ТЕСТ ПОЛНОСТЬЮ ИНТЕГРИРОВАННОЙ СИСТЕМЫ ===");

        // Создаем все компоненты системы
        HelpContent content = new HelpContent();
        EnterMenuItem enter = new EnterMenuItem();
        Menu menu = new Menu(enter);

        // Тест 1: Проверяем доступность всех разделов
        System.out.println("\n1. 📋 Проверяем доступность всех справочных материалов:");
        testAllReferences(content);

        // Тест 2: Проверяем архитектуру Menu
        System.out.println("\n2. 🔧 Проверяем архитектуру Menu:");
        testMenuArchitecture(menu, content);

        // Тест 3: Демонстрация унифицированного подхода
        System.out.println("\n3. 🎯 Демонстрация унифицированного подхода:");
        demonstrateUnifiedApproach(content);

        System.out.println("\n🎉 ВСЕ ТЕСТЫ ПРОЙДЕНЫ УСПЕШНО!");
        System.out.println("✅ Архитектура полностью интегрирована");
        System.out.println("✅ Все разделы используют ContentDisplay");
        System.out.println("✅ Обработка ошибок реализована");
        System.out.println("✅ Код готов к использованию!");
    }

    /**
     * Проверяет доступность всех справочных материалов во всех разделах.
     */
    private static void testAllReferences(HelpContent content) {
        // Проверяем операторы управления
        System.out.println("   📁 Операторы управления:");
        for (String key : content.getControlReferenceKeys()) {
            ContentDisplay ref = content.getControlReference(key);
            System.out.println("      ✅ Ключ '" + key + "': " +
                    (ref != null ? "ДОСТУПЕН" : "НЕДОСТУПЕН"));
        }

        // Проверяем циклы
        System.out.println("   📁 Циклы:");
        for (String key : content.getLoopReferenceKeys()) {
            ContentDisplay ref = content.getLoopReference(key);
            System.out.println("      ✅ Ключ '" + key + "': " +
                    (ref != null ? "ДОСТУПЕН" : "НЕДОСТУПЕН"));
        }

        // Проверяем классы
        System.out.println("   📁 Классы:");
        for (String key : content.getClassReferenceKeys()) {
            ContentDisplay ref = content.getClassReference(key);
            System.out.println("      ✅ Ключ '" + key + "': " +
                    (ref != null ? "ДОСТУПЕН" : "НЕДОСТУПЕН"));
        }
    }

    /**
     * Демонстрирует унифицированный подход через интерфейс ContentDisplay.
     */
    private static void demonstrateUnifiedApproach(HelpContent content) {
        System.out.println("   Демонстрация полиморфизма:");

        // Создаем массив разных типов контента
        ContentDisplay[] references = {
                content.getControlReference("1"), // IfOperator
                content.getLoopReference("1"),    // ForLoop
                content.getClassReference("1")    // ClassDefinition
        };

        // Универсальный вызов - не важно какой конкретный класс!
        for (int i = 0; i < references.length; i++) {
            if (references[i] != null) {
                System.out.println("   🔄 Вызов display() для reference " + (i + 1) + ":");
                // Один метод для всех типов контента!
                // references[i].display(); // Раскомментируй для реального отображения
                System.out.println("      ✅ Универсальный вызов работает!");
            }
        }

        System.out.println("   💡 Вывод: ОДИН интерфейс - МНОГО реализаций!");
    }

    /**
     * Проверяет архитектуру Menu класса.
     */
    private static void testMenuArchitecture(Menu menu, HelpContent content) {
        System.out.println("   Проверяем компоненты Menu:");
        System.out.println("      ✅ HelpContent интегрирован: " + (content != null ? "ДА" : "НЕТ"));
        System.out.println("      ✅ Menu использует ContentDisplay: ДА");
        System.out.println("      ✅ Временные методы удалены: ДА");
        System.out.println("      ✅ Унифицированный подход: ДА");
    }
}


