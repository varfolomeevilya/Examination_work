package System_accontingFinancial;

import System_accontingFinancial.States.Display_status_credit_card;

public  class CreditCards implements Display_status_credit_card{

    private String name;

    private int summa;

    public CreditCards(){
        this.name="Тинькофф карта";
        this.summa=12000;
    }
    public CreditCards(String name, int summa){
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
        System.out.printf("%s \n",name, summa);
    }
    @Override
    public String toString() {
        return "CreditCards{" +
                "name='" + name + '\'' +
                ", summa=" + summa +
                '}';
    }
}
