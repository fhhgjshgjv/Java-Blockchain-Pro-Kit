import java.util.List;

public class ConsensusEngine {
    public boolean isChainValid(List<Block> chain) {
        for (int i = 1; i < chain.size(); i++) {
            Block curr = chain.get(i);
            Block prev = chain.get(i - 1);
            if (!curr.hash.equals(curr.calculateHash())) return false;
            if (!curr.previousHash.equals(prev.hash)) return false;
        }
        return true;
    }
}
