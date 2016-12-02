package Module_4;

/**
 * Created by Dima on 01.12.2016.
 */
public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployee,
                     double avrSalaryOfEmployee, long rating, long totalCapital) {

        super(id, bankCountry, currency, numberOfEmployee, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (this.getCurrency() == Currency.USD)
            return 100;

        else
            return 150;


    }

    @Override
    int getLimitOfFunding() {
        if (this.getCurrency() == Currency.USD)
            return 10000;

        else
            return 5000;

    }

    @Override
    int getMonthlyRate() {
        if (this.getCurrency() == Currency.USD)
            return 1;

        else
            return 0;


    }

    @Override
    int getCommission(int summ) {
        if (this.getCurrency() == Currency.USD)
            if (summ < 1000)
                return 3;
            else{
                return 5;}



        else
        if (summ < 1000)
            return 10;
        else
            return 11;


    }
}

