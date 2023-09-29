import java.sql.SQLOutput;
interface student1{
    default void name(){
        System.out.println("Name of Student1: Rahim");
    }
}

interface student2{
    default void name(){
        System.out.println("Name of Student2: Karim");
    }
}

class person implements student1,student2{
    public void name(){
        student1.super.name();
        student2.super.name();
    }
}

public class Main {
    public static void main(String[] args) {
        person object1 = new person();
        object1.name();
    }
}