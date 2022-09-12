package com.takehomeexcercise.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0013H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lcom/takehomeexcercise/ui/activity/ListingActivity;", "Lcom/takehomeexcercise/core/BaseActivity;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "binding", "Lcom/takehomeexcercise/databinding/ActivityListingBinding;", "mList", "Ljava/util/ArrayList;", "Lcom/takehomeexcercise/ui/model/ImageData$ImageDataItem;", "Lkotlin/collections/ArrayList;", "viewModel", "Lcom/takehomeexcercise/ui/viewmodel/ListingViewModel;", "getViewModel", "()Lcom/takehomeexcercise/ui/viewmodel/ListingViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "init", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setObserve", "Companion", "app_debug"})
public final class ListingActivity extends com.takehomeexcercise.core.BaseActivity {
    private final java.lang.String TAG = null;
    private com.takehomeexcercise.databinding.ActivityListingBinding binding;
    private java.util.ArrayList<com.takehomeexcercise.ui.model.ImageData.ImageDataItem> mList;
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.takehomeexcercise.ui.activity.ListingActivity.Companion Companion = null;
    
    public ListingActivity() {
        super();
    }
    
    private final com.takehomeexcercise.ui.viewmodel.ListingViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * initialize view
     */
    private final void init() {
    }
    
    private final void setObserve() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a8\u0006\t"}, d2 = {"Lcom/takehomeexcercise/ui/activity/ListingActivity$Companion;", "", "()V", "isListNotEmpty", "", "list", "Ljava/util/ArrayList;", "Lcom/takehomeexcercise/ui/model/ImageData$ImageDataItem;", "Lkotlin/collections/ArrayList;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean isListNotEmpty(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.takehomeexcercise.ui.model.ImageData.ImageDataItem> list) {
            return false;
        }
    }
}