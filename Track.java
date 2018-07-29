package com.example.benjaminaddai.soundgood;

public class Track {

    private String mArtist;
    private String mTitle;
    private String mAlbum;

    public Track(String mArtist, String mTitle, String mAlbum) {
        this.mArtist = mArtist;
        this.mTitle = mTitle;
        this.mAlbum = mAlbum;
    }

    public String getmArtist() {
        return mArtist;
    }

    public void setmArtist(String mArtist) {
        this.mArtist = mArtist;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmAlbum() {
        return mAlbum;
    }

    public void setmAlbum(String mAlbum) {
        this.mAlbum = mAlbum;
    }
}
