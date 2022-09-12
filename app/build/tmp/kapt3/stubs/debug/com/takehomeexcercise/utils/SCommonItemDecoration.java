package com.takehomeexcercise.utils;

import java.lang.System;

/**
 * SCommonItemDecoration: item decoration for grid style recyclerview
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/takehomeexcercise/utils/SCommonItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "mPropMap", "Landroid/util/SparseArray;", "Lcom/takehomeexcercise/utils/SCommonItemDecoration$ItemDecorationProps;", "(Landroid/util/SparseArray;)V", "TAG", "", "kotlin.jvm.PlatformType", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "ItemDecorationProps", "app_debug"})
public final class SCommonItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    private final android.util.SparseArray<com.takehomeexcercise.utils.SCommonItemDecoration.ItemDecorationProps> mPropMap = null;
    private final java.lang.String TAG = null;
    
    public SCommonItemDecoration(@org.jetbrains.annotations.Nullable()
    android.util.SparseArray<com.takehomeexcercise.utils.SCommonItemDecoration.ItemDecorationProps> mPropMap) {
        super();
    }
    
    @java.lang.Override()
    public void getItemOffsets(@org.jetbrains.annotations.NotNull()
    android.graphics.Rect outRect, @org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.State state) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r\u00a8\u0006\u000f"}, d2 = {"Lcom/takehomeexcercise/utils/SCommonItemDecoration$ItemDecorationProps;", "", "horizontalSpace", "", "verticalSpace", "hasHorizontalEdge", "", "hasVerticalEdge", "(IIZZ)V", "getHasHorizontalEdge", "()Z", "getHasVerticalEdge", "getHorizontalSpace", "()I", "getVerticalSpace", "app_debug"})
    public static final class ItemDecorationProps {
        private final int horizontalSpace = 0;
        private final int verticalSpace = 0;
        private final boolean hasHorizontalEdge = false;
        private final boolean hasVerticalEdge = false;
        
        public ItemDecorationProps(int horizontalSpace, int verticalSpace, boolean hasHorizontalEdge, boolean hasVerticalEdge) {
            super();
        }
        
        public final int getHorizontalSpace() {
            return 0;
        }
        
        public final int getVerticalSpace() {
            return 0;
        }
        
        public final boolean getHasHorizontalEdge() {
            return false;
        }
        
        public final boolean getHasVerticalEdge() {
            return false;
        }
    }
}