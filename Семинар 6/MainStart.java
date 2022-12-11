
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MainStart {
    public static void main(String[] args) {
        Model model = new Model();
//        model.fillSet();
//        View view = new View();
//        view.choiceUser();
        model.searchLaptop(model.fillSet());
    }
}
