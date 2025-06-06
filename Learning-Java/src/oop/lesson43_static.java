package oop;

import java.net.ServerSocket;

public class lesson43_static {
    public static void main(String[] args){

        // static = makes a variable or methods belong to the class
        //          rather than to any specific objects.
        //          Commonly used for methods or shared resources.

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");
        Friend friend5 = new Friend("Gary");

        System.out.println(friend1.name);
        System.out.println(friend2.name);
        System.out.println(friend3.name);
        System.out.println(friend4.name);
        Friend.showFriends();
    }
}
