package Module_4;

/**
 * Created by Dima on 01.12.2016.
 */
public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployee,
                  double avrSalaryOfEmployee, long rating, long totalCapital) {

        super(id,bankCountry,currency,numberOfEmployee,avrSalaryOfEmployee,rating,totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (this.getCurrency() == Currency.USD)
            return 2000;

        else
            return 2200;

    }

    @Override
    int getLimitOfFunding(){
        if(this.getCurrency() == Currency.USD)
            return 10000;

        else
            return 20000;

    }

    @Override
    int getMonthlyRate(){
        if(this.getCurrency() == Currency.USD)
            return 0;

        else
            return 1;
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
            return 2;
        else
            return 4;


    }
}

