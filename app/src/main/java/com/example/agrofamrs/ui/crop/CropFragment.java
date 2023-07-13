package com.example.agrofamrs.ui.crop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.agrofamrs.databinding.FragmentCropMonitoringBinding;

public class CropFragment extends Fragment {

    private FragmentCropMonitoringBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        CropViewModel galleryViewModel =
                new ViewModelProvider(this).get(CropViewModel.class);

        binding = FragmentCropMonitoringBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textCropManagement;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}