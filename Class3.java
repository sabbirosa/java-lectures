public class Class3 {
    public static void main(String[] args) {
        
        // for
        // while 
        // do-while
        // int x = 5;
        // int i = 6;
        // Init value
        // Condition
        // Increment
        // while (i < x) {
        //     System.out.println(i);
        //     // i++;
        //     i = i + 1;
        // }

        // do {
        //     System.out.println(i);
        //     i = i + 1;
        // } while (i < x);
        String word = "jdfgDSaaAddofgd";
        int c = 0;
        int s = 0;
        
        // First get each and every charecter of the string
        for (int i = 0; i < word.length(); i++) {
            char x = word.charAt(i);

            if (Character.isUpperCase(x)) {
                c++;
            } else {
                s++;
            }
        }

        System.out.println("Capital " + c);
        System.out.println("Lower " + s);
    }
}