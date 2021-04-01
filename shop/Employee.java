package shop;

public abstract class Employee extends Customer{
    final double discount = 0;

    public Employee(String name,char size) {
        super(name,size);
    }

    public double getDiscount(){
        return 0;
    }

    abstract void printEmpPriceAfterDisc(Clothing clothing);
}
