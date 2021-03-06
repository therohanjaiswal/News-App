package com.example.newsapp;

public class News {
    private String mTitle;
    private String mDate;
    private String mUrl;
    private String mSection;

    public News(String title, String date, String url, String section) {
        mTitle = title;
        mDate = date;
        mUrl = url;
        mSection = section;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDate() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getSection() {
        return mSection;
    }

    @Override
    public String toString() {
        return  " title "    + getTitle();

    }
}
