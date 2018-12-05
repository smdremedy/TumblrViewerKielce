package pl.szkoleniaandroid.tumblrviewer

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.core.view.GravityCompat
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(),
    com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener,
    PostListFragment.PostListCallback {

    override fun showPost(url: String) {
        if(findViewById<FrameLayout>(R.id.post_container).visibility == View.GONE) {
            val intent = Intent(this, PostActivity::class.java)
            intent.putExtra("url", url)
            startActivity(intent)
        } else {
            supportFragmentManager.beginTransaction()
                .replace(R.id.post_container, PostFragment.newInstance(url))
                .commit()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            com.google.android.material.snackbar.Snackbar.make(
                view,
                "Replace with your own action",
                com.google.android.material.snackbar.Snackbar.LENGTH_LONG
            )
                .setAction("Action", null).show()
        }

        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_munchies -> {
                showUrl("http://wehavemunchies.com/")
            }
            R.id.nav_xmas -> {
                showUrl("http://xmas-wonderland.tumblr.com/")

            }
            R.id.nav_cars -> {
                showUrl("http://tumblr.corvetteblogger.com/")
            }

        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun showUrl(url: String) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, PostListFragment.newInstance(url))
            .commit()
    }
}
