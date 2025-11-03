/**
 * Основной класс для обработки меню и отображения справочной информации.
 * Управляет навигацией по разделам и подразделам справки.
 */
public class Menu {
    private final  EnterMenuItem dataProvider;

    /**
     * Конструктор класса Menu.
     *
     * @param passedValue объект для обработки пользовательского ввода
     */
    public Menu(EnterMenuItem passedValue) {
        this.dataProvider = passedValue;

    }

    /**
     * Обрабатывает выбранный пользователем раздел главного меню.
     * На основе выбора перенаправляет в соответствующий подраздел.
     */
    void menuSection() {
        int section = dataProvider.getSelectedSection();
        System.out.print("Веденный пункт меню: " + section);
        switch (section) {
            case 1:
                processControlOperators();
                break;
            case 2:
                processLoops();
                break;
            case 3:
                processClasses();
                break;
        }
        System.out.println("Завершения работы с разделом" + section);
    }

    /**
     * Обрабатывает подменю "Операторы управления".
     * Предлагает выбор конкретного оператора и отображает справку по нему.
     */
    private void processControlOperators(){
        ShowMenu showSubMenu = new ShowMenu();

        while (true){
            showSubMenu.showControlOperators();
            String choice = dataProvider.enterSubValue();

            switch (choice){
                case "1":
                    showIfOperator();
                    break;
                case "2":
                    showSwitchOperator();
                    break;
                case "3":
                    showTernaryOperator();
                    break;
                case "b":
                    return;
                default:
                    System.out.print("Не верный выбор! попробуй снова. ");
            }
        }
    }

    /**
     * Обрабатывает подменю "циклы".
     * Предлагает выбор конкретного цикла и отображает справку по нему.
     */
    private void processLoops(){
        ShowMenu showSubMenu = new ShowMenu();

        while (true){
            showSubMenu.showLoops();
            String choice = dataProvider.enterSubValue();

            switch (choice){
                case "1":
                    showForLoop();
                    break;
                case "2":
                    showWhileLoop();
                    break;
                case "3":
                    showDoWhileLoop();
                    break;
                case "4":
                    showEnhancedForLoop();
                    break;
                case "b":
                    return;
                default:
                    System.out.print("Не верный выбор! попробуй снова. ");
            }
        }
    }

    /**
     * Обрабатывает подменю "Классы".
     */
    private void processClasses(){
        ShowMenu showSubmenu = new ShowMenu();

        while (true){
            showSubmenu.showClasses();
            String choice = dataProvider.enterSubValue();

            switch (choice){
                case "1":
                    showClassDefinition();
                    break;
                case "2":
                    showFieldsAndMethods();
                    break;
                case "3":
                    showConstructors();
                    break;
                case "4":
                    showAccessModifiers();
                    break;
                case "b":
                    return;
                default:
                    System.out.print("Не верный выбор! Попробуй снова. ");
            }
        }
    }

    /**
     * Отображает справочную информацию по оператору if.
     * Показывает синтаксис и примеры использования.
     */
    private void showIfOperator() {
        System.out.println("\n=== Оператор if ===");
        System.out.println("if (условие) {");
        System.out.println("    // код выполняется, если условие true");
        System.out.println("} else {");
        System.out.println("    // код выполняется, если условие false");
        System.out.println("}");
        WaitForEnter.waitForEnter();  // Ждем нажатия Enter перед продолжением
    }

    /**
     * Отображает справочную информацию по оператору switch.
     * Показывает синтаксис и примеры использования.
     */
    private void showSwitchOperator() {
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

    /**
     * Отображает справочную информацию по Тирнарному оператору.
     * Показывает синтаксис и примеры использования.
     */
    private void showTernaryOperator() {
        System.out.println("\n=== Тернарный оператор ===");
        System.out.println("результат = (условие) ? значение1 : значение2;");
        System.out.println("Пример:");
        System.out.println("int max = (a > b) ? a : b;");
        WaitForEnter.waitForEnter();
    }

    private void showForLoop() {
        System.out.println("\n=== Цикл for ===");
        System.out.println("for (инициализация; условие; итерация) {");
        System.out.println("    // тело цикла");
        System.out.println("}");
        System.out.println("Пример:");
        System.out.println("for (int i = 0; i < 10; i++) {");
        System.out.println("    System.out.println(i);");
        System.out.println("}");
        WaitForEnter.waitForEnter();
    }

    private void showWhileLoop() {
        System.out.println("\n=== Цикл while ===");
        System.out.println("while (условие) {");
        System.out.println("    // тело цикла");
        System.out.println("}");
        WaitForEnter.waitForEnter();
    }

    private void showDoWhileLoop() {
        System.out.println("\n=== Цикл do-while ===");
        System.out.println("do {");
        System.out.println("    // тело цикла");
        System.out.println("} while (условие);");
        WaitForEnter.waitForEnter();
    }

    private void showEnhancedForLoop() {
        System.out.println("\n=== Enhanced for loop ===");
        System.out.println("for (тип переменная : коллекция) {");
        System.out.println("    // тело цикла");
        System.out.println("}");
        System.out.println("Пример:");
        System.out.println("for (String item : items) {");
        System.out.println("    System.out.println(item);");
        System.out.println("}");
        WaitForEnter.waitForEnter();
    }

    private void showClassDefinition() {
        System.out.println("\n=== Определение класса ===");
        System.out.println("public class ИмяКласса {");
        System.out.println("    // поля");
        System.out.println("    // методы");
        System.out.println("    // конструкторы");
        System.out.println("}");
        WaitForEnter.waitForEnter();
    }

    private void showFieldsAndMethods() {
        System.out.println("\n=== Поля и методы ===");
        System.out.println("public class Example {");
        System.out.println("    // поле");
        System.out.println("    private int number;");
        System.out.println("    ");
        System.out.println("    // метод");
        System.out.println("    public int getNumber() {");
        System.out.println("        return number;");
        System.out.println("    }");
        System.out.println("}");
        WaitForEnter.waitForEnter();
    }

    private void showConstructors() {
        System.out.println("\n=== Конструкторы ===");
        System.out.println("public class Example {");
        System.out.println("    // конструктор по умолчанию");
        System.out.println("    public Example() { }");
        System.out.println("    ");
        System.out.println("    // конструктор с параметром");
        System.out.println("    public Example(int value) {");
        System.out.println("        this.value = value;");
        System.out.println("    }");
        System.out.println("}");
        WaitForEnter.waitForEnter();
    }

    private void showAccessModifiers() {
        System.out.println("\n=== Модификаторы доступа ===");
        System.out.println("public    - доступен везде");
        System.out.println("protected - доступен в пакете и наследниках");
        System.out.println("default   - доступен только в пакете");
        System.out.println("private   - доступен только в классе");
        WaitForEnter.waitForEnter();
    }
}
