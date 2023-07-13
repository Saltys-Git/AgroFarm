package com.example.agrofamrs.ui.market;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.agrofamrs.databinding.FragmentMarketAccessBinding;

public class MarketFragment extends Fragment {

    private FragmentMarketAccessBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MarketViewModel slideshowViewModel =
                new ViewModelProvider(this).get(MarketViewModel.class);

        binding = FragmentMarketAccessBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textMarket;
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}