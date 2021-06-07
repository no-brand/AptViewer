package com.nobrand.aptviewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nobrand.aptviewer.ui.ViewerFragment
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class ViewerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewer)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                                  .replace(R.id.container, ViewerFragment.newInstance())
                                  .commitNow()
        }
    }
}
