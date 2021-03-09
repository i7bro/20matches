package entity;

import javax.xml.bind.SchemaOutputResolver;
import java.util.InputMismatchException;
import java.util.Scanner;

public class User {

    public int matchesCountPickedUp;

    public void makeMove() {
        matchesCountPickedUp = new Scanner(System.in).nextInt();
    }

    public void makeMove(int zero) {
        matchesCountPickedUp = zero;
    }
}
