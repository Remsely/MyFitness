package edu.samsungit.remsely.myfitness.ui.time_table;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TimeTableViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public TimeTableViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}