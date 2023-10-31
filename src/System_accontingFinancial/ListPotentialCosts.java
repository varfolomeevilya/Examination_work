package System_accontingFinancial;

import System_accontingFinancial.Works.Working_list_of_potential_costs;

import java.util.ArrayList;

public  class ListPotentialCosts implements Working_list_of_potential_costs{
    private String str;
    private double price;

    private ArrayList<ListPotentialIncome> listPotentialIncomes;

    public ListPotentialCosts() {
        this.listPotentialIncomes = new ArrayList<>();
        this.str="Купил новую машину";
        this.price=1_223_0000;
    }
    public ListPotentialCosts( String str, double price, ArrayList<ListPotentialIncome> listPotentialIncomes){
        this.listPotentialIncomes = new ArrayList<>();
        this.str=str;
        this.price=price;
    }
    public ListPotentialCosts(ArrayList<ListPotentialIncome> listPotentialIncomes) {
        this.listPotentialIncomes = listPotentialIncomes;
    }

    public ArrayList<ListPotentialIncome> getListPotentialIncomes() {
        return listPotentialIncomes;
    }

    public void setListPotentialIncomes(ArrayList<ListPotentialIncome> listPotentialIncomes) {
        this.listPotentialIncomes = listPotentialIncomes;
    }

    @Override
    public void print(String str, int price) {
        System.out.println();
    }

    @Override
    public String toString() {
        return "ListPotentialCosts{" +
                "str='" + str + '\'' +
                ", price=" + price +
                ", listPotentialIncomes=" + listPotentialIncomes +
                '}';
    }
}
