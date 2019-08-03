package com.ztech.z_shop.view;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    LiveData<List<String>> categoryTitlesList;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);


    }
}
