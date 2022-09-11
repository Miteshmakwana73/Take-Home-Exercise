package com.takehomeexcercise.ui.adapter;

import java.lang.System;

/**
 * Details of image viewpager2 adapter : Show image details list.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/takehomeexcercise/ui/adapter/ImageDetailAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/takehomeexcercise/ui/adapter/ImageDetailAdapter$ViewHolder;", "context", "Landroid/content/Context;", "mList", "Ljava/util/ArrayList;", "Lcom/takehomeexcercise/ui/model/ImageData$ImageDataItem;", "Lkotlin/collections/ArrayList;", "viewHolderClicks", "Lcom/takehomeexcercise/ui/adapter/ImageDetailAdapter$ViewHolderClicks;", "(Landroid/content/Context;Ljava/util/ArrayList;Lcom/takehomeexcercise/ui/adapter/ImageDetailAdapter$ViewHolderClicks;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "ViewHolderClicks", "app_debug"})
public final class ImageDetailAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.takehomeexcercise.ui.adapter.ImageDetailAdapter.ViewHolder> {
    private final android.content.Context context = null;
    private final java.util.ArrayList<com.takehomeexcercise.ui.model.ImageData.ImageDataItem> mList = null;
    private final com.takehomeexcercise.ui.adapter.ImageDetailAdapter.ViewHolderClicks viewHolderClicks = null;
    
    public ImageDetailAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.takehomeexcercise.ui.model.ImageData.ImageDataItem> mList, @org.jetbrains.annotations.NotNull()
    com.takehomeexcercise.ui.adapter.ImageDetailAdapter.ViewHolderClicks viewHolderClicks) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.takehomeexcercise.ui.adapter.ImageDetailAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.takehomeexcercise.ui.adapter.ImageDetailAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2 = {"Lcom/takehomeexcercise/ui/adapter/ImageDetailAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/takehomeexcercise/databinding/RawImageDetailBinding;", "(Lcom/takehomeexcercise/databinding/RawImageDetailBinding;)V", "getViewBinding", "()Lcom/takehomeexcercise/databinding/RawImageDetailBinding;", "setViewBinding", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.takehomeexcercise.databinding.RawImageDetailBinding viewBinding;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.takehomeexcercise.databinding.RawImageDetailBinding viewBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.takehomeexcercise.databinding.RawImageDetailBinding getViewBinding() {
            return null;
        }
        
        public final void setViewBinding(@org.jetbrains.annotations.NotNull()
        com.takehomeexcercise.databinding.RawImageDetailBinding p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/takehomeexcercise/ui/adapter/ImageDetailAdapter$ViewHolderClicks;", "", "onClickItem", "", "model", "Lcom/takehomeexcercise/ui/model/ImageData$ImageDataItem;", "position", "", "app_debug"})
    public static abstract interface ViewHolderClicks {
        
        public abstract void onClickItem(@org.jetbrains.annotations.NotNull()
        com.takehomeexcercise.ui.model.ImageData.ImageDataItem model, int position);
    }
}