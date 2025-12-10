package khai.dict.java._14_solid.single_responsibility.final_state;

import java.util.ArrayList;
import java.util.List;

public class UserAdder {
    private List<String> users = new ArrayList<>();

    public void addUser(String username) {
        users.add(username);
    }
}

