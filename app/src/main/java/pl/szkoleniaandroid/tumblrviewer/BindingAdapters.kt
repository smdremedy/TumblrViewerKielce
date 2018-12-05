package pl.szkoleniaandroid.tumblrviewer

import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.Placeholder
import androidx.core.text.HtmlCompat
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso

@BindingAdapter("imageUrl", "placeholder", requireAll = false)
fun loadUrl(view: ImageView, url: String, placeholder: Int) {
    if (url.isNotEmpty()) {
        Picasso.get().load(url)
            .placeholder(if(placeholder == 0) R.mipmap.ic_launcher else placeholder)
            .into(view)
    }
}

@BindingAdapter("html")
fun loadHtml(view: TextView, html: String) {
    view.text = HtmlCompat.fromHtml(html, HtmlCompat.FROM_HTML_MODE_COMPACT)
}