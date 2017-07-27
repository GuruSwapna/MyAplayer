package com.example.enchanter21.myaplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.jean.jcplayer.JcAudio;
import com.example.jean.jcplayer.JcPlayerService;
import com.example.jean.jcplayer.JcPlayerView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity implements JcPlayerService.JcPlayerServiceListener {

    JcPlayerView jcplayerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        String s1=getIntent().getStringExtra("msg1");
        //Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_SHORT).show();
        jcplayerView = (JcPlayerView) findViewById(R.id.jcplayer);
        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("url audio",s1));
        jcplayerView.initPlaylist(jcAudios);
        jcplayerView.initAnonPlaylist(jcAudios);
        //jcplayerView.initWithTitlePlaylist(urls, "Awesome music");
        jcplayerView.createNotification();
    }

    @Override
    public void onPreparedAudio(String audioName, int duration) {

    }

    @Override
    public void onCompletedAudio() {

    }

    @Override
    public void onPaused() {

    }

    @Override
    public void onContinueAudio() {

    }

    @Override
    public void onPlaying() {

    }

    @Override
    public void onTimeChanged(long currentTime) {

    }

    @Override
    public void updateTitle(String title) {

    }
}
