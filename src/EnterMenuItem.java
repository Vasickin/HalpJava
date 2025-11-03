import java.util.Scanner;

/**
 * Класс для обработки пользовательского ввода.
 * Обеспечивает валидацию вводимых данных и обработку команд.
 */
public class EnterMenuItem {

    private int selectedSection = 0;
    private final Scanner scanner;

    /**
     * Конструктор класса. Инициализирует Scanner для чтения ввода.
     */
    public EnterMenuItem(){
        this.scanner = new Scanner(System.in);
    }

    /**
     * Обрабатывает ввод пользователя для главного меню.
     * Проверяет корректность ввода и обрабатывает команду выхода.
     * Цикл продолжается до получения корректного значения.
     */
    void enterValue() {
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Твой выбор: ");
            if (scanner.hasNextInt()) {
                selectedSection = scanner.nextInt();
                scanner.nextLine();
                System.out.println(" ");

                if (selectedSection >= 1 && selectedSection <= 3) {
                    validInput = true;
                } else {
                    System.out.println("Введенное значение " + selectedSection + " не найдено!");
                    System.out.print("Введите другое значение: ");
                }
            } else {
                String quitSection = scanner.next();
                if (quitSection.equalsIgnoreCase("q")) {
                    System.out.println("Завершение программы");
                    System.exit(0);
                } else {
                    System.out.println("Введен неверный символ");
                    System.out.println("Введите число от 1 до 3, или введите 'q' для выхода из программы");
                    System.out.print("Введите значение: ");
                }
            }
        }
    }

    /**
     * Обрабатывает ввод пользователя для подменю.
     * @return введенная пользователем строка без пробелов по краям
     */
    String enterSubValue(){
        System.out.print("Выберите пункт подменю: ");
        return scanner.nextLine().trim();
    }

    /**
     * Возвращает выбранный пользователем раздел.
     * @return номер выбранного раздела (1-3)
     */
    public int getSelectedSection() {
        return selectedSection;
    }
}

