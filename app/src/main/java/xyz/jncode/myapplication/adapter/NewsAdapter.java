package xyz.jncode.myapplication.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

import xyz.jncode.myapplication.R;
import xyz.jncode.myapplication.model.Newsfeedme;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.Newsholder> {

    private List<Newsfeedme> newsLists;
    private Context context;


    public NewsAdapter(List<Newsfeedme> newsLists, Context context)
    {


        this.context = context;
        this.newsLists = newsLists;


    }

    @NonNull
    @Override
    public Newsholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_news_item, parent, false);
        return new Newsholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Newsholder newsholder, int pos) {

        final Newsfeedme newsfeedme = newsLists.get(pos);
        newsholder.tvTittle.setText(newsfeedme.getPostTitleMasking() );
        newsholder.tvDate.setText(newsfeedme.getBlockType());



        //Log.d("trace_getLinkImage",newsfeedme.getFeatureImg());
          Picasso.get().load(newsfeedme.getFeatureImg()).fit().into( newsholder.imgNews);

          newsholder.llGroup.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Toast.makeText(context.getApplicationContext(), newsfeedme.getBlockType(), Toast.LENGTH_LONG).show();
              }
          });
    }

    @Override
    public int getItemCount() {

        return newsLists.size();
    }

    public class Newsholder extends RecyclerView.ViewHolder {


        AppCompatTextView tvTittle;
        AppCompatTextView tvDate;
        AppCompatImageView imgNews;
        LinearLayout llGroup;

        public Newsholder(@NonNull View itemView) {
            super(itemView);
            tvTittle = itemView.findViewById(R.id.title);
            tvDate= itemView.findViewById(R.id.date);
            imgNews= itemView.findViewById(R.id.image);
            llGroup = itemView.findViewById(R.id.ll_item_news);
        }
    }
}
