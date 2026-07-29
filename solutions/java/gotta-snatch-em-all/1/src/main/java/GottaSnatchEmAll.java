import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        Set<String> mineOnly = new HashSet<>(myCollection);
        mineOnly.removeAll(theirCollection);

        Set<String> theirsOnly = new HashSet<>(theirCollection);
        theirsOnly.removeAll(myCollection);

        return !mineOnly.isEmpty() && !theirsOnly.isEmpty();
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        if (collections.isEmpty()) {
            return new HashSet<>();
        }

        Set<String> common = new HashSet<>(collections.get(0));

        for (int i = 1; i < collections.size(); i++) {
            common.retainAll(collections.get(i));
        }

        return common;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> all = new HashSet<>();

        for (Set<String> collection : collections) {
            all.addAll(collection);
        }

        return all;
    }
}