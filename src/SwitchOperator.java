/**
 * Класс для отображения справки по оператору switch.
 * Реализует интерфейс ContentDisplay.
 */
public class SwitchOperator implements ContentDisplay{
    /**
     * Реализация метода display() из интерфейса ContentDisplay.
     * Отображает синтаксис и примеры использования оператора if.
     */
    @Override
    public void display(){
        System.out.println("\n=== Оператор switch ===");
        System.out.println("switch (переменная) {");
        System.out.println("    case значение1:");
        System.out.println("        // код для значение1");
        System.out.println("        break;");
        System.out.println("    case значение2:");
        System.out.println("        // код для значение2");
        System.out.println("        break;");
        System.out.println("    default:");
        System.out.println("        // код по умолчанию");
        System.out.println("}");
        WaitForEnter.waitForEnter();
    }
}
