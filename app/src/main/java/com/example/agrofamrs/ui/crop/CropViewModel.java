package com.example.agrofamrs.ui.crop;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CropViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public CropViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is crop management fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}