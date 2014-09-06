package com.android.calmlycoding.youcandothething;

/**
 * Created by Hunter on 2014-09-04.
 */
public class Quotes {
    private int _id;
    private String _quote;
    private String _author;
    private int _view_count;

    public Quotes(){}

    public Quotes(int id, String quote, String author, int view_count){
        this._id = id;
        this._quote = quote;
        this._author = author;
        this._view_count = view_count;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_quote() {
        return _quote;
    }

    public void set_quote(String _quote) {
        this._quote = _quote;
    }

    public String get_author() {
        return _author;
    }

    public void set_author(String _author) {
        this._author = _author;
    }

    public int get_view_count() {
        return _view_count;
    }

    public void set_view_count(int _view_count) {
        this._view_count = _view_count;
    }
}
