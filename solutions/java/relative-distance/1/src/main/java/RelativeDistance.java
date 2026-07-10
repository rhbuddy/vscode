import java.util.*;

class RelativeDistance {

    private final Map<String, List<String>> graph;

    RelativeDistance(Map<String, List<String>> familyTree) {
        graph = new HashMap<>();

        for (Map.Entry<String, List<String>> entry : familyTree.entrySet()) {
            String parent = entry.getKey();
            List<String> children = entry.getValue();

            graph.putIfAbsent(parent, new ArrayList<>());

            for (String child : children) {
                graph.putIfAbsent(child, new ArrayList<>());

                graph.get(parent).add(child);
                graph.get(child).add(parent);
            }

            for (int i = 0; i < children.size(); i++) {
                for (int j = i + 1; j < children.size(); j++) {
                    String c1 = children.get(i);
                    String c2 = children.get(j);

                    graph.get(c1).add(c2);
                    graph.get(c2).add(c1);
                }
            }
        }
    }

    int degreeOfSeparation(String personA, String personB) {

        if (personA.equals(personB)) {
            return 0;
        }

        if (!graph.containsKey(personA) || !graph.containsKey(personB)) {
            return -1;
        }

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.offer(personA);
        visited.add(personA);

        int distance = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String current = queue.poll();

                if (current.equals(personB)) {
                    return distance;
                }

                for (String neighbor : graph.get(current)) {
                    if (visited.add(neighbor)) {
                        queue.offer(neighbor);
                    }
                }
            }

            distance++;
        }

        return -1;
    }
}