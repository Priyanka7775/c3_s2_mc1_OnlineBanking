public class SavingAccountImpl {
    public static void main(String[] args) {
        SavingAccount savingAccount=new SavingAccount("Priyanka","Active",10000);
        System.out.println("Account Holder Name = " + savingAccount.accountHolderName);
        System.out.println("Account Status = " + savingAccount.accountStatus);
        System.out.println("Account Balance = " + savingAccount.accountBalance);
        System.out.println("Auto Generate Account Number = " + savingAccount.autoGenerateAccountNumber());
        System.out.println("RetrieveBalance = " + savingAccount.retrieveBalance());
        System.out.println("DepositAmount = " + savingAccount.depositAmount(2000));
        System.out.println("TransferAmount = " + savingAccount.transferAmount(1000));
        System.out.println("Withdrawn Amount = " + savingAccount.withdrawnAmount(3000));
    }
}
