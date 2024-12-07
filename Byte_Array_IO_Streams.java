import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Byte_Array_IO_Streams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String userInput = sc.nextLine();
        byte[] byteInput = userInput.getBytes();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(byteInput);
            byte[] writtenBytes = byteArrayOutputStream.toByteArray();
            System.out.println("The Bytes Written are: " + new String(writtenBytes));
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(writtenBytes);
            byte[] readBytes = new byte[writtenBytes.length];
            int bytesRead = byteArrayInputStream.read(readBytes);
            System.out.println("The Bytes Read are: " + new String(readBytes, 0, bytesRead));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }

    }
}
