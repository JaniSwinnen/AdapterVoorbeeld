package be.pxl.adapter;

/**
 * Created by Jani Swinnen on 15/10/2015.
 */
public class KnifeAdapter implements Sword {

    Dagger dagger;

    public KnifeAdapter( Dagger dagger){
        this.dagger=dagger;
    }

    @Override
    public void swing() {
        dagger.stab();
        dagger.stab();
    }
}
