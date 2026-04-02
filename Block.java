import java.security.MessageDigest;
import java.util.HexFormat;

public class Block {
    public String previousHash;
    public String data;
    public long timestamp;
    public int nonce;
    public String hash;

    public Block(String previousHash, String data, long timestamp) {
        this.previousHash = previousHash;
        this.data = data;
        this.timestamp = timestamp;
        this.nonce = 0;
        this.hash = calculateHash();
    }

    public String calculateHash() {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            String input = previousHash + data + timestamp + nonce;
            byte[] digest = md.digest(input.getBytes());
            return HexFormat.of().formatHex(digest);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
