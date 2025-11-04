/**
 * Класс для отображения справки по оператору if.
 * Реализует интерфейс ContentDisplay.
 */
public class IfOperator implements ContentDisplay {
    /**
     * Реализация метода display() из интерфейса ContentDisplay.
     * Отображает синтаксис и примеры использования оператора if.
     */
    @Override
    public void display(){
        System.out.println("\n=== Оператор if ===");
        System.out.println("if (условие) {");
        System.out.println("    // код выполняется, если условие true");
        System.out.println("} else {");
        System.out.println("    // код выполняется, если условие false");
        System.out.println("}");
        System.out.println("\nПример:");
        System.out.println("if (age >= 18) {");
        System.out.println("    System.out.println(\"Совершеннолетний\");");
        System.out.println("} else {");
        System.out.println("    System.out.println(\"Несовершеннолетний\");");
        System.out.println("}");
        WaitForEnter.waitForEnter();
    }
}
