import java.util.HashSet;
import java.util.Set;

public class NetworkNode {
    public String nodeId;
    public Set<String> peers = new HashSet<>();
    public Set<String> localBlocks = new HashSet<>();

    public NetworkNode(String id) {
        this.nodeId = id;
    }

    public void addPeer(String peer) {
        peers.add(peer);
    }

    public void syncBlock(String hash) {
        localBlocks.add(hash);
    }
}
