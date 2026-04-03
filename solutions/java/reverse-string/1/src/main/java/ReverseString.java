class ReverseString {

    String reverse(String inputString) {
        String reversed = "";

        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversed += inputString.charAt(i);
        }
        return reversed;
    }
  
}
