package com.trainee.appinventiv.tour_guide_app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.trainee.appinventiv.tour_guide_app.ui.CategoryAdapter
import java.net.URI

class MainActivity : AppCompatActivity() , Navigate {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Set the content of the activity to use the activity_main.xml layout file

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main)

        // Find the view pager that will allow the user to swipe between fragments

        // Find the view pager that will allow the user to swipe between fragments
        val viewPager = findViewById<View>(R.id.viewpager) as ViewPager

        // Create an adapter that knows which fragment should be shown on each page

        // Create an adapter that knows which fragment should be shown on each page
        val adapter = CategoryAdapter(this , supportFragmentManager)

        // Set the adapter onto the view pager

        // Set the adapter onto the view pager
        viewPager.adapter = adapter

        // Find the tab layout that shows the tabs

        // Find the tab layout that shows the tabs
        val tabLayout = findViewById<View>(R.id.tabs) as TabLayout

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()


        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager)

    }

    override fun navigate() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=22.659239,88.435534&mode=l"))
        intent.setPackage("com.google.android.apps.maps")
        if(intent.resolveActivity(packageManager) != null)
            startActivity(intent)
    }
}