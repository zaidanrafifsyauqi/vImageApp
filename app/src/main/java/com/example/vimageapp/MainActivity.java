package com.example.vimageapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView postsRecyclerView = findViewById(R.id.postRecyclerView);
        postsRecyclerView.setLayoutManager(
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        );

        List<PostItem> postItems = new ArrayList<>();
        postItems.add(new PostItem(R.drawable.hackel));
        postItems.add(new PostItem(R.drawable.hacker));
        postItems.add(new PostItem(R.drawable.hck));
        postItems.add(new PostItem(R.drawable.hp4));
        postItems.add(new PostItem(R.drawable.ironman));
        postItems.add(new PostItem(R.drawable.ironmanxx));
        postItems.add(new PostItem(R.drawable.ninja));
        postItems.add(new PostItem(R.drawable.papji));
        postItems.add(new PostItem(R.drawable.perkedel));
        postItems.add(new PostItem(R.drawable.pinix));

        postsRecyclerView.setAdapter(new PostAdapter(postItems));
    }
}