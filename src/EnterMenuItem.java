import java.util.Scanner;

public class EnterMenuItem {

    private int selectedSection = 0;

    void enterValue() {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
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

    public int getSelectedSection() {
        return selectedSection;
    }
}

