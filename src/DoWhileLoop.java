/**
 * Класс для отображения справки по циклу DoWhile.
 * Реализует интерфейс ContentDisplay.
 */
public class DoWhileLoop implements ContentDisplay{

    /**
     * Реализация метода display() из интерфейса ContentDisplay.
     * Отображает синтаксис и примеры использования циклу DoWhile.
     */

    @Override
    public void display(){
        System.out.println("\n=== Цикл do-while ===");
        System.out.println("do {");
        System.out.println("    // тело цикла");
        System.out.println("} while (условие);");
        WaitForEnter.waitForEnter();
    }
}
