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
    public EnterMenuItem() {
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
            try {
                System.out.print("Ваш выбор: ");

                // Проверка доступности Scanner
                if (!scanner.hasNext()) {
                    throw new IllegalStateException("Ошибка доступа к системе ввода");
                }

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
            } catch (IllegalStateException e) {  // ← ДОБАВЬ ЭТОТ БЛОК CATCH
                System.out.println("⚠️  Ошибка системы ввода: " + e.getMessage());
                System.out.println("Пожалуйста, перезапустите программу.");
                throw e;
            } catch (Exception e) {
                System.out.println("⚠️  Непредвиденная ошибка: " + e.getMessage());
                System.out.println("Попробуйте ввести значение еще раз.");
                // Продолжаем цикл для повторного ввода
            }
        }
    }

    /**
     * Обрабатывает ввод пользователя для подменю.
     *
     * <p>Включает валидацию ввода и обработку ошибок для улучшения
     * пользовательского опыта. Обеспечивает стабильную работу даже
     * при некорректных данных от пользователя.</p>
     *
     * @return введенная пользователем строка без пробелов по краям
     * @throws IllegalStateException если Scanner закрыт или произошла ошибка ввода
     *
     *                               <p><b>Особенности реализации:</b>
     *                               <ul>
     *                                 <li>Проверка на пустой ввод</li>
     *                                 <li>Обработка системных ошибок ввода</li>
     *                                 <li>Информативные сообщения об ошибках</li>
     *                                 <li>Рекурсивный повторный запрос при ошибках</li>
     *                               </ul>
     *                               </p>
     *
     *                               <p><b>Пример использования:</b>
     *                               <pre>
     *                               String choice = enterMenuItem.enterSubValue();
     *                               // Гарантированно получим не-null и не-пустую строку
     *                               </pre>
     *                               </p>
     */
    String enterSubValue() {
        try {
            System.out.print("Выберите пункт подменю: ");

            // Проверяем доступность Scanner
            if (!scanner.hasNextLine()) {
                throw new IllegalStateException("Scanner недоступен для чтения");
            }

            String input = scanner.nextLine().trim();

            // Валидация пустого ввода
            if (input.isEmpty()) {
                System.out.println("⚠️  Ошибка: ввод не может быть пустым. Пожалуйста, введите значение.");
                return enterSubValue();
            }

            return input;
        } catch (IllegalStateException e) {
            System.out.println("⚠️  Критическая ошибка системы ввода: " + e.getMessage());
            System.out.println("Пожалуйста, перезапустите программу.");
            throw e;
        } catch (Exception e) {
            System.out.println("Пожалуйста, попробуйте еще раз.");
            return enterSubValue(); // Предлагаем повторить ввод
        }
    }

    /**
     * Возвращает выбранный пользователем раздел.
     *
     * @return номер выбранного раздела (1-3)
     */
    public int getSelectedSection() {
        return selectedSection;
    }
}

