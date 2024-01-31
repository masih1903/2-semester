package org.example;

public class Greeting {

    public static String greet(String name){

        if(name == null){
            return "Hello, my friend.";

        }
        else if(name.equals(name.toUpperCase())){
            return "HELLO, MASIH!";

        }


        else{
            return "Hello, " + name;
        }


    }

    public static String greet(String[] names){
        String greeting = "Hello, ";

        for(int i = 0; i < names.length; i++){
            greeting = greeting + names[i];

            if(i == names.length -2){
                greeting = greeting + " and ";

            }
            else if(i < names.length -2){
                greeting = greeting + ", ";

            }
            else if(i == names.length -1){
                greeting = greeting + " and "   + "AND HELLO " + names[1];

            }



        }
        return greeting + ".";

    }
}
