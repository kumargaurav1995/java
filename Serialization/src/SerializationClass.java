import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationClass {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = " Monica";
        employee.address = "Delhi";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\ProgramData\\Corel\\Messages\\540111125_707000\\EN\\MessageCache1\\Messages\\employee.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Serialised data");
        }catch (IOException e){
            e.printStackTrace();
        }

    }


}
