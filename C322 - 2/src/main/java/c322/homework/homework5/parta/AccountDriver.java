package c322.homework.homework5.parta;

public class AccountDriver {
    public static void main(String[] args) {
        System.out.println("\n\nBank Account Number Generation System");

        CreateBankAccount createBankAccount = CreateBankAccount.UNIQUE_INST;

        for (int i = 100; i > 0; i--){
            System.out.println(createBankAccount.getNewAccount());

        }




// create new account
      //  CreateBankAccount account1 = CreateBankAccount.getNewAccount();
// create second account
      //  CreateBankAccount account2 = CreateBankAccount.getNewAccount ();
    }
}