/**
 * Класс для отображения справки по определению Класса.
 * Реализует интерфейс ContentDisplay.
 */
public class ClassDefinition implements ContentDisplay{

    /**
     * Реализация метода display() из интерфейса ContentDisplay.
     * Отображает синтаксис и пример определения Класса.
     */

    @Override
    public void display(){
        System.out.println("\n=== Определение класса ===");
        System.out.println("public class ИмяКласса {");
        System.out.println("    // поля");
        System.out.println("    // методы");
        System.out.println("    // конструкторы");
        System.out.println("}");
        WaitForEnter.waitForEnter();
    }
}
