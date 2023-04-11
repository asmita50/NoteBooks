package com.example.notebook;

public class Note {
    String title;
    String dis;
    String Category;

    public Note(String title, String dis, String category) {

        this.title = title;
        this.dis = dis;
        Category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDis() {
        return dis;
    }

    public void setDis(String dis) {
        this.dis = dis;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }
}
