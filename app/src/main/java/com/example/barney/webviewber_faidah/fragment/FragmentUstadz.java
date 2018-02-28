package com.example.barney.webviewber_faidah.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import com.example.barney.webviewber_faidah.R;

public class FragmentUstadz extends Fragment {
    WebView webView;
    public FragmentUstadz() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_ustadz2, container, false);
        webView = view.findViewById(R.id.webViewUstadz);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://yufid.tv/ustadz");

        return view;
    }
}
