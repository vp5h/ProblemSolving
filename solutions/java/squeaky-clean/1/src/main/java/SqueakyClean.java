class SqueakyClean {
    static String clean(String identifier) {

        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = false;

        for (char c : identifier.toCharArray()) {

            if (Character.isISOControl(c)) {
                result.append("CTRL");
            } 
            else if (c == ' ') {
                result.append('_');
            } 
            else if (c == '-') {
                capitalizeNext = true;
            } 
            else if (c == '4') c = 'a';
            else if (c == '3') c = 'e';
            else if (c == '0') c = 'o';
            else if (c == '1') c = 'l';
            else if (c == '7') c = 't';

            if (Character.isLetter(c) || c == '_') {
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