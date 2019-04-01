import abstract_class.AbstractClassCaffeineBeverageWithHook;
import concrete_class.CoffeeWithHook;
import concrete_class.TeaWithNoHook;

public class Main {

    public static void main(String[] args) {
//        MyFrame myFrame = new MyFrame("Hello world");


        AbstractClassCaffeineBeverageWithHook coffee = new CoffeeWithHook();
        coffee.prepareRecipe();

        AbstractClassCaffeineBeverageWithHook tea = new TeaWithNoHook();
        tea.prepareRecipe();

    }
}
