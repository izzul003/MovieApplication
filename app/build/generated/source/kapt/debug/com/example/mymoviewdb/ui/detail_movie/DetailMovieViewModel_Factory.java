// Generated by Dagger (https://dagger.dev).
package com.example.mymoviewdb.ui.detail_movie;

import com.example.mymoviewdb.repository.FavoriteRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DetailMovieViewModel_Factory implements Factory<DetailMovieViewModel> {
  private final Provider<FavoriteRepository> mFavoriteRepositoryProvider;

  public DetailMovieViewModel_Factory(Provider<FavoriteRepository> mFavoriteRepositoryProvider) {
    this.mFavoriteRepositoryProvider = mFavoriteRepositoryProvider;
  }

  @Override
  public DetailMovieViewModel get() {
    return newInstance(mFavoriteRepositoryProvider.get());
  }

  public static DetailMovieViewModel_Factory create(
      Provider<FavoriteRepository> mFavoriteRepositoryProvider) {
    return new DetailMovieViewModel_Factory(mFavoriteRepositoryProvider);
  }

  public static DetailMovieViewModel newInstance(FavoriteRepository mFavoriteRepository) {
    return new DetailMovieViewModel(mFavoriteRepository);
  }
}