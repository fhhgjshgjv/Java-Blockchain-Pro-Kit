public class TransactionModel {
    public String txId;
    public String fromAddress;
    public String toAddress;
    public double amount;
    public long time;

    public TransactionModel(String from, String to, double amount) {
        this.fromAddress = from;
        this.toAddress = to;
        this.amount = amount;
        this.time = System.currentTimeMillis();
        this.txId = CryptoUtil.sha256(from + to + amount + time);
    }
}
