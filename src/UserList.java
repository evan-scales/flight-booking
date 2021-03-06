import java.util.ArrayList;
import java.util.UUID;

/**
 * The list of users
 * @author Mario Misencik
 */
public class UserList {
    private static UserList userList;
    private ArrayList<RegisteredUser> users;

    /**
     * The list of users
     */
    private UserList() {
        users = DataLoader.getUsers();
    }

    /**
     * Returns the user list
     * @return The user list
     */
    public static UserList getInstance() {
        if (userList == null) {
            userList = new UserList();
        }
        return userList;
    }

    /**
     * Retrives the user based on the email and password entered
     * @param email The user's email address
     * @param password The user's password
     * @return The user
     */
    public RegisteredUser getUser(String email, String password) {
        for (RegisteredUser user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Returns the user in the list that corresponds with the ID passed in
     * @param id The ID to be compared
     * @return The user that corresponds with the ID
     */
    public RegisteredUser getUser(UUID id) {
        for (RegisteredUser user : userList.users) {
            if (user.getUUID().equals(id)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Returns the user list in the form of an ArrayList
     * @return The user list
     */
    public ArrayList<RegisteredUser> getUsers() {
        return users;
    }



}