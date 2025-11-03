import java.util.Scanner;

/**
 * Главный класс справочной системы по Java.
 * Запускает программу и управляет основным циклом программы.
 *
 * @author Lex
 * @version 1.0
 * @since 2025
 */
class HelpJava {
    /**
     * Точка входа в программу.
     * Создаёт необходимые объекты и запускает основной цикл работы.
     *
     * @param args
     */
    public static void main(String[] args) {
        Introduction introduction = new Introduction();
        ShowMenu showMenu = new ShowMenu();
        EnterMenuItem enterMenuItem = new EnterMenuItem();
        Menu menu = new Menu(enterMenuItem);

        introduction.hello();

        while (true) {
            showMenu.showMainMenu();
            introduction.menuItem();
            enterMenuItem.enterValue();
            menu.menuSection();

            System.out.println("\n--- Вернуться в главное меню ---");
            System.out.println("Продолжить работу? (y/n): ");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine().trim();
            if (answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("q")) {
                System.out.println("Завершение программы. До свидания!");
                break;
            }
        }
    }
}
