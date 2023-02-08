//Exercise 1 : Override A Method Using The Super Keyword
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:When a method in a derived class overrides a method in a base class, 
* it is still possible to call the overridden method using the super keyword.
* If you write super.method(), it will call the method that was defined in the superclass.
* You are given a partially completed code:
* date: 08/02/2023
*/

package exercise1;

public class XShape extends Shape {

    private String name;

    public XShape(String name) { // Default Constructor
        super();
        this.name = name;
    }

    @Override
    public String getName() {
        return super.getName() + this.name;
    }

}