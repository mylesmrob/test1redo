package shop;

public class Manager extends Employee implements IDiscountable{

    public Manager(String name,char size){
        super(name,size);
    }

    public double getDiscount(){
        return 0.25;
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
        return "Manager{" +
                "discount=" + discount +
                '}';
    }
}
