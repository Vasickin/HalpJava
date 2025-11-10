import java.util.HashMap;
import java.util.Map;

/**
 * Централизованный менеджер для управления всеми справочными материалами программы.
 *
 * <p>Этот класс служит единой точкой доступа ко всем справочным материалам (reference).
 * Он инкапсулирует создание и хранение объектов, реализующих интерфейс {@link ContentDisplay},
 * и предоставляет методы для безопасного доступа к ним.</p>
 *
 * <p><b>Основные функции:</b>
 * <ul>
 *   <li>Создание и инициализация всех справочных материалов</li>
 *   <li>Организация материалов по разделам (операторы, циклы, классы)</li>
 *   <li>Предоставление доступа к материалам по ключам</li>
 *   <li>Валидация существования материалов</li>
 * </ul>
 * </p>
 *
 * @author Vasickin
 * @version 1.0
 * @since 2024
 * @see ContentDisplay
 */

public class HelpContent {

    /**
     * Коллекция для хранения справочных материалов по операторам управления.
     * Ключ: строковый идентификатор (например, "1", "2", "3")
     * Значение: объект, реализующий {@link ContentDisplay}
     */
    private final Map<String, ContentDisplay> controlReferences;

    /**
     * Коллекция для хранения справочных материалов по циклам.
     * Ключ: строковый идентификатор (например, "1", "2", "3", "4")
     * Значение: объект, реализующий {@link ContentDisplay}
     */
    private final Map<String, ContentDisplay> loopReferences;

    /**
     * Коллекция для хранения справочных материалов по классам.
     * Ключ: строковый идентификатор
     * Значение: объект, реализующий {@link ContentDisplay}
     */
    private final Map<String, ContentDisplay> classReferences;

    /**
     * Конструктор по умолчанию.
     *
     * <p>При создании экземпляра автоматически инициализируются все коллекции
     * и заполняются справочными материалами.</p>
     *
     * <p><b>Пример использования:</b>
     * <pre>
     * HelpContent content = new HelpContent();
     * </pre>
     * </p>
     */
    public HelpContent(){
//        Инициализация коллекции для каждого раздела
        this.classReferences = new HashMap<>();
        this.loopReferences = new HashMap<>();
        this.controlReferences = new HashMap<>();

//        Заполнение коллекции справочными материалами
        initializeReferences();
    }

    /**
     * Инициализирует все справочные материалы программы.
     *
     * <p>Этот метод вызывается конструктором и заполняет все коллекции
     * соответствующими объектами справочных материалов.</p>
     *
     * <p><b>Процесс инициализации:</b>
     * <ol>
     *   <li>Инициализация операторов управления</li>
     *   <li>Инициализация циклов</li>
     *   <li>Инициализация классов (заглушка)</li>
     * </ol>
     * </p>
     */
    private void initializeReferences(){
        initializeControlReferences();
        initializeLoopReferences();
        initializeClassReferences();
    }

    /**
     * Инициализирует раздел "Операторы управления".
     *
     * <p>Создает и добавляет в коллекцию все справочные материалы
     * по операторам управления программой.</p>
     *
     * <p><b>Доступные материалы:</b>
     * <ul>
     *   <li>Ключ "1" - оператор if ({@link IfOperator})</li>
     *   <li>Ключ "2" - оператор switch ({@link SwitchOperator})</li>
     *   <li>Ключ "3" - тернарный оператор ({@link TernaryOperator})</li>
     * </ul>
     * </p>
     */
    private void initializeControlReferences(){
//        Оператор if
        controlReferences.put("1", new IfOperator());
//        Оператор Switch
        controlReferences.put("2", new SwitchOperator());
//        Оператор Ternary
        controlReferences.put("3", new TernaryOperator());
    }

    /**
     * Инициализирует раздел "Циклы".
     *
     * <p>Создает и добавляет в коллекцию все справочные материалы по циклам в Java.</p>
     *
     * <p><b>Доступные материалы:</b>
     * <ul>
     *   <li>Ключ "1" - цикл for ({@link ForLoop})</li>
     *   <li>Ключ "2" - цикл while ({@link WhileLoop})</li>
     *   <li>Ключ "3" - цикл do-while ({@link DoWhileLoop})</li>
     *   <li>Ключ "4" - enhanced for loop ({@link EnhancedForLoop})</li>
     * </ul>
     * </p>
     */
    private void initializeLoopReferences(){
        // Цикл for
        loopReferences.put("1", new ForLoop());
        // Цикл while
        loopReferences.put("2", new WhileLoop());

        // Цикл do-while
        loopReferences.put("3", new DoWhileLoop());

        // Enhanced for loop
        loopReferences.put("4", new EnhancedForLoop());
    }

