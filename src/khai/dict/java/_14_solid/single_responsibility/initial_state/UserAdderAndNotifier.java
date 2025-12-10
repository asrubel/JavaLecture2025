package khai.dict.java._14_solid.single_responsibility.initial_state;

import java.util.ArrayList;
import java.util.List;

public class UserAdderAndNotifier {
    private List<String> users = new ArrayList<>();

    public void addUser(String username) {
        users.add(username);
        notifyUser("User " + username + " added");
    }

    public void notifyUser(String message) {
        System.out.println("User notified with message: " + message);
    }
}
