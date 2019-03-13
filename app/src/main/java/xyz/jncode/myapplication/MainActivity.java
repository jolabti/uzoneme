package xyz.jncode.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import xyz.jncode.myapplication.Base.BaseOkHttpClient;
import xyz.jncode.myapplication.adapter.NewsAdapter;
import xyz.jncode.myapplication.gson.GSONNews;
import xyz.jncode.myapplication.model.Newsfeeditem;
import xyz.jncode.myapplication.model.Newsfeedme;
import xyz.jncode.myapplication.source.Apis;
import xyz.jncode.myapplication.source.ItemObject;

public class MainActivity extends AppCompatActivity {
    private ArrayList<ItemObject> datas = new ArrayList<>();

    private List<Newsfeedme> newsLists;

    private NewsAdapter newsAdapter;

    RecyclerView rvNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvNews = findViewById(R.id.newsRV );
        newsLists = new ArrayList<>();

        rvNews.setHasFixedSize(true);
        rvNews.setLayoutManager(new LinearLayoutManager(this));
        startRequestNews();
    }


    private void startRequestAPI(){

    }


    private  void startRequestNews(){





        final Request request = new Request.Builder()
                .url(Apis.homePage)
                .tag(Apis.TAG_HOMEPAGE)
                .cacheControl(CacheControl.FORCE_NETWORK)
                .build();



        BaseOkHttpClient.cancelRequest(Apis.TAG_HOMEPAGE);
        BaseOkHttpClient.getInstance(this).newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

                Log.d("trace_failure", e.getMessage().toString());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {



                if(response.isSuccessful()){

                    try {

//                        final GSONNews gson = new Gson().fromJson(response.body().string(), GSONNews.class);

                        JSONObject jobRoot = new JSONObject(response.body().string());
                        Log.d("trace_job_root", jobRoot.toString());

                        JSONObject jobData = jobRoot.getJSONObject("datas");
                        Log.d("trace_job_data", jobData.toString());


                        JSONObject jobHeadline = jobData.getJSONObject("headline");
                        JSONObject jobTrending = jobData.getJSONObject("trending");

                        Log.d("trace_jobTrending", jobTrending.toString());

                        JSONArray jarNewsfeedHeadline = jobHeadline.getJSONArray("newsfeed");
                        JSONArray jarNewsfeedTrending = jobTrending.getJSONArray("newsfeed");

                        newsLists.clear();

                        for (int iterHeadline=0;iterHeadline<jarNewsfeedHeadline.length();iterHeadline++){

                                Log.d("trace_blocktype", "headline");
                                Log.d("trace_postall", jarNewsfeedHeadline.get(iterHeadline).toString());


                                JSONObject postItem = new JSONObject(jarNewsfeedHeadline.get(iterHeadline).toString());

                                Newsfeedme headliners = new Newsfeedme(
                                         jobHeadline.getString("block_type"),
                                         postItem.getString("post_id"),
                                         postItem.getString("post_title"),
                                         postItem.getString("post_title_masking"),
                                         postItem.getString("post_author"),
                                         postItem.getString("post_publish_date"),
                                         postItem.getString("feature_img")

                                        );
                              newsLists.add(headliners);

                        }


                        for (int iterTrending=0;iterTrending<jarNewsfeedTrending.length();iterTrending++){


                                Log.d("trace_trdpostall", jarNewsfeedTrending.get(iterTrending).toString());
                                //Log.d("trace_trdimage", jarNewsfeedTrending.get(iterTrending).toString());


                                JSONObject postItem = new JSONObject(jarNewsfeedHeadline.get(iterTrending).toString());
                                Log.d("trace_trdimage", postItem.getString("feature_img") );

                                Newsfeedme headliners = new Newsfeedme(
                                         jobTrending.getString("block_type"),
                                         postItem.getString("post_id"),
                                         postItem.getString("post_title"),
                                         postItem.getString("post_title_masking"),
                                         postItem.getString("post_author"),
                                         postItem.getString("post_publish_date"),
                                         postItem.getString("feature_img")



                                        );
                              newsLists.add(headliners);

                        }

                        newsAdapter = new NewsAdapter(newsLists, getApplicationContext());
                        rvNews.setAdapter(newsAdapter);
                        //newsAdapter.notifyDataSetChanged();

                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });


    }





}
