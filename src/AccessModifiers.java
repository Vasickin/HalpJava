/**
 * Класс для отображения справки по модификаторам доступа.
 * Реализует интерфейс ContentDisplay.
 */
public class AccessModifiers implements ContentDisplay{

    /**
     * Реализация метода display() из интерфейса ContentDisplay.
     * Отображает синтаксис и примеры использования модификаторов доступа.
     */

    @Override
    public void display(){
        System.out.println("\n=== Модификаторы доступа ===");
        System.out.println("public    - доступен везде");
        System.out.println("protected - доступен в пакете и наследниках");
        System.out.println("default   - доступен только в пакете");
        System.out.println("private   - доступен только в классе");
        WaitForEnter.waitForEnter();
    }
}
