import java.util.ArrayList;
import java.util.List;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        HotDrink hd1 = new HotDrink("name1", 50, 1, 40);
        HotDrink hd2 = new HotDrink("name2", 70, 2, 50);
        HotDrink hd3 = new HotDrink("name3", 100, 1, 70);
        List <HotDrink> listHD = new ArrayList<>();
        listHD.add(hd1);
        listHD.add(hd2);
        listHD.add(hd3);
        HotDrinkVendingMachine hdvm1 = new HotDrinkVendingMachine((List)listHD);
        System.out.println(hdvm1.getProduct("name2"));
    }
}