package com.daviladd.android.jokedisplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class JokeDisplayerFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewRoot = inflater.inflate(R.layout.fragment_joke, container, false);

        Intent intent = getActivity().getIntent();

        if (intent != null) {
            String joke = intent.getStringExtra(JokeDisplayerActivity.KEY_JOKE);
            if (joke != null && joke.length() != 0) {
                TextView jokeTextView = viewRoot.findViewById(R.id.tv_joke);
                jokeTextView.setText(joke);
            }
        }
        return viewRoot;
    }
}
