// Generated by view binder compiler. Do not edit!
package com.example.mymoviewdb.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mymoviewdb.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RowItemGenreBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView ivPoint;

  @NonNull
  public final TextView tvGenreDetail;

  private RowItemGenreBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView ivPoint,
      @NonNull TextView tvGenreDetail) {
    this.rootView = rootView;
    this.ivPoint = ivPoint;
    this.tvGenreDetail = tvGenreDetail;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RowItemGenreBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowItemGenreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_item_genre, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowItemGenreBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivPoint;
      ImageView ivPoint = ViewBindings.findChildViewById(rootView, id);
      if (ivPoint == null) {
        break missingId;
      }

      id = R.id.tvGenreDetail;
      TextView tvGenreDetail = ViewBindings.findChildViewById(rootView, id);
      if (tvGenreDetail == null) {
        break missingId;
      }

      return new RowItemGenreBinding((ConstraintLayout) rootView, ivPoint, tvGenreDetail);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
