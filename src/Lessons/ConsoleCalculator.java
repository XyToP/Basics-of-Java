package Lessons;

public class ConsoleCalculator {
    public static void main(String[] args) {
        if (args.length < 3){
            System.out.println("Provide number1, operation, number2");
            return;
        }
        double number1 = Double.parseDouble(args[0]);
        String operation = args[1];
        double number2 = Double.parseDouble(args[2]);
        switch (operation){
            case "+" : System.out.println(number1+"+"+number2+"="+(number1+number2)); break;
            case "-" : System.out.println(number1+"-"+number2+"="+(number1-number2)); break;
            case "*" : System.out.println(number1+"*"+number2+"="+(number1*number2)); break;
            case "/" : System.out.println(number1+"/"+number2+"="+(number1/number2)); break;
            default : System.out.println("can't do this");

        }
    }
}
