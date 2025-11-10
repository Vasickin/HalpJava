import java.util.HashMap;
import java.util.Map;

/**
 * Основной класс для обработки меню и отображения справочной информации.
 *
 * <p>После рефакторинга класс использует интерфейс {@link ContentDisplay}
 * и централизованный менеджер {@link HelpContent} для управления всеми
 * справочными материалами.</p>
 *
 * <p><b>Основные изменения после рефакторинга:</b>
 * <ul>
 *   <li>Использование {@link HelpContent} для доступа к справочным материалам</li>
 *   <li>Замена switch-case на {@link Map} для обработки действий меню</li>
 *   <li>Удаление дублированных методов отображения контента</li>
 *   <li>Единый подход через интерфейс {@link ContentDisplay}</li>
 * </ul>
 * </p>
 *
 * @author Vasickin
 * @version 2.0
 * @see ContentDisplay
 * @see HelpContent
 */
public class Menu {

    /**
     * Обработчик пользовательского ввода для меню.
     * Используется для получения выбора пользователя в главном меню и подменю.
     */
    private final EnterMenuItem dataProvider;

    /**
     * Централизованный менеджер всех справочных материалов.
     * Предоставляет доступ к объектам, реализующим {@link ContentDisplay},
     * организованным по разделам (операторы, циклы, классы).
     */
    private final HelpContent helpContent;

    /**
     * Коллекция действий для главного меню.
     *
     * <p>Ключ: номер пункта меню (1, 2, 3)
     * Значение: лямбда-выражение или ссылка на метод, выполняющий действие</p>
     *
     * <p>Заменяет собой switch-case конструкцию и обеспечивает
     * более гибкую и расширяемую архитектуру.</p>
     */
    private final Map<Integer, Runnable> mainMenuActions;

    /**
     * Конструктор класса Menu.
     *
     * <p>Инициализирует все зависимости и настраивает обработчики действий меню.</p>
     *
     * @param dataProvider объект для обработки пользовательского ввода
     *
     *                     <p><b>Процесс инициализации:</b>
     *                     <ol>
     *                       <li>Сохранение переданного dataProvider</li>
     *                       <li>Создание экземпляра HelpContent</li>
     *                       <li>Инициализация обработчиков главного меню</li>
     *                     </ol>
     *                     </p>
     */
    public Menu(EnterMenuItem passedValue) {
        this.dataProvider = passedValue;
        this.helpContent = new HelpContent();
        this.mainMenuActions = new HashMap<>();

        initializeMainMenuActions();
    }

    /**
     * Инициализирует обработчики действий для главного меню.
     *
     * <p>Связывает номера пунктов главного меню с соответствующими методами
     * обработки. Это позволяет легко добавлять новые разделы меню в будущем.</p>
     *
     * <p><b>Текущие назначения:</b>
     * <ul>
     *   <li>1 → {@link #processControlOperators()} - операторы управления</li>
     *   <li>2 → {@link #processLoops()} - циклы</li>
     *   <li>3 → {@link #processClasses()} - классы</li>
     * </ul>
     * </p>
     */
    private void initializeMainMenuActions() {
        mainMenuActions.put(1, this::processControlOperators);
        mainMenuActions.put(2, this::processLoops);
        mainMenuActions.put(3, this::processClasses);
    }

    /**
     * Основной метод обработки выбора в главном меню.
     *
     * <p>Получает выбранный пользователем раздел и выполняет соответствующее
     * действие через систему обработчиков {@link #mainMenuActions}.</p>
     *
     * <p><b>Процесс работы:</b>
     * <ol>
     *   <li>Получение выбранного раздела от пользователя</li>
     *   <li>Поиск обработчика в коллекции {@link #mainMenuActions}</li>
     *   <li>Выполнение найденного обработчика или сообщение об ошибке</li>
     * </ol>
     * </p>
     *
     * <p>В отличие от предыдущей версии с switch-case, этот подход позволяет
     * легко добавлять новые разделы меню без изменения логики метода.</p>
     */
    void menuSection() {
        int section = dataProvider.getSelectedSection();
        System.out.print("Веденный пункт меню: " + section);
        // Получаем обработчик для выбранного раздела
        Runnable action = mainMenuActions.get(section);

        if (action != null) {
            // Выполняем соответствующий обработчик
            action.run();
        } else {
            System.out.println("Неизвестный раздел: " + section);
        }
        System.out.println("Завершения работы с разделом" + section);
    }

