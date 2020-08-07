package com.example.baseadapter;

public class Message{
    int ImageId;
    String theme;
    String content;

    public Message(int ImageId, String theme, String content) {
        this.ImageId=ImageId;
        this.theme=theme;
        this.content=content;
    }

    public int getImageId(){
        return ImageId;
    }
    public String getTheme(){
        return theme;
    }
    public String getContent(){
        return content;
    }

}
