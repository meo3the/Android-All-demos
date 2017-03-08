package m3t.namvp.demos.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import m3t.namvp.demos.R;

/**
 * Created by namvp aka meo_3_the.
 */

public class HeadlinesFragment extends Fragment {
    @BindView(R.id.btnGetTime)
    Button btnGetTime;

    OnHeadlineSelectedListener mCallback;

    public interface OnHeadlineSelectedListener {
        public void onArticleSelected(String time);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_headlines, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception
        try {
            mCallback = (OnHeadlineSelectedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnHeadlineSelectedListener");
        }
    }


    @OnClick(R.id.btnGetTime)
    public void onClick() {
        updateTime();
    }

    //  may also be triggered by the activity
    private void updateTime() {
        //  Create new String for testing
        String newTime = String.valueOf(System.currentTimeMillis());

        //  inform the activity about the change based interface definition
        mCallback.onArticleSelected(newTime);
    }

}
