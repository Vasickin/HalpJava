
// Обновленный main
class HelpJava {
    public static void main(String[] args) {
        Introduction introduction = new Introduction();
        ShowMenu showMenu = new ShowMenu();
        EnterMenuItem enterMenuItem = new EnterMenuItem();
        Menu menu = new Menu(enterMenuItem);

        introduction.hello();
        showMenu.showMenu();
        introduction.menuItem();
        enterMenuItem.enterValue();
        menu.menuSection(); 

    
    }
}
