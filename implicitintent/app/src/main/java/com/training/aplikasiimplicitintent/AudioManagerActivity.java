package com.training.aplikasiimplicitintent;

import android.media.AudioManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AudioManagerActivity extends AppCompatActivity {

    @BindView(R.id.ring)
    Button ring;
    @BindView(R.id.vibrate)
    Button vibrate;
    @BindView(R.id.silent)
    Button silent;
    AudioManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_manager);
        ButterKnife.bind(this);
        manager = (Au)
    }

    @OnClick({R.id.ring, R.id.vibrate, R.id.silent})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ring:
                break;
            case R.id.vibrate:
                break;
            case R.id.silent:
                break;
        }
    }
}
