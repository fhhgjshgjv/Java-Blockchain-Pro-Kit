import java.util.List;

public class BlockStats {
    public static long getAverageTime(List<Block> chain) {
        if (chain.size() <= 1) return 0;
        long total = 0;
        for (int i = 1; i < chain.size(); i++) {
            total += chain.get(i).timestamp - chain.get(i - 1).timestamp;
        }
        return total / (chain.size() - 1);
    }
}
