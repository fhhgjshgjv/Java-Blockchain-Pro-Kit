public class Wallet {
    public String address;
    public double balance;

    public Wallet() {
        this.address = "0x" + CryptoUtil.randomHex(40);
        this.balance = 0;
    }

    public void receive(double amt) {
        balance += amt;
    }

    public boolean send(double amt) {
        if (balance >= amt) {
            balance -= amt;
            return true;
        }
        return false;
    }
}
