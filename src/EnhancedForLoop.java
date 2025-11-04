/**
 * Класс для отображения справки по циклу EnhancedFor.
 * Реализует интерфейс ContentDisplay.
 */
public class EnhancedForLoop implements ContentDisplay{

    /**
     * Реализация метода display() из интерфейса ContentDisplay.
     * Отображает синтаксис и примеры использования цикла EnhancedFor.
     */

    @Override
    public void display(){
        System.out.println("\n=== Улучшенный цикл for  ===");
        System.out.println("for (тип переменная : коллекция) {");
        System.out.println("    // тело цикла");
        System.out.println("}");
        System.out.println("Пример:");
        System.out.println("for (String item : items) {");
        System.out.println("    System.out.println(item);");
        System.out.println("}");
        WaitForEnter.waitForEnter();
    }
}
