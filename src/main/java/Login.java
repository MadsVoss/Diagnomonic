import java.util.Scanner;

public class Login {

    public String getCPRnr() {
        String CPRnr;
        Scanner scanCPR = new Scanner(System.in);
        CPRnr = scanCPR.nextLine();

        if (CPRnr.length() != 10) {
            System.out.println("Det indtastede CPR-nr, stemmer ikke overens med den danske lovgivning.");
            CPRnr = scanCPR.nextLine();
        } else {
            System.out.println("du loggede ind");
            //Login med rettigheder for patienter
        }
        return CPRnr;
    }

    public String getUsernameL() {
        String UsernameL;
        Scanner scanUsernameL = new Scanner(System.in);
        UsernameL = scanUsernameL.nextLine();

        if (!UsernameL.equals("AdminL")) {
            System.out.println("Username er ugyldigt");
            UsernameL = scanUsernameL.nextLine();

        } if (UsernameL.equals("AdminL")) {
            System.out.println("Du loggede ind");
            //Login med rettigheder for læger
        }
        return UsernameL;
    }

    public String getPasswordL() {
        String PasswordL;
        Scanner scanPasswordL = new Scanner(System.in);
        PasswordL = scanPasswordL.nextLine();

        if (!PasswordL.equals("AdminL")) {
            System.out.println("Password er ugyldigt");
            PasswordL = scanPasswordL.nextLine();
        } if (PasswordL.equals("AdminL")) {
            System.out.println("Du loggede ind");
            //Login med rettigheder for læger
        }
        return PasswordL;
    }

    public String getUsernameSP() {
        String UsernameSP;
        Scanner scanUsernameSP = new Scanner(System.in);
        UsernameSP = scanUsernameSP.nextLine();


        if (!UsernameSP.equals("SP123")) {
            System.out.println("Username er ugyldigt");
            UsernameSP = scanUsernameSP.nextLine();
        } if (UsernameSP.equals("SP123")) {
            System.out.println("Du loggede ind");
            //Login med rettigheder for sundhedsprofessionel
        }
        return UsernameSP;
    }

    public String getPasswordSP() {
        String PasswordSP;
        Scanner scanPasswordSP = new Scanner(System.in);
        PasswordSP = scanPasswordSP.nextLine();

        if (!PasswordSP.equals("SP123")) {
            System.out.println("Password er ugyldigt");
            PasswordSP = scanPasswordSP.nextLine();
        } if (PasswordSP.equals("SP123")) {
            System.out.println("Du loggede ind");
            //Login med rettigheder for sundhedsprofessionel
        }
        return PasswordSP;
    }

}
