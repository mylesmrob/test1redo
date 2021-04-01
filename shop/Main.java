package shop;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Clothing jeans = new Clothing("Blue Jeans", 20, 'M');
        Clothing tShirt = new Clothing("White T Shirt", 5.0,'S');
        Clothing buttonUp = new Clothing("Button Up Shirt", 30.0, 'L');

        Clothing[] managerCart = {jeans,tShirt,buttonUp};
        Manager manager = new Manager("Bob",'M');

        Clothing[] employeeCart = {jeans,tShirt,buttonUp};
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Mike",'S');

        System.out.println("Manager cart total: " +ShopApp.calcTotal(managerCart));
        System.out.println("Checking if clothing item fits employee (Manager): "+ShopApp.isAFit(manager,jeans));
        System.out.print("Hourly employee price for jeans after discount: ");
        hourlyEmployee.printEmpPriceAfterDisc(jeans);
        System.out.print("Hourly employee price for tShirt after discount: ");
        hourlyEmployee.printEmpPriceAfterDisc(tShirt);
        System.out.print("Manager price for jeans after discount: ");
        manager.printEmpPriceAfterDisc(jeans);
        System.out.print("Hourly employee price for tShirt after discount: ");
        manager.printEmpPriceAfterDisc(tShirt);

        ArrayList<Clothing> clothing = new ArrayList<>();
        clothing.add(jeans); clothing.add(tShirt); clothing.add(buttonUp);
        System.out.println("Prior to sorting...");
        for(Clothing c : clothing){
            System.out.println(c.toString());
        }
        System.out.println("After sorting...");
        ShopApp.sortAndPrintClothingByPrice(clothing);

        System.out.print("Manager name: ");
        ShopApp.printEmployeeName(manager);
        System.out.print("Hourly Employee name: ");
        ShopApp.printEmployeeName(hourlyEmployee);

        IDiscountable[] discountable = {manager,hourlyEmployee};
        System.out.println("Discount off jeans for each employee: ");
        ShopApp.printDiscAmountOff(discountable,jeans);
    }
}
