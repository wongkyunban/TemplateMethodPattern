package concrete_class;

import abstract_class.AbstractClassCaffeineBeverageWithHook;

public class TeaWithNoHook extends AbstractClassCaffeineBeverageWithHook {
    @Override
    protected void brew() {
        System.out.println("steeping the tea");

    }

    @Override
    protected void addCondiments() {
        System.out.println("Add lemon");

    }

}
