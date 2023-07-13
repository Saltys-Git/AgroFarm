package com.example.agrofamrs.ui.resource;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.agrofamrs.databinding.FragmentResourceManagementBinding;

public class ResourceFragment extends Fragment {

    private FragmentResourceManagementBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ResourceViewModel slideshowViewModel =
                new ViewModelProvider(this).get(ResourceViewModel.class);

        binding = FragmentResourceManagementBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textResource;
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}