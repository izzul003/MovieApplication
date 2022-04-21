// Generated by Dagger (https://dagger.dev).
package com.example.mymoviewdb.repository;

import com.example.mymoviewdb.room.FavoriteDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FavoriteRepository_Factory implements Factory<FavoriteRepository> {
  private final Provider<FavoriteDao> mFavoritesDaoProvider;

  public FavoriteRepository_Factory(Provider<FavoriteDao> mFavoritesDaoProvider) {
    this.mFavoritesDaoProvider = mFavoritesDaoProvider;
  }

  @Override
  public FavoriteRepository get() {
    return newInstance(mFavoritesDaoProvider.get());
  }

  public static FavoriteRepository_Factory create(Provider<FavoriteDao> mFavoritesDaoProvider) {
    return new FavoriteRepository_Factory(mFavoritesDaoProvider);
  }

  public static FavoriteRepository newInstance(FavoriteDao mFavoritesDao) {
    return new FavoriteRepository(mFavoritesDao);
  }
}