    /**
     * Обрабатывает раздел "Операторы управления".
     *
     * <p>Отображает подменю операторов управления и обрабатывает выбор пользователя.
     * Использует {@link HelpContent} для получения соответствующих справочных материалов.</p>
     *
     * <p><b>Логика работы:</b>
     * <ul>
     *   <li>Отображение подменю операторов управления</li>
     *   <li>Ожидание ввода пользователя</li>
     *   <li>Обработка команды возврата ('b')</li>
     *   <li>Получение и отображение справочного материала через {@link HelpContent}</li>
     *   <li>Валидация ввода и обработка ошибок</li>
     * </ul>
     * </p>
     *
     * <p>Этот метод демонстрирует преимущества новой архитектуры - весь код
     * обработки унифицирован и не зависит от конкретного типа справочного материала.</p>
     */
    private void processControlOperators() {
        ShowMenu showSubMenu = new ShowMenu();

        while (true) {
            // Отображаем подменю операторов управления
            showSubMenu.showControlOperators();

            // Получаем выбор пользователя
            String choice = dataProvider.enterSubValue();

            // Обрабатываем команду возврата
            if ("b".equals(choice)) {
                System.out.println("Возврат в главное меню...");
                return;
            }

            // Получаем справочный материал через HelpContent
            ContentDisplay reference = helpContent.getControlReference(choice);

            if (reference != null) {
                // Универсальный вызов - работает для ЛЮБОГО оператора!
                reference.display();
            } else {
                System.out.println("Неверный выбор! Попробуйте снова.");
            }
        }
    }

    /**
     * Обрабатывает раздел "Циклы".
     *
     * <p>Отображает подменю циклов и обрабатывает выбор пользователя.
     * Использует унифицированный подход через {@link HelpContent} и
     * интерфейс {@link ContentDisplay}.</p>
     *
     * <p><b>Особенности реализации:</b>
     * <ul>
     *   <li>Использует тот же паттерн, что и {@link #processControlOperators()}</li>
     *   <li>Демонстрирует переиспользование кода благодаря интерфейсам</li>
     *   <li>Легко расширяется добавлением новых типов циклов</li>
     * </ul>
     * </p>
     *
     * <p>Обрати внимание на идентичность структуры с {@link #processControlOperators()} -
     * это преимущество единого интерфейса {@link ContentDisplay}.</p>
     */
    private void processLoops() {
        ShowMenu showSubMenu = new ShowMenu();

        while (true) {
            // Отображаем подменю операторов управления
            showSubMenu.showLoops();

            // Получаем выбор пользователя
            String choice = dataProvider.enterSubValue();

            // Обрабатываем команду возврата
            if ("b".equals(choice)) {
                System.out.println("Возврат в главное меню...");
                return;
            }

            // Получаем справочный материал через HelpContent
            ContentDisplay reference = helpContent.getLoopReference(choice);

            if (reference != null) {
                // Универсальный вызов - работает для ЛЮБОГО оператора!
                reference.display();
            } else {
                System.out.println("Неверный выбор! Попробуйте снова.");
            }
        }
    }


    /**
     * Обрабатывает раздел "Классы".
     *
     * <p>Отображает подменю классов и обрабатывает выбор пользователя.
     * Использует унифицированный подход через {@link HelpContent} и
     * интерфейс {@link ContentDisplay}.</p>
     *
     * <p>Теперь все разделы меню используют одинаковую архитектуру,
     * что обеспечивает согласованность и простоту поддержки.</p>
     *
     * <p><b>Логика работы:</b>
     * <ul>
     *   <li>Отображение подменю классов</li>
     *   <li>Ожидание ввода пользователя</li>
     *   <li>Обработка команды возврата ('b')</li>
     *   <li>Получение справочного материала через {@link HelpContent}</li>
     *   <li>Универсальное отображение через {@link ContentDisplay#display()}</li>
     *   <li>Валидация ввода и обработка ошибок</li>
     * </ul>
     * </p>
     */
    private void processClasses() {
        ShowMenu showSubMenu = new ShowMenu();

        while (true) {
            // Отображаем подменю классов
            showSubMenu.showClasses();

            // Получаем выбор пользователя
            String choice = dataProvider.enterSubValue();

            // Обрабатываем команду возврата
            if ("b".equals(choice)) {
                System.out.println("Возврат в главное меню...");
                return;
            }

            // Получаем справочный материал через HelpContent
            ContentDisplay reference = helpContent.getClassReference(choice);

            if (reference != null) {
                // Универсальный вызов - работает для ЛЮБОЙ темы классов!
                reference.display();
            } else {
                System.out.println("Неверный выбор! Попробуйте снова.");
            }
        }
    }
}
