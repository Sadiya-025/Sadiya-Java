import java.io.*;

class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private int userID;
    private String email;

    public User(int userID, String email) {
        this.userID = userID;
        this.email = email;
    }

    public String toString() {
        return "User(userID: " + this.userID + ", email: " + this.email + ")";
    }
}

public class Advanced_Serialization {
    public static void serialize(User user, String fileName) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOutputStream.writeObject(user);
            System.out.println("The Object is written to: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static User deserialize(String fileName) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            User user = (User) objectInputStream.readObject();
            System.out.println("The Object is read from: " + fileName);
            return user;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        User user = new User(1, "user@admin.com");
        serialize(user, "user_data.ser");
        User newUser = deserialize("user_data.ser");
        System.out.println("The Deserialized User: " + newUser);
    }
}