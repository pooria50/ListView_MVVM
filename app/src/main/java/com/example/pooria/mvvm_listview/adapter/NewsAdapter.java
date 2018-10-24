package com.example.pooria.mvvm_listview.adapter;


import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.pooria.mvvm_listview.R;
import com.example.pooria.mvvm_listview.databinding.ListRowBinding;
import com.example.pooria.mvvm_listview.viewmodel.NewsModel;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<NewsModel> {

    private ArrayList<NewsModel> newsModelArrayList;
    private Context context;

    public NewsAdapter(@NonNull Context context, ArrayList<NewsModel> newsModelArrayList) {
        super(context, R.layout.list_row, newsModelArrayList);
        this.context = context;
        this.newsModelArrayList = newsModelArrayList;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ListRowBinding listRowBinding = DataBindingUtil.inflate(inflater, R.layout.list_row, parent, false);
        listRowBinding.setNewsList(newsModelArrayList.get(position));
        return listRowBinding.getRoot();
    }
}
