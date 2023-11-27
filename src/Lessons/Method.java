package Lessons;

public class Method {
    int summa(int a, int b, int c){
        int result=a+b+c;
        return result;
    }

}
class test {
    public static void main(String[] args) {
        Method SymaTrehChisel = new Method();
        int Syma = SymaTrehChisel.summa(1,2,3);
        System.out.println(Syma);
    }
}