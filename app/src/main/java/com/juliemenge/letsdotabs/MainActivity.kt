package com.juliemenge.letsdotabs

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Setup toolbar
        setSupportActionBar(toolbar)
        // Setup ViewPager
        view_pager.adapter = TabsAdapter(supportFragmentManager)
        // Setup TabLayout
        tab_layout.setupWithViewPager(view_pager)

    }
}
