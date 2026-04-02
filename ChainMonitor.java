import java.util.List;

public class ChainMonitor {
    public void printChainInfo(List<Block> chain) {
        System.out.println("Chain Height: " + chain.size());
        System.out.println("Last Block Hash: " + chain.get(chain.size() - 1).hash);
    }

    public boolean isForked(List<Block> a, List<Block> b) {
        int min = Math.min(a.size(), b.size());
        for (int i = 0; i < min; i++) {
            if (!a.get(i).hash.equals(b.get(i).hash)) return true;
        }
        return false;
    }
}
