package com.ablethon.woongsang.gestcapturex.VO;

/**
 * Created by SangHeon on 2017-10-12.
 */

public class Article {
    public String title;
    public String description;

    public Article(String title, String description){
        this.title=title;
        this.description=description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
