package cn.hwj.uselib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cn.hwj.np.NpUtils;
import cn.hwj.sdk.GreeNp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NpUtils.test();
        GreeNp.trackSearch("6666c");
    }
}