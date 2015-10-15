package be.pxl.adapter;

/**
 * Created by Jani Swinnen on 15/10/2015.
 */

public class Test {
    public static void main(String[] args) {
        Longsword longsword = new Longsword();

        Dagger dagger = new Dagger();
        Sword knifeAdapter = new KnifeAdapter(dagger);

        System.out.println("Attack with Dagger...");
        dagger.stab();

        System.out.println("\nAttack with Longsword...");
        testSword(longsword);

        System.out.println("\nAttack with KnifeAdapter");
        testSword(knifeAdapter);

    }

    static void testSword(Sword sword){
        sword.swing();
    }
}
