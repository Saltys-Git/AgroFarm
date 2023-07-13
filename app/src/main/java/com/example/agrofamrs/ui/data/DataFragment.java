package com.example.agrofamrs.ui.data;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.agrofamrs.databinding.FragmentDataAnalyticsBinding;
public class DataFragment extends Fragment {

    private FragmentDataAnalyticsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DataViewModel slideshowViewModel =
                new ViewModelProvider(this).get(DataViewModel.class);

        binding = FragmentDataAnalyticsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textData;
        final WebView webView = binding.webView;
        webView.loadUrl("https://www.ventusky.com/khulna");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}