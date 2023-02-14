package c322.homework.homework5.parta;

import java.util.Random;

public enum CreateBankAccount {
    UNIQUE_INST;
    int count = 1;

     // This generates the unique bank account numbers
    // It keeps a set to avoid reusing the old ones
    public long generateAccount(int length) {
        Random random = new Random();
        count++;
        char[] digits = new char[length];
        digits[0] = (char) (random.nextInt(9) + '1');
        for (int i = 1; i < length; i++) {
            digits[i] = (char) (random.nextInt(10) + '0');
        }
        return Long.parseLong(new String(digits));
    }



    public long getNewAccount(){

        System.out.println(count + " " + "account(s) generated . . . ");
        System.out.println("Here's your new bank account number: ");
        return generateAccount(12);

    }
}
