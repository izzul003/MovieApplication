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
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mymoviewdb.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetailMovieBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final ImageView btnBack;

  @NonNull
  public final MaterialButton btnFavorite;

  @NonNull
  public final MaterialButton btnWatchMovie;

  @NonNull
  public final ImageView ivBannerDetail;

  @NonNull
  public final RelativeLayout relativeLayout3;

  @NonNull
  public final RelativeLayout rlImageDetail;

  @NonNull
  public final RecyclerView rvCasts;

  @NonNull
  public final RecyclerView rvGenres;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView tvHoursMovieDetail;

  @NonNull
  public final TextView tvMinutesMovieDetail;

  @NonNull
  public final TextView tvOverview;

  @NonNull
  public final TextView tvTitleBannerDetail;

  private ActivityDetailMovieBinding(@NonNull NestedScrollView rootView, @NonNull ImageView btnBack,
      @NonNull MaterialButton btnFavorite, @NonNull MaterialButton btnWatchMovie,
      @NonNull ImageView ivBannerDetail, @NonNull RelativeLayout relativeLayout3,
      @NonNull RelativeLayout rlImageDetail, @NonNull RecyclerView rvCasts,
      @NonNull RecyclerView rvGenres, @NonNull TextView textView, @NonNull TextView textView5,
      @NonNull TextView tvHoursMovieDetail, @NonNull TextView tvMinutesMovieDetail,
      @NonNull TextView tvOverview, @NonNull TextView tvTitleBannerDetail) {
    this.rootView = rootView;
    this.btnBack = btnBack;
    this.btnFavorite = btnFavorite;
    this.btnWatchMovie = btnWatchMovie;
    this.ivBannerDetail = ivBannerDetail;
    this.relativeLayout3 = relativeLayout3;
    this.rlImageDetail = rlImageDetail;
    this.rvCasts = rvCasts;
    this.rvGenres = rvGenres;
    this.textView = textView;
    this.textView5 = textView5;
    this.tvHoursMovieDetail = tvHoursMovieDetail;
    this.tvMinutesMovieDetail = tvMinutesMovieDetail;
    this.tvOverview = tvOverview;
    this.tvTitleBannerDetail = tvTitleBannerDetail;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailMovieBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailMovieBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detail_movie, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailMovieBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnBack;
      ImageView btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btnFavorite;
      MaterialButton btnFavorite = ViewBindings.findChildViewById(rootView, id);
      if (btnFavorite == null) {
        break missingId;
      }

      id = R.id.btnWatchMovie;
      MaterialButton btnWatchMovie = ViewBindings.findChildViewById(rootView, id);
      if (btnWatchMovie == null) {
        break missingId;
      }

      id = R.id.ivBannerDetail;
      ImageView ivBannerDetail = ViewBindings.findChildViewById(rootView, id);
      if (ivBannerDetail == null) {
        break missingId;
      }

      id = R.id.relativeLayout3;
      RelativeLayout relativeLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (relativeLayout3 == null) {
        break missingId;
      }

      id = R.id.rlImageDetail;
      RelativeLayout rlImageDetail = ViewBindings.findChildViewById(rootView, id);
      if (rlImageDetail == null) {
        break missingId;
      }

      id = R.id.rvCasts;
      RecyclerView rvCasts = ViewBindings.findChildViewById(rootView, id);
      if (rvCasts == null) {
        break missingId;
      }

      id = R.id.rvGenres;
      RecyclerView rvGenres = ViewBindings.findChildViewById(rootView, id);
      if (rvGenres == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.tvHoursMovieDetail;
      TextView tvHoursMovieDetail = ViewBindings.findChildViewById(rootView, id);
      if (tvHoursMovieDetail == null) {
        break missingId;
      }

      id = R.id.tvMinutesMovieDetail;
      TextView tvMinutesMovieDetail = ViewBindings.findChildViewById(rootView, id);
      if (tvMinutesMovieDetail == null) {
        break missingId;
      }

      id = R.id.tvOverview;
      TextView tvOverview = ViewBindings.findChildViewById(rootView, id);
      if (tvOverview == null) {
        break missingId;
      }

      id = R.id.tvTitleBannerDetail;
      TextView tvTitleBannerDetail = ViewBindings.findChildViewById(rootView, id);
      if (tvTitleBannerDetail == null) {
        break missingId;
      }

      return new ActivityDetailMovieBinding((NestedScrollView) rootView, btnBack, btnFavorite,
          btnWatchMovie, ivBannerDetail, relativeLayout3, rlImageDetail, rvCasts, rvGenres,
          textView, textView5, tvHoursMovieDetail, tvMinutesMovieDetail, tvOverview,
          tvTitleBannerDetail);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}