package System_accontingFinancial;

import System_accontingFinancial.Interface.Works_a_list_of_potential_income;

public abstract class ListPotentialIncome implements Works_a_list_of_potential_income {


    private int prize;

    private int salary;
    public ListPotentialIncome(){
        this.prize = 20;
        this.salary= 11200;
    }
    public ListPotentialIncome(int prize, int salary){
        this.prize = prize;
        this.salary = salary;
    }
    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void print(int prize, int salary) {
        System.out.printf("%s \n", prize, salary);
    }

    @Override
    public String toString() {
        return "ListPotentialIncome{" +
                "prize=" + prize +
                ", salary=" + salary +
                '}';
    }
}
