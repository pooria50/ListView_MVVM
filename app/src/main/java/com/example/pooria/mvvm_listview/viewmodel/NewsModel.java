package com.example.pooria.mvvm_listview.viewmodel;

import com.example.pooria.mvvm_listview.model.News;

import java.util.ArrayList;

public class NewsModel  {

    public String header , desc;

    public NewsModel(News news) {
        this.header = news.header;
        this.desc = news.desc;
    }

    public NewsModel() {
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ArrayList<NewsModel> getArrayListNews() {
        ArrayList<NewsModel> newsModelArrayList = new ArrayList<>();
        NewsModel newsModel1 = new NewsModel(new News("First Headr","First Desc"));
        NewsModel newsModel2 = new NewsModel(new News("Second Headr","Second Desc"));
        NewsModel newsModel3 = new NewsModel(new News("Third Headr","Third Desc"));
        newsModelArrayList.add(newsModel1);
        newsModelArrayList.add(newsModel2);
        newsModelArrayList.add(newsModel3);
        return newsModelArrayList;
    }
}
