public class FindDuplicateStrings {
    public static void main(String[] args) {

        String[] names = {
            "Amit",
            "Rahul",
            "Priya",
            "Amit",
            "Harsh",
            "Rahul",
            "Sneha",
            "Priya"
        };

        System.out.println("Duplicate strings:");

        for (int i = 0; i < names.length; i++) {

            boolean alreadyDisplayed = false;

            // Check if this string was already displayed
            for (int k = 0; k < i; k++) {
                if (names[i].equals(names[k])) {
                    alreadyDisplayed = true;
                    break;
                }
            }

            if (alreadyDisplayed) {
                continue;
            }

            // Check if the string occurs again
            for (int j = i + 1; j < names.length; j++) {

                if (names[i].equals(names[j])) {
                    System.out.println(names[i]);
                    break;
                }
            }
        }
    }
}