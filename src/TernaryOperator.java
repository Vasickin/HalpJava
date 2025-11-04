/**
 * Класс для отображения справки по оператору Ternary.
 * Реализует интерфейс ContentDisplay.
 */
public class TernaryOperator implements ContentDisplay{

    /**
     * Реализация метода display() из интерфейса ContentDisplay.
     * Отображает синтаксис и примеры использования оператора Ternary.
     */

    @Override
    public void display(){
        System.out.println("\n=== Тернарный оператор ===");
        System.out.println("результат = (условие) ? значение1 : значение2;");
        System.out.println("Пример:");
        System.out.println("int max = (a > b) ? a : b;");
        WaitForEnter.waitForEnter();
    }
}
