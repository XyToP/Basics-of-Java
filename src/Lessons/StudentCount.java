package Lessons;

public class StudentCount {
    String name;
    static int count;

    public StudentCount(String name2) {
        count++;
        name = name2;
        int a=1;
        System.out.println(count);

    }
}
    class StudentTest{
        public static void main(String[] args){
            StudentCount s1 = new StudentCount("111");
            StudentCount s2 = new StudentCount("222");
            StudentCount s3 = new StudentCount("333");

        }
    }

