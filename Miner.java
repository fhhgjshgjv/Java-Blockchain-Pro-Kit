public class Miner {
    private static final int DIFFICULTY = 4;

    public static void mineBlock(Block block) {
        String target = "0".repeat(DIFFICULTY);
        while (!block.hash.startsWith(target)) {
            block.nonce++;
            block.hash = block.calculateHash();
        }
    }
}
