public class LinearSearchString {
    public static void main(String[] args) {
        String in = "Saravana";
        System.out.println(search(in, 's'));
    }

    public static boolean search(String str, char target) {
        if (str.isEmpty()) { return false; }

        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
