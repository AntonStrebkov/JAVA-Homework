import java.util.*;

public class Model {
    public Set fillSet() {
        Laptop firstLaptop = new Laptop("hp", "dark", 2000, 180);
        Laptop secondLaptop = new Laptop("msi", "blue", 4000, 240);
        Laptop thirdLaptop = new Laptop("hp", "grey", 2000, 240);
        Laptop fourthLaptop = new Laptop("msi", "dark", 6000, 400);
        Laptop fifthLaptop = new Laptop("asus", "dark", 4000, 400);
        Laptop sixthLaptop = new Laptop("hp", "white", 6000, 240);
        Laptop seventhLaptop = new Laptop("msi", "white", 2000, 240);
        HashSet<Laptop> laptopSet = new LinkedHashSet<>();
        laptopSet.add(firstLaptop);
        laptopSet.add(secondLaptop);
        laptopSet.add(thirdLaptop);
        laptopSet.add(fourthLaptop);
        laptopSet.add(fifthLaptop);
        laptopSet.add(sixthLaptop);
        laptopSet.add(seventhLaptop);
//     System.out.println(laptopSet);
        return laptopSet;
    }

    public void searchLaptop(Set<Laptop> set) {
        fillSet();
        for (Laptop laptop : set) {
            System.out.println(laptop);
        }

    }
}
