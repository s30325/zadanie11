public class Transaction {
    private double transactionValue;

    public double getTransactionValue() {
        return transactionValue;}
        public void showTransactionInfo(){
        System.out.println("wartosc transakcji: "+ transactionValue);

    }

    public void setTransactionValue(double transactionValue) {
        this.transactionValue = transactionValue;
    }
}

