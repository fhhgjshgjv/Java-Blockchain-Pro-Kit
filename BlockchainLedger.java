import java.util.ArrayList;
import java.util.List;

public class BlockchainLedger {
    public List<Block> chain = new ArrayList<>();

    public BlockchainLedger() {
        chain.add(new Block("0", "Genesis Block", System.currentTimeMillis()));
    }

    public Block getLastBlock() {
        return chain.get(chain.size() - 1);
    }

    public void addBlock(Block block) {
        Miner.mineBlock(block);
        chain.add(block);
    }
}
