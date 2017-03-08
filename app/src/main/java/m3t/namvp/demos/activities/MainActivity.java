package m3t.namvp.demos.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import m3t.namvp.demos.R;
import m3t.namvp.demos.activities.BasicDemoActivity;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btnBasicDemo)
    Button btnBasicDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnBasicDemo)
    public void onClick(View view) {
        if (view == btnBasicDemo) {
            startBasicDemo();
        }
    }

    private void startBasicDemo() {
        Intent intent = new Intent(this, BasicDemoActivity.class);
        startActivity(intent);
    }
}
