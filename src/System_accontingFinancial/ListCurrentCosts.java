package System_accontingFinancial;


import System_accontingFinancial.Interface.Working_list_of_current_costs;

import java.util.ArrayList;

public abstract class ListCurrentCosts implements Working_list_of_current_costs {

    private String str;
    private double price;
    ArrayList<CreditCards> creditCards;

     public ListCurrentCosts(){
         this.str="Купили новую одежду ";
         this.price=72.00;
     }
     public ListCurrentCosts(ArrayList<CreditCards> creditCards){
         this.creditCards= new ArrayList<>();

     }
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public ArrayList<CreditCards> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(ArrayList<CreditCards> creditCards) {
        this.creditCards = creditCards;
    }

    @Override
    public void print(String str, double price) {
        System.out.printf("%s", str, price);
    }

    @Override
    public String toString() {
        return "ListCurrentCosts{" +
                "str='" + str + '\'' +
                ", price=" + price +
                ", creditCards=" + creditCards +
                '}';
    }
}
