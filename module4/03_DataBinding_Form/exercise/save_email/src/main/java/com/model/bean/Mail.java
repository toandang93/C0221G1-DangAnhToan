package com.model.bean;

public class Mail {
    private String language;
    private int size;
    private String spam;
    private String signature;

    public Mail() {
    }

    public Mail(String language, int size, String spam, String signature) {
        this.language = language;
        this.size = size;
        this.spam = spam;
        this.signature = signature;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSpam() {
        return spam;
    }

    public void setSpam(String spam) {
        this.spam = spam;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
