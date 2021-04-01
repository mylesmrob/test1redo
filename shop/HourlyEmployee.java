package shop;

public class HourlyEmployee extends Employee implements IDiscountable{

    public HourlyEmployee(String name,char size) {
        super(name,size);
    }

    public double getDiscount(){
        return 0.10;
    }

    @Override
    public double calcDiscount(Clothing clothing) {
        return getDiscount() * clothing.getPrice();
    }

    @Override
    void printEmpPriceAfterDisc(Clothing clothing) {
        System.out.println(clothing.getPrice()-(getDiscount() * clothing.getPrice()));
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "discount=" + discount +
                '}';
    }
}
