class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = false;

        for (char c : identifier.toCharArray()) {
            if (c == ' ') {
                result.append('_');
            } else if (c == '-') {
                capitalizeNext = true;
            } else {
                switch (c) {
                    case '4': c = 'a'; break;
                    case '3': c = 'e'; break;
                    case '0': c = 'o'; break;
                    case '1': c = 'l'; break;
                    case '7': c = 't'; break;
                }

                if (!Character.isLetter(c)) {
                    continue;
                }

                if (capitalizeNext) {
                    result.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}