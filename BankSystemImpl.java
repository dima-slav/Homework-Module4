package Module_4;

/**
 * Created by Dima on 01.12.2016.
 */
public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount){
        double limit = user.getBank().getLimitOfWithdrawal();
        double balance = user.getBalance();

        if(balance<amount)
            System.out.println("Not enough money");
        if(amount>limit)
            System.out.println("The limit of withdrawal " + limit);
        else user.setBalance(balance-amount);

    }

    @Override
    public void fundUser(User user, int amount){
        double balance = user.getBalance();
        double limit = user.getBank().getLimitOfFunding();

        if(limit<amount)
            System.out.println("The limit of funding " + limit);
        else user.setBalance(balance+amount);

    }

    @Override
    public void transferMoney(User toUser, User fromUser, int amount){
        double balance1 = fromUser.getBalance();
        double balance2 = toUser.getBalance();

        if(amount>balance1)
            System.out.println("Not enough money");

        else fromUser.setBalance(balance1 - amount);
        toUser.setBalance(balance2 + amount);
    }

    @Override
    public void paySalary(User user){
        double balance = user.getBalance();
        double salary = user.getSalary();
        user.setBalance(balance+salary);

    }

}


