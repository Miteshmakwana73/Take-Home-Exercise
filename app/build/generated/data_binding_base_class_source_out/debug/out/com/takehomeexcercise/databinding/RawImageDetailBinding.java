// Generated by view binder compiler. Do not edit!
package com.takehomeexcercise.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.takehomeexcercise.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RawImageDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Guideline guideline;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final ImageView imgBg;

  @NonNull
  public final TextView tvCopyright;

  @NonNull
  public final TextView tvDate;

  @NonNull
  public final TextView tvDetails;

  @NonNull
  public final TextView tvTitle;

  @NonNull
  public final View viewSearch;

  private RawImageDetailBinding(@NonNull ConstraintLayout rootView, @NonNull Guideline guideline,
      @NonNull Guideline guideline2, @NonNull ImageView imgBg, @NonNull TextView tvCopyright,
      @NonNull TextView tvDate, @NonNull TextView tvDetails, @NonNull TextView tvTitle,
      @NonNull View viewSearch) {
    this.rootView = rootView;
    this.guideline = guideline;
    this.guideline2 = guideline2;
    this.imgBg = imgBg;
    this.tvCopyright = tvCopyright;
    this.tvDate = tvDate;
    this.tvDetails = tvDetails;
    this.tvTitle = tvTitle;
    this.viewSearch = viewSearch;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RawImageDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RawImageDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.raw_image_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RawImageDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.guideline;
      Guideline guideline = ViewBindings.findChildViewById(rootView, id);
      if (guideline == null) {
        break missingId;
      }

      id = R.id.guideline2;
      Guideline guideline2 = ViewBindings.findChildViewById(rootView, id);
      if (guideline2 == null) {
        break missingId;
      }

      id = R.id.imgBg;
      ImageView imgBg = ViewBindings.findChildViewById(rootView, id);
      if (imgBg == null) {
        break missingId;
      }

      id = R.id.tvCopyright;
      TextView tvCopyright = ViewBindings.findChildViewById(rootView, id);
      if (tvCopyright == null) {
        break missingId;
      }

      id = R.id.tvDate;
      TextView tvDate = ViewBindings.findChildViewById(rootView, id);
      if (tvDate == null) {
        break missingId;
      }

      id = R.id.tvDetails;
      TextView tvDetails = ViewBindings.findChildViewById(rootView, id);
      if (tvDetails == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      id = R.id.viewSearch;
      View viewSearch = ViewBindings.findChildViewById(rootView, id);
      if (viewSearch == null) {
        break missingId;
      }

      return new RawImageDetailBinding((ConstraintLayout) rootView, guideline, guideline2, imgBg,
          tvCopyright, tvDate, tvDetails, tvTitle, viewSearch);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
