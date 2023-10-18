package System_accontingFinancial;

import System_accontingFinancial.Interface.Displaying_walletstatus;

import java.util.ArrayList;

public abstract class Wallet implements Displaying_walletstatus {

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
    public String toString() {
        return "Wallet{" +
                "name='" + name + '\'' +
                ", summa=" + summa +
                '}';
    }

}
