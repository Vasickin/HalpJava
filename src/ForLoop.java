/**
 * Класс для отображения справки по циклу For.
 * Реализует интерфейс ContentDisplay.
 */
public class ForLoop implements ContentDisplay{

    /**
     * Реализация метода display() из интерфейса ContentDisplay.
     * Отображает синтаксис и примеры использования циклу For.
     */

    @Override
    public void display(){
        System.out.println("\n=== Цикл for ===");
        System.out.println("for (инициализация; условие; итерация) {");
        System.out.println("    // тело цикла");
        System.out.println("}");
        System.out.println("Пример:");
        System.out.println("for (int i = 0; i < 10; i++) {");
        System.out.println("    System.out.println(i);");
        System.out.println("}");
        WaitForEnter.waitForEnter();
    }
}
