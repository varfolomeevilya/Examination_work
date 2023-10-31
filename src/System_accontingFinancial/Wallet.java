package System_accontingFinancial;

import System_accontingFinancial.States.Displaying_walletstatus;
import System_accontingFinancial.Getting.Getting_the_amount_to_wallets;
import System_accontingFinancial.Getting.Getting_total_wallets_card;

import java.util.ArrayList;

public  class Wallet implements Displaying_walletstatus, Getting_the_amount_to_wallets, Getting_total_wallets_card {

    private String name;
    private int summa;
    ArrayList<CreditCards> creditCards;

    public Wallet(){
        this.creditCards= new ArrayList<>();
        this.name="Ozon";
        this.summa=12;
    }
    public Wallet(String name, int summa, ArrayList<CreditCards> creditCards){
        this.creditCards = new ArrayList<>();
        this.name = name;
        this.summa = summa;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getSumma() {
        return summa;
    }

    public void setSumma(int summa) {
        this.summa = summa;
    }

    @Override
    public void print(String name, int summa) {
        System.out.printf("%s \n", name, summa);
    }

    @Override
    public void print(int summa) {
        System.out.printf("%s \n",summa);
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "name='" + name + '\'' +
                ", summa=" + summa +
                '}';
    }
}
