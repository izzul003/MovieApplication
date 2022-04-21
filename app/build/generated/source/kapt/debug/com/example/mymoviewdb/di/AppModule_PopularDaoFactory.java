// Generated by Dagger (https://dagger.dev).
package com.example.mymoviewdb.di;

import com.example.mymoviewdb.room.MyMoviesRoomDatabase;
import com.example.mymoviewdb.room.PopularDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_PopularDaoFactory implements Factory<PopularDao> {
  private final Provider<MyMoviesRoomDatabase> dbProvider;

  public AppModule_PopularDaoFactory(Provider<MyMoviesRoomDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public PopularDao get() {
    return popularDao(dbProvider.get());
  }

  public static AppModule_PopularDaoFactory create(Provider<MyMoviesRoomDatabase> dbProvider) {
    return new AppModule_PopularDaoFactory(dbProvider);
  }

  public static PopularDao popularDao(MyMoviesRoomDatabase db) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.popularDao(db));
  }
}