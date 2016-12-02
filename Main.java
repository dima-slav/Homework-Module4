package Module_4;

/**
 * Created by Dima on 01.12.2016.
 */
public class Main {
    public static void main(String[] args) {

        USBank usbank = new USBank(10001, "USA", Currency.USD, 54675, 3500, 29, 25000000000l);
        EUBank europeanCentralBank = new EUBank(10002, "Germany", Currency.EUR, 43407, 3100, 44, 4000000000l);
        ChinaBank bankOfChina = new ChinaBank(10003, "China", Currency.USD, 135604, 1300, 20, 12400000000l);

        BankSystemImpl bankSystem = new BankSystemImpl();

        User user1 = new User(3782094l, "Mark", 228, 1, "Microsoft", 800, usbank);
        User user2 = new User(9302857l, "John", 59052, 27, "Ubisoft", 4450, europeanCentralBank);
        User user3 = new User(3094850l, "Sarah", 1586, 0, "Coca-Cola", 650, usbank);
        User user4 = new User(3784920l, "Lee", 11829, 69, "Samsung", 900, bankOfChina);
        User user5 = new User(9385673l, "Victoria", 3522, 13, "Nokia", 1450, europeanCentralBank);
        User user6 = new User(3945783l, "Chong", 247, 78, "McDonald's", 250, bankOfChina);

        bankSystem.fundUser(user1, 229);
        bankSystem.transferMoney(user1, user3, 228);
        bankSystem.paySalary(user4);
        bankSystem.withdrawOfUser(user5, 2000);

        System.out.println(user1.getName() + "  funds his balance by 229");
        System.out.println(user3.getName() + "  transfer 228 to " + user1.getName());
        System.out.println(user4.getName());
        System.out.println(user5.getName() + "  takes from her balance 2000");
    }
}















