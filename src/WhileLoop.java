/**
 * Класс для отображения справки по циклу While.
 * Реализует интерфейс ContentDisplay.
 */
public class WhileLoop implements ContentDisplay {

    /**
     * Реализация метода display() из интерфейса ContentDisplay.
     * Отображает синтаксис и примеры использования циклу While.
     */

    @Override
    public void display(){
        System.out.println("\n=== Цикл while ===");
        System.out.println("while (условие) {");
        System.out.println("    // тело цикла");
        System.out.println("}");
        WaitForEnter.waitForEnter();
    }
}
