package holmes.holmesy.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Holmesy on 13/03/2018.
 */

public class PageAdapter extends FragmentPagerAdapter {

    private Context context;

    public PageAdapter(Context context, FragmentManager fragmentManager){
        super(fragmentManager);
        this.context = context;
    }



    @Override
    public int getCount(){
        return  4;
    }

    public Fragment getItem(int position){
        switch(position){
            case 0:
                return new MuseumFragment();
            case 1:
                return new CatherderalFragment();
            case 2:
                return new ArtGalleryFragment();
            case 3:
                return new WarMemorialParkFragment();
            default:
                return null;

        }
    }

    @Override
    public CharSequence getPageTitle(int position){
        switch(position){
            case 0:
                return context.getString(R.string.museum_frag);
            case 1:
                return context.getString(R.string.cathederal_frag);
            case 2:
                return context.getString(R.string.art_gall_frag);
            case 3:
                return context.getString(R.string.war_park_frag);
            default:
                return null;
        }
    }






}
