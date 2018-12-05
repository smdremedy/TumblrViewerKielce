package pl.szkoleniaandroid.tumblrviewer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment

class PostFragment : Fragment() {

    var postUrl: String = ""

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.post_fragment, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val webView: WebView = view.findViewById(R.id.web_view)
        webView.webViewClient = object: WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                return false
            }
        }
        webView.loadUrl(postUrl)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        postUrl = arguments?.getString(POST_URL_ARG) ?: ""
    }

    companion object {
        private const val POST_URL_ARG = "post_url"

        fun newInstance(postUrl: String) = PostFragment().apply {
            arguments = Bundle().apply {
                putString(POST_URL_ARG, postUrl)
            }
        }
    }


}