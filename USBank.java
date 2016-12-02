package Module_4;

/**
 * Created by Dima on 01.12.2016.
 */
public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployee,
                  double avrSalaryOfEmployee, long rating, long totalCapital) {

        super(id, bankCountry, currency, numberOfEmployee, avrSalaryOfEmployee, rating, totalCapital);
    }



    @Override
    int getLimitOfWithdrawal() {
        if (this.getCurrency() == Currency.USD)
            return 1000;

        else
            return 1200;

    }

    @Override
    int getLimitOfFunding(){
        if(this.getCurrency() == Currency.USD)
            return Integer.MAX_VALUE;

        else
            return 10000;

    }

    @Override
    int getMonthlyRate(){
        if(this.getCurrency() == Currency.USD)
            return 1;

        else
            return 2;
    }

    @Override
    int getCommission(int summ){
        if(this.getCurrency() == Currency.USD)
            if(summ<1000)
                return 5;

            else{
                return 7;}

        else
        if(summ<1000)
            return 6;

        else
            return 8;

    }
}





