import java.util.HashMap;
import java.util.Map;

public class AccountState {
    private final Map<String, Double> state = new HashMap<>();

    public void setBalance(String addr, double bal) {
        state.put(addr, bal);
    }

    public double getBalance(String addr) {
        return state.getOrDefault(addr, 0.0);
    }

    public boolean transfer(String from, String to, double amt) {
        if (getBalance(from) < amt || amt <= 0) return false;
        setBalance(from, getBalance(from) - amt);
        setBalance(to, getBalance(to) + amt);
        return true;
    }
}
