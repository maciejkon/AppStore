package com.company.application;

import com.company.business.People.Worker.Player;
import com.company.business.company.Company;

import java.util.Scanner;

public class Game {

    private Player player;
    private Company company;

    public Game() {
        this.player = addNewPlayer();
        this.company = new Company(this.player);
    }

    public Player addNewPlayer() {
        String name;
        String surname;
        Scanner in = new Scanner(System.in);
        System.out.println("Stwórz nowego gracza: ");
        System.out.println("Podaj imię: ");
        name = in.nextLine();
        System.out.println("Podaj nazwisko: ");
        surname = in.nextLine();
        return new Player(name, surname);
    }

    public void startGame() {
        Menu menuObject = new Menu();

        company.showWelcomeInfo();
        company.addNewProject();
        Scanner in = new Scanner(System.in);

        company.newMonthChecker();
        company.checkPayment();
        company.showActualInfo();
        int number = menuObject.menu();

        while (number != 0) {

            switch (number) {
                case 1:
                    company.addNewProject();
                    break;
                case 2:
                    company.lookForNewClient();
                    break;
                case 3:
                    company.workOnProjects();
                    break;
                case 4:
                    company.testCode();
                    break;
                case 5:
                    company.finishProject();
                    break;
                case 6:
                    company.addNewWorker();
                    break;
                case 7:
                    company.fireWorker();
                    break;
                case 8:
                    company.bookkeeping();
                    break;
            }
            company.newMonthChecker();
            company.checkPayment();
            company.showActualInfo();

            number = menuObject.menu();
        }
        System.out.println("     ****************************************");
        System.out.println("\n     Koniec programu\n\n");
    }


}
