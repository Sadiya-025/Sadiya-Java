import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Data_Output_Stream {
    public static void main(String[] args) {
        int intValue = 42;
        double doubleValue = 3.14;
        String stringValue = "Hello, World!";
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt(intValue);
            dataOutputStream.writeDouble(doubleValue);
            dataOutputStream.writeUTF(stringValue);

            byte[] byteArray = byteArrayOutputStream.toByteArray();
            System.out.println("The Number of Bytes to be Written: " + byteArray.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
