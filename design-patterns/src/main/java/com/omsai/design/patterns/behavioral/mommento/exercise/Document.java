package com.omsai.design.patterns.behavioral.mommento.exercise;

public class Document {

    private String content;
    private String fontName;
    private int fontSize;

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }

    public Document(String content, String fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public DocumentState createState() {
        return new DocumentState(content, fontName, fontSize);
    }

    public void restore(DocumentState documentState) {
        this.content = documentState.content();
        this.fontName = documentState.fontName();
        this.fontSize = documentState.fontSize();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
}
