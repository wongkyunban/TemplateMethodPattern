package concrete_class;

import abstract_class.AbstractClassCaffeineBeverageWithHook;

public class CoffeeWithHook extends AbstractClassCaffeineBeverageWithHook {
    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");

    }

    @Override
    protected void addCondiments() {
        System.out.println("Add sugar and Milk");

    }

    @Override
    protected boolean customerWantsCondiments() { //覆盖这个钩子，提供自己的功能，不返回true了，返回false。
        return  false;
    }
}
