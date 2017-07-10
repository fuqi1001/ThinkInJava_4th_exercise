package Chapter5;

/**
 * Created by qifu on 17/7/10.
 */
public class _10_TerminationConditionEx {
    public static void main(String[] args) {
        WebBank bank1 = new WebBank(true);
        WebBank bank2 = new WebBank(true);

        bank1.logOut();
        new WebBank(true);
        System.gc();
    }
}
class WebBank {
    boolean loggedIn = false;
    WebBank(boolean logStatus) {
        loggedIn = logStatus;
    }
    void logIn() {
        loggedIn = true;
    }
    void logOut() {
        loggedIn = false;
    }

    protected void finalize() {
        if(loggedIn)
            System.out.println("Error: still logged in");
    }
}
