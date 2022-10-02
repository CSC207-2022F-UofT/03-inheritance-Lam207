/*
 * This file is currently empty, but with a variety of TODOs to implement.
 * You may want to refer to HandBag.java to see how to structure your code.
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */

/*
 * TODO: Create a public class named CrossbodyBag which is a subclass of Bag
 *       In addition to the attributes in Bag, the CrossbodyBag should have an
 *       attribute named "numberOfStraps".
 *
 *       The constructor for CrossbodyBag should take the following parameters
 *       in order:
 *           1. a String for the color
 *           2. an int for the capacity
 *           3. an int for the number of straps
 *
 *       CrossbodyBag should also have a getter method called getNumberOfStraps
 *       and it should implement the enhance method.
 *
 *       The enhance method should increase the capacity of the CrossbodyBag by
 *       2 (as opposed to the 1 that HandBag increases by).
 *
 *       The toString method should be overridden to return a string in the
 *       in the same form as Bag's toString but with the original "Bag" part
 *       of the string replaced by:
 *           Crossbody Bag with {numberOfStraps} straps
 *
 *       See the tests in test/CrossBodyBagTest.java for examples.
 */

public class CrossbodyBag extends Bag{
    /**
     * @Param color            - the color of a bag
     *        numberofContents - an int representing for the items currently inside the CrossbodyBag instance.
     *        capacity         - the capacity of the CrossbodyBag object
     *        contents         - an array of Strings details about the items inside.
     *        numberofStraps   - the amount of Straps that the CrossbodyBag
     */

    private final int numberofStraps;

    public CrossbodyBag(String colour, int capacity, int numberofStraps){
        super(colour, capacity);
        this.numberofStraps = numberofStraps;
    }

    /** A method getNumberofStraps() that takes no parameter and return the number of
     * straps inside the current crossbody bag.
     *
     * @return The amount of straps of the crossbody bag
     */
    public int getNumberOfStraps() {
        return this.numberofStraps;
    }

    /** A method enhance() that does not take any parameter, and increase the
     * capacity instance variable of the current bag by 2 units silently.
     *
     */

    public void enhance(){
        this.increaseCapacity(2);
    }

    /** An overridden method toString from the parent class Bag, which is in a form:
     * {color} + Crossbody Bag with + {numberofStraps} + straps + ({numberofContents} / {capacity})
     *
     * @return The current information about the Crossbody bag
     */
    @Override
    public String toString(){
        return this.getColor() + " Crossbody Bag with " + this.numberofStraps + " straps (" +
                super.getNumberOfContents() + " / " + super.getCapacity() + ")";
    }

}
