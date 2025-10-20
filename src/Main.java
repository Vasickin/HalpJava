
// Обновленный main
class HelpJava {
    public static void main(String[] args) {
        Introduction hi = new Introduction();
        ShowMenu showMenu = new ShowMenu();
        EnterMenuItem enter = new EnterMenuItem();
        Menu menu = new Menu(enter); // Передаем enter в Menu

        hi.hello();
        showMenu.showMenu();
        hi.menuItem();
        enter.enter();
        menu.menu(); // Теперь menu использует тот же экземпляр enter
    }
}
