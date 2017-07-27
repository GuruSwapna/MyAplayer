package com.example.enchanter21.myaplayer;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by enchanter21 on 19/6/17.
 */

public class all_songs implements Parcelable {
    String uid;
    String uname;
    String usong;

    protected all_songs(Parcel in) {
        uid = in.readString();
        uname = in.readString();
        usong = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(uid);
        dest.writeString(uname);
        dest.writeString(usong);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<all_songs> CREATOR = new Creator<all_songs>() {
        @Override
        public all_songs createFromParcel(Parcel in) {
            return new all_songs(in);
        }

        @Override
        public all_songs[] newArray(int size) {
            return new all_songs[size];
        }
    };

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUsong() {
        return usong;
    }

    public void setUsong(String usong) {
        this.usong = usong;
    }
}
