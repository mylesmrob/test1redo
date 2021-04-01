package shop;

import java.util.ArrayList;
import java.util.Comparator;

public class ShopApp {

    static double calcTotal(Clothing[] clothing){
        double total = 0;
        for(Clothing c : clothing){
            total += c.getPrice();
        }
        return total;
    }

    static boolean isAFit(Customer customer, Clothing clothing){
        if(customer.getSize() == clothing.getSize()){
            return true;
        }
        return false;
    }

    static void sortAndPrintClothingByPrice(ArrayList<Clothing> clothing){
        clothing.sort(Comparator.comparing(Clothing::getPrice));
        for(Clothing c : clothing){
            System.out.println(c.toString() + ": " + c.getPrice());
        }
    }

    static void printEmployeeName(Employee employee){
        System.out.println(employee.getName());
    }

    static void printDiscAmountOff(IDiscountable[] discountables, Clothing clothing){
        for(IDiscountable d : discountables){
            System.out.println(d.calcDiscount(clothing));
        }
    }
}
