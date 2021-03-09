package service;

import entity.CPU;
import entity.Matches;


public class PrintConsoleMessage {

    public void salutUserAndLetsPlay() {
        System.out.println("Выбери 1, 2 или 3 спички, чтобы после последнего твоего хода");
        System.out.println("осталась одна спичка.");
        System.out.println();
    }

    public void printMatchesCountInTheGame(int countMatches) {
        System.out.println("На столе осталось " + countMatches + " спичек");
    }

    public void printMatchesCountPickedUpCPU(int matchesCountPickedUp) {
        System.out.println(" - Количество выбранных компьютером спичек: " + matchesCountPickedUp + ".");
    }

    public void printMatchesCountPickedUpUser() {
        System.out.print(" - Ход игрока. Введите количество спичек: ");
    }

    public void printGameOver() {
        System.out.println("Для игрока осталась последняя спичка. Игрок проиграл");
    }

    public void printErrorPickedUpMatches() {
        System.out.println("Введено неверное количество спичек! Допустимые значения - 1, 2, 3");
    }
}
