import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContractStorage {
    private final Map<String, Map<String, String>> store = new ConcurrentHashMap<>();

    public void put(String contract, String key, String value) {
        store.computeIfAbsent(contract, k -> new ConcurrentHashMap<>()).put(key, value);
    }

    public String get(String contract, String key) {
        return store.getOrDefault(contract, new ConcurrentHashMap<>()).get(key);
    }
}
