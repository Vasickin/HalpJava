import java.util.Scanner;

/**
 * Вспомогательный класс для организации паузы в работе программы.
 * Ожидает нажатия клавиши Enter для продолжения выполнения.
 */
public class WaitForEnter {

    /**
     * Останавливает выполнение программы до нажатия клавиши Enter.
     * Выводит сообщение-подсказку для пользователя.
     */
    public static void waitForEnter(){
        System.out.println("\n--- Нажмите Enter для продолжения ---");
        new Scanner(System.in).nextLine();
    }
}
