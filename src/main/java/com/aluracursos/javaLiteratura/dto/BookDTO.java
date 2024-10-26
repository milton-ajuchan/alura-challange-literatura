package com.aluracursos.javaLiteratura.dto;

public class BookDTO {

    private String title;
    private String author;
    private String language;
    private int downloadCount;

    public BookDTO() {
    }

    public BookDTO(String title, String author, String language, int downloadCount) {
        this.title = title;
        this.author = author;
        this.language = language;
        this.downloadCount = downloadCount;
    }

    // Getters y Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(int downloadCount) {
        this.downloadCount = downloadCount;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", language='" + language + '\'' +
                ", downloadCount=" + downloadCount +
                '}';
    }
}
