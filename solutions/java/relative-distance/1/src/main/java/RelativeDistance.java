import java.util.*;

class RelativeDistance {
    private Map<String, List<String>> graph = new HashMap<>();

    RelativeDistance(Map<String, List<String>> familyTree) {
        for (String parent : familyTree.keySet()) {
            graph.putIfAbsent(parent, new ArrayList<>());
            List<String> children = familyTree.get(parent);

            for (String child : children) {
                graph.putIfAbsent(child, new ArrayList<>());
                graph.get(parent).add(child);
                graph.get(child).add(parent);
            }

            for (int i = 0; i < children.size(); i++) {
                for (int j = i + 1; j < children.size(); j++) {
                    String a = children.get(i), b = children.get(j);
                    graph.get(a).add(b);
                    graph.get(b).add(a);
                }
            }
        }
    }

    int degreeOfSeparation(String personA, String personB) {
        if (personA.equals(personB)) return 0;
        if (!graph.containsKey(personA) || !graph.containsKey(personB)) return -1;

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.add(personA);
        visited.add(personA);
        int distance = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            distance++;
            for (int i = 0; i < size; i++) {
                String current = queue.poll();
                for (String neighbor : graph.getOrDefault(current, List.of())) {
                    if (neighbor.equals(personB)) return distance;
                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }
        return -1;
    }
}