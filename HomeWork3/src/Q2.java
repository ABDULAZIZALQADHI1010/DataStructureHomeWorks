import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        Student std1=new Student("Ali",20,1);
        Student std2=new Student("Abulaziz",21,2);
        Student std3=new Student("Saleh",23,3);
        Student std4=new Student("Ahmed",22,4);
        Student[]stdArray={std1,std2,std3,std4};
        Student[]stdArray2=stdArray.clone();
        System.out.println("StdArray1 "+Arrays.toString(stdArray));
        System.out.println("StdArray2 "+Arrays.toString(stdArray2));
    }
}