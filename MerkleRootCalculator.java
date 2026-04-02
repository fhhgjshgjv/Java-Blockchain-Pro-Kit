import java.util.List;

public class MerkleRootCalculator {
    public static String buildMerkleRoot(List<String> txHashes) {
        if (txHashes.isEmpty()) return CryptoUtil.sha256("empty");
        while (txHashes.size() > 1) {
            String left = txHashes.remove(0);
            String right = txHashes.isEmpty() ? left : txHashes.remove(0);
            txHashes.add(CryptoUtil.sha256(left + right));
        }
        return txHashes.get(0);
    }
}
