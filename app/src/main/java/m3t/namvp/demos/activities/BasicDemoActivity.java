package m3t.namvp.demos.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import m3t.namvp.demos.R;

public class BasicDemoActivity extends AppCompatActivity {

    @BindView(R.id.btnFragmentDemo)
    Button btnFragmentDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_demo);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnFragmentDemo)
    public void onClick() {
    }
}
