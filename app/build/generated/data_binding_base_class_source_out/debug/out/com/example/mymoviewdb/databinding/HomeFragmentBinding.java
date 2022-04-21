// Generated by view binder compiler. Do not edit!
package com.example.mymoviewdb.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mymoviewdb.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class HomeFragmentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final RelativeLayout relativeLayout;

  @NonNull
  public final RelativeLayout rlImage;

  @NonNull
  public final RecyclerView rvBanner;

  @NonNull
  public final RecyclerView rvComingSoon;

  @NonNull
  public final RecyclerView rvPopularMovie;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView tvDb;

  @NonNull
  public final TextView tvMovie;

  private HomeFragmentBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView imageView,
      @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout rlImage,
      @NonNull RecyclerView rvBanner, @NonNull RecyclerView rvComingSoon,
      @NonNull RecyclerView rvPopularMovie, @NonNull TextView textView4,
      @NonNull TextView textView5, @NonNull TextView tvDb, @NonNull TextView tvMovie) {
    this.rootView = rootView;
    this.imageView = imageView;
    this.relativeLayout = relativeLayout;
    this.rlImage = rlImage;
    this.rvBanner = rvBanner;
    this.rvComingSoon = rvComingSoon;
    this.rvPopularMovie = rvPopularMovie;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.tvDb = tvDb;
    this.tvMovie = tvMovie;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static HomeFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HomeFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.home_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HomeFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.relativeLayout;
      RelativeLayout relativeLayout = ViewBindings.findChildViewById(rootView, id);
      if (relativeLayout == null) {
        break missingId;
      }

      id = R.id.rlImage;
      RelativeLayout rlImage = ViewBindings.findChildViewById(rootView, id);
      if (rlImage == null) {
        break missingId;
      }

      id = R.id.rvBanner;
      RecyclerView rvBanner = ViewBindings.findChildViewById(rootView, id);
      if (rvBanner == null) {
        break missingId;
      }

      id = R.id.rvComingSoon;
      RecyclerView rvComingSoon = ViewBindings.findChildViewById(rootView, id);
      if (rvComingSoon == null) {
        break missingId;
      }

      id = R.id.rvPopularMovie;
      RecyclerView rvPopularMovie = ViewBindings.findChildViewById(rootView, id);
      if (rvPopularMovie == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.tvDb;
      TextView tvDb = ViewBindings.findChildViewById(rootView, id);
      if (tvDb == null) {
        break missingId;
      }

      id = R.id.tvMovie;
      TextView tvMovie = ViewBindings.findChildViewById(rootView, id);
      if (tvMovie == null) {
        break missingId;
      }

      return new HomeFragmentBinding((ConstraintLayout) rootView, imageView, relativeLayout,
          rlImage, rvBanner, rvComingSoon, rvPopularMovie, textView4, textView5, tvDb, tvMovie);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}