package com.trainee.appinventiv.tour_guide_app.ui

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.trainee.appinventiv.tour_guide_app.ui.fragments.*


/**
 * [CategoryAdapter] is a [FragmentPagerAdapter] that can provide the layout for
 * each list item based on a data source which is a list of [Place] objects.
 */
class CategoryAdapter
/**
 * Create a new [CategoryAdapter] object.
 *
 * @param context is the context of the app
 * @param fm is the fragment manager that will keep each fragment's state in the adapter
 * across swipes.
 */(
    /** Context of the app  */
    private val mContext: Context , fm: FragmentManager
) :
    FragmentPagerAdapter(fm) {
    /**
     * Return the [Fragment] that should be displayed for the given page number.
     */
    override fun getItem(position: Int): Fragment {
        return if (position == 0) {
            HeritagesFragment()
        } else if (position == 1) {
            MuseumsFragment()
        } else if (position == 2) {
            TemplesFragment()
        } else if (position == 3) {
            GardensFragment()
        } else if (position == 4) {
            MarketsFragment()
        } else if (position == 5) {
            HotelsFragment()
        } else if (position == 6) {
            RestaurantsFragment()
        } else {
            EventsFragment()
        }
    }

//    private fun TemplesFragment(): EventsFragment {
//
//    }

    /**
     * Return the total number of pages.
     */
    override fun getCount(): Int {
        return 8
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return if (position == 0) {
            "Heritages"
        } else if (position == 1) {
            "Museums"
        } else if (position == 2) {
            "Temples"
        } else if (position == 3) {
            "Gardens"
        } else if (position == 4) {
            "Markets"
        } else if (position == 5) {
            "Hotels"
        } else if (position == 6) {
            "Restaurants"
        } else {
            "Events"
        }
    }
}