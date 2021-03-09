package service;

import entity.CPU;
import entity.Matches;
import entity.User;

import java.util.InputMismatchException;

public class GameLogic {

    public void game() {
        PrintConsoleMessage printConsoleMessage = new PrintConsoleMessage();
        User user = new User();
        CPU cpu = new CPU();
        Matches matches = new Matches();

        printConsoleMessage.salutUserAndLetsPlay();

        while (true) {
            printConsoleMessage.printMatchesCountInTheGame(matches.countMatches);
            cpu.makeMove(user.matchesCountPickedUp);
            printConsoleMessage.printMatchesCountPickedUpCPU(cpu.matchesCountPickedUp);
            matches.calculateMatchesCount(cpu.matchesCountPickedUp);
            printConsoleMessage.printMatchesCountInTheGame(matches.countMatches);
            if (matches.countMatches <= 1) {
                break;
            }
            printConsoleMessage.printMatchesCountPickedUpUser();

            try {
                user.makeMove();
            } catch (InputMismatchException e) {
                user.makeMove(0);
            }

            while (user.matchesCountPickedUp < 1 | user.matchesCountPickedUp > 3) {
                printConsoleMessage.printErrorPickedUpMatches();
                printConsoleMessage.printMatchesCountInTheGame(matches.countMatches);
                printConsoleMessage.printMatchesCountPickedUpUser();
                try {
                    user.makeMove();
                } catch (InputMismatchException e) {
                    user.makeMove(0);
                }
            }
            matches.calculateMatchesCount(user.matchesCountPickedUp);
        }
        printConsoleMessage.printGameOver();
    }
}
