package entity;

import javax.jws.soap.SOAPBinding;

public class CPU {

    public int matchesCountPickedUp;

    public void makeMove(int matchesCountPickedUpUser) {
        matchesCountPickedUp = (matchesCountPickedUpUser != 0) ? (4 - matchesCountPickedUpUser) : 3;
    }
}
