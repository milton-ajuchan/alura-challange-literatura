package com.aluracursos.javaLiteratura.dto;

import java.util.List;

public class GutendexBook {
    private String title;
    private List<String> authors;
    private String language;
    private int downloads;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getDownloads() {
        return downloads;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }
}
