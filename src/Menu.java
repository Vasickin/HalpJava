// Menu.java
public class Menu {
    private EnterMenuItem enter;

    public Menu(EnterMenuItem enter) {
        this.enter = enter;
    }

    void menu() {
        int section = enter.getSection();
        switch (section) {
            case 1:
                System.out.println("Справка по операторам управления:");
                showControlOperators();
                break;
            case 2:
                System.out.println("Справка по циклам:");
                showLoops();
                break;
            case 3:
                System.out.println("Справка по классам:");
                showClasses();
                break;
        }
    }

    private void showControlOperators() {
        System.out.println("1. Оператор if");
        System.out.println("2. Оператор switch");
        System.out.println("3. Тернарный оператор");
    }

    private void showLoops() {
        System.out.println("1. Цикл for");
        System.out.println("2. Цикл while");
        System.out.println("3. Цикл do-while");
        System.out.println("4. Enhanced for loop");
    }

    private void showClasses() {
        System.out.println("1. Определение классов");
        System.out.println("2. Поля и методы");
        System.out.println("3. Конструкторы");
        System.out.println("4. Модификаторы доступа");
    }
}
