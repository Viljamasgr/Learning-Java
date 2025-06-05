package basics;

public class lesson13_string_methods {
    public static void main(String[] args) {

        String name = "John Smith";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf(" ");
        int lastIndex = name.lastIndexOf("n");

        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();
        name = name.replace("n", "a");

        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else {
            System.out.println("Hello " + name);
        }

        if(name.contains(" ")) {
            System.out.println("Your name contains a space");
        }
        else {
            System.out.println("Your name DOESN'T contain any spaces");
        }

        System.out.println(name);
    }
}
