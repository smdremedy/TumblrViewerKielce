package pl.szkoleniaandroid.tumblrviewer

import android.widget.ImageView
import android.widget.TextView
import androidx.core.text.HtmlCompat
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso

@BindingAdapter("imageUrl")
fun loadUrl(view: ImageView, url: String) {
    if (url.isNotEmpty()) {
        Picasso.get().load(url).into(view)
    }
}

@BindingAdapter("html")
fun loadHtml(view: TextView, html: String) {
    view.text = HtmlCompat.fromHtml(html, HtmlCompat.FROM_HTML_MODE_COMPACT)
}