    /**
     * Инициализирует раздел "Классы".
     *
     * <p>Создает и добавляет в коллекцию все справочные материалы по классам в Java.</p>
     *
     * <p><b>Доступные материалы:</b>
     * <ul>
     *   <li>Ключ "1" - определение классов ({@link ClassDefinition})</li>
     *   <li>Ключ "2" - поля и методы ({@link FieldsAndMethods})</li>
     *   <li>Ключ "3" - конструкторы ({@link Constructors})</li>
     *   <li>Ключ "4" - модификаторы доступа ({@link AccessModifiers})</li>
     * </ul>
     * </p>
     */
    private void initializeClassReferences(){
        // Определение классов
        classReferences.put("1", new ClassDefinition());

        // Поля и методы
        classReferences.put("2", new FieldsAndMethods());

        // Конструкторы
        classReferences.put("3", new Constructors());

        // Модификаторы доступа
        classReferences.put("4", new AccessModifiers());
    }

    /**
     * Возвращает справочный материал по операторам управления.
     *
     * <p>Ищет материал в коллекции операторов управления по указанному ключу.</p>
     *
     * @param key ключ материала ("1", "2", "3")
     * @return объект {@link ContentDisplay} или {@code null}, если материал не найден
     *
     * @see #hasControlReference(String)
     *
     * <p><b>Пример использования:</b>
     * <pre>
     * HelpContent content = new HelpContent();
     * ContentDisplay reference = content.getControlReference("1");
     * if (reference != null) {
     *     reference.display(); // Отобразит справку по оператору if
     * }
     * </pre>
     * </p>
     */
    public ContentDisplay getControlReference(String key) {
        return controlReferences.get(key);
    }

    /**
     * Возвращает справочный материал по циклам.
     *
     * <p>Ищет материал в коллекции циклов по указанному ключу.</p>
     *
     * @param key ключ материала ("1", "2", "3", "4")
     * @return объект {@link ContentDisplay} или {@code null}, если материал не найден
     *
     * @see #hasLoopReference(String)
     */
    public ContentDisplay getLoopReference(String key) {
        return loopReferences.get(key);
    }

    /**
     * Возвращает справочный материал по классам.
     *
     * <p>Ищет материал в коллекции классов по указанному ключу.</p>
     *
     * @param key ключ материала
     * @return объект {@link ContentDisplay} или {@code null}, если материал не найден
     *
     * @see #hasClassReference(String)
     */
    public ContentDisplay getClassReference(String key) {
        return classReferences.get(key);
    }

    /**
     * Проверяет существование справочного материала в разделе операторов управления.
     *
     * <p>Этот метод полезен для валидации пользовательского ввода перед попыткой
     * получения материала.</p>
     *
     * @param key ключ материала для проверки
     * @return {@code true} если материал существует, {@code false} в противном случае
     *
     * @see #getControlReference(String)
     *
     * <p><b>Пример использования:</b>
     * <pre>
     * if (content.hasControlReference(userInput)) {
     *     ContentDisplay reference = content.getControlReference(userInput);
     *     reference.display();
     * } else {
     *     System.out.println("Материал не найден");
     * }
     * </pre>
     * </p>
     */
    public boolean hasControlReference(String key) {
        return controlReferences.containsKey(key);
    }

    /**
     * Проверяет существование справочного материала в разделе циклов.
     *
     * @param key ключ материала для проверки
     * @return {@code true} если материал существует, {@code false} в противном случае
     *
     * @see #getLoopReference(String)
     */
    public boolean hasLoopReference(String key) {
        return loopReferences.containsKey(key);
    }

    /**
     * Проверяет существование справочного материала в разделе классов.
     *
     * @param key ключ материала для проверки
     * @return {@code true} если материал существует, {@code false} в противном случае
     *
     * @see #getClassReference(String)
     */
    public boolean hasClassReference(String key) {
        return classReferences.containsKey(key);
    }

    /**
     * Возвращает все доступные ключи для раздела операторов управления.
     *
     * <p>Этот метод полезен для отображения доступных вариантов выбора
     * или для валидации пользовательского ввода.</p>
     *
     * @return массив строковых ключей, представляющих доступные материалы
     *
     * <p><b>Пример использования:</b>
     * <pre>
     * String[] availableKeys = content.getControlReferenceKeys();
     * for (String key : availableKeys) {
     *     System.out.println("Доступен ключ: " + key);
     * }
     * </pre>
     * </p>
     */
    public String[] getControlReferenceKeys() {
        return controlReferences.keySet().toArray(new String[0]);
    }

    /**
     * Возвращает все доступные ключи для раздела циклов.
     *
     * @return массив строковых ключей, представляющих доступные материалы
     *
     * @see #getControlReferenceKeys()
     */
    public String[] getLoopReferenceKeys() {
        return loopReferences.keySet().toArray(new String[0]);
    }

    /**
     * Возвращает все доступные ключи для раздела классов.
     *
     * @return массив строковых ключей, представляющих доступные материалы
     *
     * @see #getControlReferenceKeys()
     */
    public String[] getClassReferenceKeys() {
        return classReferences.keySet().toArray(new String[0]);
    }
}


