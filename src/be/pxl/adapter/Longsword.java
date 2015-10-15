package be.pxl.adapter;

/**
 * Created by Jani Swinnen on 15/10/2015.
 */
public class Longsword implements Sword {
    @Override
    public void swing() {
        System.out.println("Attack did 10 damage");
    }
}
