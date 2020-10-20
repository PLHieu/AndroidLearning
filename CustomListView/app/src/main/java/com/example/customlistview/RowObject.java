package com.example.customlistview;

import android.graphics.drawable.Drawable;
import android.inputmethodservice.Keyboard;

public class RowObject {
    private int _image;
    private String _title;
    private String _description;

    public RowObject(int image, String title, String description) {
        _image = image;
        _title = title;
        _description = description;
    }

    public int getImage() {
        return _image;
    }

    public void setImage(int image) {
        _image = image;
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String title) {
        _title = title;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }
}
