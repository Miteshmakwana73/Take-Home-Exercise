package com.takehomeexcercise;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0019\u001aB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0016\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/takehomeexcercise/ReadMoreOption;", "", "builder", "Lcom/takehomeexcercise/ReadMoreOption$Builder;", "(Lcom/takehomeexcercise/ReadMoreOption$Builder;)V", "context", "Landroid/content/Context;", "expandAnimation", "", "labelUnderLine", "lessLabel", "", "lessLabelColor", "", "moreLabel", "moreLabelColor", "textLength", "textLengthType", "addReadLess", "", "textView", "Landroid/widget/TextView;", "text", "", "addReadMoreTo", "Builder", "Companion", "app_debug"})
public final class ReadMoreOption {
    private final android.content.Context context = null;
    private final int textLength = 0;
    private final int textLengthType = 0;
    private final java.lang.String moreLabel = null;
    private final java.lang.String lessLabel = null;
    private final int moreLabelColor = 0;
    private final int lessLabelColor = 0;
    private final boolean labelUnderLine = false;
    private final boolean expandAnimation = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.takehomeexcercise.ReadMoreOption.Companion Companion = null;
    private static final java.lang.String TAG = null;
    public static final int TYPE_LINE = 1;
    public static final int TYPE_CHARACTER = 2;
    
    private ReadMoreOption(com.takehomeexcercise.ReadMoreOption.Builder builder) {
        super();
    }
    
    public final void addReadMoreTo(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text) {
    }
    
    private final void addReadLess(android.widget.TextView textView, java.lang.CharSequence text) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010(\u001a\u00020)J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0011J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0017J\u0016\u0010\"\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u001a\u0010\u001f\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001a\u0010\"\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR\u001a\u0010%\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b\'\u0010\u001b\u00a8\u0006+"}, d2 = {"Lcom/takehomeexcercise/ReadMoreOption$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "expandAnimation", "", "getExpandAnimation", "()Z", "setExpandAnimation", "(Z)V", "labelUnderLine", "getLabelUnderLine", "setLabelUnderLine", "lessLabel", "", "getLessLabel", "()Ljava/lang/String;", "setLessLabel", "(Ljava/lang/String;)V", "lessLabelColor", "", "getLessLabelColor", "()I", "setLessLabelColor", "(I)V", "moreLabel", "getMoreLabel", "setMoreLabel", "moreLabelColor", "getMoreLabelColor", "setMoreLabelColor", "textLength", "getTextLength", "setTextLength", "textLengthType", "getTextLengthType", "setTextLengthType", "build", "Lcom/takehomeexcercise/ReadMoreOption;", "length", "app_debug"})
    public static final class Builder {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        private int textLength = 100;
        private int textLengthType = 2;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String moreLabel = "read more";
        @org.jetbrains.annotations.NotNull()
        private java.lang.String lessLabel = "read less";
        private int moreLabelColor;
        private int lessLabelColor;
        private boolean labelUnderLine = false;
        private boolean expandAnimation = false;
        
        public Builder(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        public final int getTextLength() {
            return 0;
        }
        
        public final void setTextLength(int p0) {
        }
        
        public final int getTextLengthType() {
            return 0;
        }
        
        public final void setTextLengthType(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMoreLabel() {
            return null;
        }
        
        public final void setMoreLabel(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLessLabel() {
            return null;
        }
        
        public final void setLessLabel(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final int getMoreLabelColor() {
            return 0;
        }
        
        public final void setMoreLabelColor(int p0) {
        }
        
        public final int getLessLabelColor() {
            return 0;
        }
        
        public final void setLessLabelColor(int p0) {
        }
        
        public final boolean getLabelUnderLine() {
            return false;
        }
        
        public final void setLabelUnderLine(boolean p0) {
        }
        
        public final boolean getExpandAnimation() {
            return false;
        }
        
        public final void setExpandAnimation(boolean p0) {
        }
        
        /**
         * @param length         can be no. of line OR no. of characters - default is 100 character
         * @param textLengthType ReadMoreOption.TYPE_LINE for no. of line OR
         * ReadMoreOption.TYPE_CHARACTER for no. of character
         * - default is ReadMoreOption.TYPE_CHARACTER
         * @return Builder obj
         */
        @org.jetbrains.annotations.NotNull()
        public final com.takehomeexcercise.ReadMoreOption.Builder textLength(int length, int textLengthType) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.takehomeexcercise.ReadMoreOption.Builder moreLabel(@org.jetbrains.annotations.NotNull()
        java.lang.String moreLabel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.takehomeexcercise.ReadMoreOption.Builder lessLabel(@org.jetbrains.annotations.NotNull()
        java.lang.String lessLabel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.takehomeexcercise.ReadMoreOption.Builder moreLabelColor(int moreLabelColor) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.takehomeexcercise.ReadMoreOption.Builder lessLabelColor(int lessLabelColor) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.takehomeexcercise.ReadMoreOption.Builder labelUnderLine(boolean labelUnderLine) {
            return null;
        }
        
        /**
         * @param expandAnimation either true to enable animation on expand or false to disable animation
         * - default is false
         * @return Builder obj
         */
        @org.jetbrains.annotations.NotNull()
        public final com.takehomeexcercise.ReadMoreOption.Builder expandAnimation(boolean expandAnimation) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.takehomeexcercise.ReadMoreOption build() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/takehomeexcercise/ReadMoreOption$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "TYPE_CHARACTER", "", "TYPE_LINE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}