package com.takehomeexcercise.ui.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lcom/takehomeexcercise/ui/viewmodel/ListingViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_getImagesResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/takehomeexcercise/network/Resource;", "Lcom/takehomeexcercise/ui/model/ImageData;", "getImageResponse", "Landroidx/lifecycle/LiveData;", "getGetImageResponse", "()Landroidx/lifecycle/LiveData;", "getImages", "Lkotlinx/coroutines/Job;", "activity", "Landroid/app/Activity;", "filename", "", "app_debug"})
public final class ListingViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.takehomeexcercise.network.Resource<com.takehomeexcercise.ui.model.ImageData>> _getImagesResponse = null;
    
    @javax.inject.Inject()
    public ListingViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.takehomeexcercise.network.Resource<com.takehomeexcercise.ui.model.ImageData>> getGetImageResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getImages(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String filename) {
        return null;
    }
}