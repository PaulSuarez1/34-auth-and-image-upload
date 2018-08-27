package com.example.paulsuarez.a34_auth_and_image_upload;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FeedActivity extends AppCompatActivity {

    @BindView(R.id.feed) public RecyclerView recyclerView;
    public LinearLayoutManager linearLayoutManager;
    public PostAdapter postAdapter;

    private List<Post> mPost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        ButterKnife.bind(this);

        mPosts = new ArrayList<>();


    }
}
