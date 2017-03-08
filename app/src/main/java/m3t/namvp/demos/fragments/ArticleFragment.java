package m3t.namvp.demos.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import m3t.namvp.demos.R;


public class ArticleFragment extends Fragment {
    public static final String EXTRA_URL = "url";

    @BindView(R.id.detail)
    TextView detail;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_article, container, false);
        ButterKnife.bind(this, view);
        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            String link = (String) bundle.get(EXTRA_URL);
            if (detail == null) {
                detail = (TextView) getView().findViewById(R.id.detail);
            }
            detail.setText(link);
        }
    }
}
