package machinecoding.splitwise.service;

import machinecoding.splitwise.model.Group;
import machinecoding.splitwise.repository.SplitwiseRepository;

import java.util.HashMap;

public class GroupService {
    public void addGroup(Group group){
        SplitwiseRepository splitwiseRepository = SplitwiseRepository.getInstance();
        splitwiseRepository.getGroups().add(group);
        splitwiseRepository.getGroupwiseBalanceSheet().put(group.getId(), new HashMap<>());
    }
}
