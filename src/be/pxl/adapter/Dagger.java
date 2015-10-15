package be.pxl.adapter;

/**
 * Created by Jani Swinnen on 15/10/2015.
 */
public class Dagger implements Knife{
    @Override
    public void stab() {
        System.out.println("Attack did 5 damage");
    }
}
