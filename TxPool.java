import java.util.ArrayList;
import java.util.List;

public class TxPool {
    private final List<TransactionModel> pendingTxs = new ArrayList<>();

    public void addTransaction(TransactionModel tx) {
        pendingTxs.add(tx);
    }

    public List<TransactionModel> getPending() {
        return new ArrayList<>(pendingTxs);
    }

    public void clear() {
        pendingTxs.clear();
    }
}
