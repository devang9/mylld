package machinecoding.splitwise.service;

import machinecoding.splitwise.model.Group;
import machinecoding.splitwise.model.User;
import machinecoding.splitwise.repository.SplitwiseRepository;

import java.util.HashMap;

public class UserService {
    public void addUserToGroup(User user, Group group1){
        SplitwiseRepository.getInstance().getGroupwiseBalanceSheet().get(group1.getId()).put(user.getUsername(), new HashMap<>());
    }
}
