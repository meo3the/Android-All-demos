package m3t.namvp.demos.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import m3t.namvp.demos.R;

/**
 * Created by namvp aka meo_3_the.
 */

public class BasicDemoActivity extends AppCompatActivity {
    @BindView(R.id.btnFragmentDemo)
    Button btnFragmentDemo;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_demo);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnFragmentDemo)
    public void onClick(View view) {
        if (view == btnFragmentDemo) {
            startFragmentDemo();
        }
    }

    private void startFragmentDemo() {
        startActivity(new Intent(this, FragmentDemoActivity.class));
    }
}
