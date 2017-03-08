package m3t.namvp.demos.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.FrameLayout;

import butterknife.BindView;
import m3t.namvp.demos.R;
import m3t.namvp.demos.fragments.ArticleFragment;
import m3t.namvp.demos.fragments.HeadlinesFragment;

public class FragmentDemoActivity extends FragmentActivity
        implements HeadlinesFragment.OnHeadlineSelectedListener {

    @BindView(R.id.containerFragment)
    FrameLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_demo);

        //  Check that the activity is using the layout version with
        //  the fragment_container FrameLayout

        if (container != null) {
            //  However, if we're being restored from a previous state,
            //  then we don't need to do anything and should return or else
            //  we could end up with overlapping fragments.
            if (savedInstanceState != null) {
                return;
            }

            //  Create new fragment to be placed in the layout
            HeadlinesFragment headlinesFragment = new HeadlinesFragment();

            //  In case this activity was started with special instructions from an
            //  Intent, pass the Intent's extras to the fragment as arguments
            headlinesFragment.setArguments(getIntent().getExtras());

            //  Add the fragment to the 'fragment_container' FrameLayout
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.containerFragment, headlinesFragment).commit();

        }
    }


    @Override
    public void onArticleSelected(String time) {
//        ArticleFragment articleFragment = (ArticleFragment) getFragmentManager().findFragmentById(R.id.articleFragment)
    }
}
