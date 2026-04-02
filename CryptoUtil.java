import java.security.MessageDigest;
import java.security.SecureRandom;

public class CryptoUtil {
    public static String sha256(String str) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String randomHex(int len) {
        SecureRandom sr = new SecureRandom();
        byte[] bytes = new byte[len / 2];
        sr.nextBytes(bytes);
        return HexFormat.of().formatHex(bytes);
    }
}
