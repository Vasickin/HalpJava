/**
 * Класс для отображения справки по определению полей и методов.
 * Реализует интерфейс ContentDisplay.
 */
public class FieldsAndMethods implements ContentDisplay{

    /**
     * Реализация метода display() из интерфейса ContentDisplay.
     * Отображает синтаксис и примеры использования полей и методов.
     */

    @Override
    public void display(){
        System.out.println("\n=== Поля и методы ===");
        System.out.println("public class Example {");
        System.out.println("    // поле");
        System.out.println("    private int number;");
        System.out.println("    ");
        System.out.println("    // метод");
        System.out.println("    public int getNumber() {");
        System.out.println("        return number;");
        System.out.println("    }");
        System.out.println("}");
        WaitForEnter.waitForEnter();
    }
}
