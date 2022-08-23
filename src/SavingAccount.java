import java.util.Random;

public class SavingAccount {
    String accountHolderName;
    String accountStatus;
    int accountBalance;

    public SavingAccount(String accountHolderName, String accountStatus,
                         int accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountStatus = accountStatus;
        this.accountBalance = accountBalance;
    }
    long autoGenerateAccountNumber() {
        long accountNumber=(long)(Math.random()*1000000000000L);
        return accountNumber;
    }

    int retrieveBalance(){
        return accountBalance;
    }

    int depositAmount(int amount){
        return accountBalance + amount;
    }

    int transferAmount(int amount){
        return accountBalance - amount;
    }

    int withdrawnAmount(int amount){
        return accountBalance - amount;
    }


}
