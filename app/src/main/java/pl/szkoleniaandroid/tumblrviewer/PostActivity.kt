package pl.szkoleniaandroid.tumblrviewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PostActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)


        val url = intent.getStringExtra("url")

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.post_container, PostFragment.newInstance(url))
                .commit()
        }
    }
}
