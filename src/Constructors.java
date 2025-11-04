/**
 * Класс для отображения справки по конструктору.
 * Реализует интерфейс ContentDisplay.
 */
public class Constructors implements ContentDisplay{

    /**
     * Реализация метода display() из интерфейса ContentDisplay.
     * Отображает синтаксис и примеры использования конструкторов.
     */

    @Override
    public void display(){
        System.out.println("\n=== Конструкторы ===");
        System.out.println("public class Example {");
        System.out.println("    // конструктор по умолчанию");
        System.out.println("    public Example() { }");
        System.out.println("    ");
        System.out.println("    // конструктор с параметром");
        System.out.println("    public Example(int value) {");
        System.out.println("        this.value = value;");
        System.out.println("    }");
        System.out.println("}");
        WaitForEnter.waitForEnter();
    }
}
