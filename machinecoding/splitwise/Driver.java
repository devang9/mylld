package machinecoding.splitwise;

import machinecoding.splitwise.model.Group;
import machinecoding.splitwise.model.User;
import machinecoding.splitwise.service.ExpenseService;
import machinecoding.splitwise.service.GroupService;
import machinecoding.splitwise.service.UserService;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        UserService userService = new UserService();
        GroupService groupService = new GroupService();
        seedUsersAndGroups(userService,groupService);
        processUserInputs();
    }

    private static void processUserInputs() {
        ExpenseService expenseService = new ExpenseService();
        while(true){
            System.out.println("Enter input:");
            Scanner sc = new Scanner(System.in);
            String[] input = sc.nextLine().split(" ");
             /* First arg = 1 (Add Expense in a group)
             Example expense input  = 1 ertigacab dchheda EQUAL 15000 dchheda,fkamdar,dhagarg grp1
             Example expense input  = 1 alcohol dhagarg UNEQUAL 10000 dchheda-2000,fkamdar-3000,dhagarg-5000 grp1
             Example expense input  = 1 barbecue dhagarg PERCENT 5000 20-dchheda,30-fkamdar,50-dhagarg grp2
             First arg = 2 (Show all balance of a group)
             Example showbalances input = 2 grp1 */
            switch(input[0]) {
                case "1":
                    String expenseName = input[1];
                    String userName = input[2];
                    String splitType = input[3];
                    double amount = Double.parseDouble(input[4]);
                    String splits = input[5];
                    String groupId = input[6];
                    expenseService.addExpense(expenseName,userName,splitType,amount,splits,groupId);
                    break;
                case "2":
                    String groupName = input[1];
                    System.out.println(expenseService.showBalances(groupName));

                default:
                    break;
            }
        }
    }

    private static void seedUsersAndGroups(UserService userService, GroupService groupService) {
        User user1 = new User("dchheda");
        User user2 = new User("dhagarg");
        User user3 = new User("fkamdar");
        User user4 = new User("vjsheth");

        Group group1 = new Group("grp1");
        groupService.addGroup(group1);

        userService.addUserToGroup(user1,group1);
        userService.addUserToGroup(user2, group1);
        userService.addUserToGroup(user3, group1);
        userService.addUserToGroup(user4, group1);

    }
}
