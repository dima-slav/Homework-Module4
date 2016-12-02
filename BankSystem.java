package Module_4;

/**
 * Created by Dima on 01.12.2016.
 */
public interface BankSystem {

    void withdrawOfUser (User user,int amount);

    void fundUser (User user,int amount);
    void transferMoney (User fromUser, User toUser,int amount);

    void paySalary (User user);

}

