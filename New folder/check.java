 import java.util.*;

 public class ThroneInheritance {

    private final String king;
    private final Map<String, List<String>> children;
    private final Set<String> dead;

    public ThroneInheritance(String kingName) {
        this.king = kingName;
        this.children = new HashMap<>();
        this.dead = new HashSet<>();
        this.children.put(kingName, new ArrayList<>());
    }
    
    public void birth(String parentName, String childName) {
        children.putIfAbsent(parentName, new ArrayList<>());
        children.get(parentName).add(childName);
        children.putIfAbsent(childName, new ArrayList<>());
    }
    
    public void death(String name) {
        dead.add(name);
    }
    
    public List<String> getInheritanceOrder() {
        List<String> order = new ArrayList<>();
        dfs(king, order);
        return order;
    }

    private void dfs(String current, List<String> order) {
        // Only add to order if the person is still alive
        if (!dead.contains(current)) {
            order.add(current);
        }

        // Visit children in order of birth
        if (children.containsKey(current)) {
            for (String child : children.get(current)) {
                dfs(child, order);
            }
        }
    }
}