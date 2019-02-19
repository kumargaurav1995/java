import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserailizationClass {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Employee employee = null;
        try{
            FileInputStream fileInputStream = new FileInputStream("C:\\ProgramData\\Corel\\Messages\\540111125_707000\\EN\\MessageCache1\\Messages\\employee.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            employee = (Employee) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        }
        finally {
            System.out.println("After Deserilaisation ,the name of the employee: " +employee.name +" address: "+employee.address);
        }
    }

}
