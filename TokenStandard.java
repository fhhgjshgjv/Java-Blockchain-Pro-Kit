import java.util.HashMap;
import java.util.Map;

public class TokenStandard {
    public final String name = "JavaChainCoin";
    public final String symbol = "JCC";
    public final double totalSupply = 100_000_000;
    private final Map<String, Double> balances = new HashMap<>();

    public TokenStandard() {
        balances.put("OWNER", totalSupply);
    }

    public double balanceOf(String addr) {
        return balances.getOrDefault(addr, 0.0);
    }

    public boolean transfer(String from, String to, double amt) {
        if (balances.getOrDefault(from, 0.0) < amt) return false;
        balances.put(from, balances.get(from) - amt);
        balances.put(to, balances.getOrDefault(to, 0.0) + amt);
        return true;
    }
}
