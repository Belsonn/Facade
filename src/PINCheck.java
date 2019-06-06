public class PINCheck {

    private int PIN = 7944;

    public int getSecurityCode() { return PIN; }

    public boolean isCodeCorrect(int secCodeToCheck){

        if(secCodeToCheck == getSecurityCode()) {

            return true;

        } else {

            return false;

        }

    }
}
