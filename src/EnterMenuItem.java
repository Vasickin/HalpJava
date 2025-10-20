import java.util.Scanner;

public class EnterMenuItem {

    private int section = 0;

    void enter() {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            if (scanner.hasNextInt()) {
                section = scanner.nextInt();
                scanner.nextLine();
                System.out.println(" ");

                if (section >= 1 && section <= 3) {
                    validInput = true;
                } else {
                    System.out.println("Введенное значение " + section + " не найдено!");
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

    public int getSection() {
        return section;
    }
}

