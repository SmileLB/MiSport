package com.wkl.misport;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ConnectView mConnectView;

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mConnectView = (ConnectView) findViewById(R.id.connect_view);
    }

    public void loading(View view) {
        mConnectView.loading();
    }

    public void finish(View view) {
        mConnectView.finish();
    }
}
