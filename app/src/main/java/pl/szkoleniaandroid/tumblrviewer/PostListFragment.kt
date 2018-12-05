package pl.szkoleniaandroid.tumblrviewer

import androidx.lifecycle.ViewModel
import androidx.databinding.ObservableArrayList
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import me.tatarka.bindingcollectionadapter2.ItemBinding
import pl.szkoleniaandroid.tumblrviewer.api.model.Post
import pl.szkoleniaandroid.tumblrviewer.api.model.PostsResponse
import pl.szkoleniaandroid.tumblrviewer.databinding.PostListFragmentBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.net.URL

class PostListFragment : Fragment() {

    private var url: String = ""
    lateinit var binding: PostListFragmentBinding
    lateinit var viewmodel: PostListViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = PostListFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewmodel = PostListViewModel()
        binding.viewmodel = viewmodel

        viewmodel.refresh(url)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        url = arguments?.getString(URL_ARG) ?: ""
    }

    companion object {
        private const val URL_ARG = "url"

        fun newInstance(url: String) = PostListFragment().apply {
            arguments = Bundle().apply {
                putString(URL_ARG, url)
            }
        }
    }


}

class PostItem(val title: String, val url: String)

class PostListViewModel : ViewModel() {


    val posts = ObservableArrayList<PostItem>()
    val itemBinding = ItemBinding.of<PostItem>(BR.item, R.layout.post_item)


    fun refresh(url: String) {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.tumblr.com")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        val tumblrApi = retrofit.create(TumblrApi::class.java)

        val call = tumblrApi.getPosts(url)

        call.enqueue(object : Callback<PostsResponse> {
            override fun onFailure(call: Call<PostsResponse>, t: Throwable) {

            }

            override fun onResponse(call: Call<PostsResponse>, response: Response<PostsResponse>) {
                if (response.isSuccessful) {
                    response.body()!!.response.posts.forEach {
                        Log.d("TAG", it.toString())
                    }
                    posts.addAll(response.body()!!.response.posts.map {
                        PostItem(
                            it.caption ?: "",
                            it.photos?.firstOrNull()?.originalSize?.url ?: ""
                        )
                    })
                }
            }

        })
    }

}