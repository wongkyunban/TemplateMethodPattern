package abstract_class;

public abstract class AbstractClassCaffeineBeverageWithHook {

    final public  void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }

    }

    protected abstract void brew();
    protected abstract  void addCondiments();

    public void boilWater(){
        System.out.println("Boiling water");
    }
    public void pourInCup(){
        System.out.println("Pouring water");
    }

    //在这里定义了一个方法,通常是空的缺省实现。这个方法只会返回true，不做别的事
    //这是一个钩子，子糯可以覆盖这个方法，但不见得一定要这么做
    protected boolean customerWantsCondiments(){
        return true;
    }
}
