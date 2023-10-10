public class CreditLimit {
    private int accountNumber;
    private int beginningBalance;
    private int totalItemsCharged;
    private int totalCreditApplied;
    private int creditLimit;
    private int newBalance;

    public CreditLimit(int accountNumber, int beginningBalance, int totalItemsCharged, int totalCreditApplied, int creditLimit){
        this.accountNumber = accountNumber;
        this.beginningBalance = beginningBalance;
        this.totalItemsCharged = totalItemsCharged;
        this.totalCreditApplied = totalCreditApplied;
        this.creditLimit = creditLimit;
    }
    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getBeginningBalance(){
        return beginningBalance;
    }

    public void setBeginningBalance(int beginningBalance){
        this.beginningBalance = beginningBalance;
    }

    public int getTotalItemsCharged(){
        return totalItemsCharged;
    }

    public void setTotalItemsCharged(int totalItemsCharged){
        this.totalItemsCharged = totalItemsCharged;
    }

    public int getTotalCreditsApplied(){
        return totalCreditApplied;
    }

    public void setTotalCreditsApplied(int totalCreditApplied){
        this.totalCreditApplied = totalCreditApplied;
    }

    public int getCreditLimit(){
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit){
        this.creditLimit = creditLimit;
    }

    public int calculateNewBalance(){
        newBalance = beginningBalance + totalItemsCharged - totalCreditApplied;
        return newBalance;
    }

    public void checkCreditLimit(){
        if(newBalance > creditLimit)
            System.out.print("Credit Limit Exceeded");
    }

}

