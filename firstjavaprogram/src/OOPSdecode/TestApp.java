package OOPSdecode;

class Account {
    // Data security
    private double balance;

    //methods :: public
    public double getBalance(double balance) {
        // perform the validation
        boolean result = validate("PankajKumarRajbhar","Pankaj@23");

        // withdrawing the money
        if(result==true){
            this.balance = this.balance - balance;
            return balance;
        }
        else {
            // throw a meaningful message to the user for
            System.out.println("Invalid userName/password try again....");
            return 0.0;
        }
    }

    // method :: public
    public void setBalance(double balance){
        // perform authentication
        boolean result = validate("PankajKumarRajbhar", "Pankaj@23");

        if(result == true){
            // deposite the money
            this.balance = this.balance+balance;
            System.out.println("Credited to the account");
        }else{
            // throw a meaningful message to the user
            System.out.println("Invalid  username/password try again....");
        }

        // depositing the money
    }

    //method :: private
    private boolean validate(String userName,String password){
        // logic for authentication
        return userName.equalsIgnoreCase("PankajKumarRajbhar")
                && password.equals("Pankaj@23");
    }
}
public class TestApp{
    public static void main(String[] args){
        Account acc = new Account();
        acc.setBalance(1000.0);
        double balance = acc.getBalance(500.0);
        System.out.println("Withdrawing :: "+balance+" Amount");
    }
}
