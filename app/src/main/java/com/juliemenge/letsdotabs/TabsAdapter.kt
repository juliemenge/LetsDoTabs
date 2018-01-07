package com.juliemenge.letsdotabs

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.juliemenge.letsdotabs.FragmentA
import com.juliemenge.letsdotabs.FragmentB
import com.juliemenge.letsdotabs.FragmentC


class TabsAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {
    // Title for tabs
    private val fragmentTitles = arrayOf("Fragment A", "Fragment B", "Fragment C")
    // Return the Fragment associated with a specified position.
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> FragmentA()
            1 -> FragmentB()
            2 -> FragmentC()
            else -> FragmentA()
        }
    }
    // Return the number of views/fragments available.
    override fun getCount(): Int = 3 // in our case 3 fragments
    // Return title based on position
    override fun getPageTitle(position: Int): CharSequence {
        return fragmentTitles[position]
    }
}