package com.example.pooria.mvvm_listview;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.pooria.mvvm_listview.adapter.NewsAdapter;
import com.example.pooria.mvvm_listview.databinding.ActivityMainBinding;
import com.example.pooria.mvvm_listview.viewmodel.NewsModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private NewsModel newsModel;
    private ArrayList<NewsModel> newsModelArrayList;
    private NewsAdapter newsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        newsModel = new NewsModel();
        newsModelArrayList = newsModel.getArrayListNews();
        newsAdapter = new NewsAdapter(this, newsModelArrayList);
        activityMainBinding.listview.setAdapter(newsAdapter);

    }
}
