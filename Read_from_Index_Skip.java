import java.io.*;

public class Read_from_Index_Skip {
    public static void readFromIndex(String fileName, int index) {
        try (FileInputStream fout = new FileInputStream(fileName)) {
            fout.skip(index);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fout));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readAfterSkip(String fileName, int bytesToSkip) {
        try (FileInputStream fout = new FileInputStream(fileName)) {
            fout.skipNBytes(bytesToSkip);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fout));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readFromIndex("Buffered_IO_Streams.txt", 5);
        readAfterSkip("Buffered_IO_Streams.txt", 10);
    }
}
