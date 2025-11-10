/**
 * Главный класс справочной системы по Java.
 */
class HelpJava {
    public static void main(String[] args) {
        Introduction introduction = new Introduction();
        ShowMenu showMenu = new ShowMenu();
        EnterMenuItem enterMenuItem = new EnterMenuItem();
        Menu menu = new Menu(enterMenuItem);

        // Приветствие
        introduction.hello();

        // Бесконечный цикл с явным указанием намерения
        for (;;) {
            // Показываем главное меню
            showMenu.showMainMenu();
            introduction.menuItem();

            // Получаем выбор пользователя
            enterMenuItem.enterValue();

            // Обрабатываем выбранный раздел
            menu.menuSection();

            // Разделитель между циклами
            System.out.println("\n" + "=".repeat(50));
            System.out.println("Возврат в главное меню...");
            System.out.println("=".repeat(50) + "\n");
        }
    }
}