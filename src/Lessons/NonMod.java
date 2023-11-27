package Lessons;

public class NonMod {

        String color="blue";


    }
class Human{
        String name="Ivan";
    NonMod c = new NonMod();
    public static void main(String[] args){
Human h1=new Human();
h1.c=new NonMod();
    }
}


