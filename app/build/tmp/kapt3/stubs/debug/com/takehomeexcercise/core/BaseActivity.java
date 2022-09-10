package com.takehomeexcercise.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0004J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0004R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/takehomeexcercise/core/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "customProgressDialog", "Lcom/takehomeexcercise/CustomProgressDialog;", "hideProgress", "", "showProgress", "context", "Landroid/content/Context;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.takehomeexcercise.CustomProgressDialog customProgressDialog;
    private final java.lang.String TAG = null;
    
    public BaseActivity() {
        super();
    }
    
    /**
     * show progress dialog
     * @param context context of activity
     */
    protected final void showProgress(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * hide progress dialog
     */
    protected final void hideProgress() {
    }
}