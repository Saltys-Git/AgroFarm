package com.example.agrofamrs.ui.resource;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ResourceViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ResourceViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is resource fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}