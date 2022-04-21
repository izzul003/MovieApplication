package com.example.mymoviewdb.room;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MyMoviesRoomDatabase_Impl extends MyMoviesRoomDatabase {
  private volatile FavoriteDao _favoriteDao;

  private volatile PopularDao _popularDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Favorite` (`id` INTEGER NOT NULL, `title` TEXT, `adult` INTEGER, `backdrop_path` TEXT, `genre_ids` TEXT, `original_language` TEXT, `original_title` TEXT, `overview` TEXT, `popularity` REAL, `poster_path` TEXT, `release_date` TEXT, `video` INTEGER, `vote_average` REAL, `vote_count` INTEGER, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Popular` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT, `adult` INTEGER, `backdrop_path` TEXT, `genre_ids` TEXT, `original_language` TEXT, `original_title` TEXT, `overview` TEXT, `popularity` REAL, `poster_path` TEXT, `release_date` TEXT, `video` INTEGER, `vote_average` REAL, `vote_count` INTEGER)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '82d6a66567a7ba7cefc779f623571cf3')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Favorite`");
        _db.execSQL("DROP TABLE IF EXISTS `Popular`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsFavorite = new HashMap<String, TableInfo.Column>(14);
        _columnsFavorite.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("adult", new TableInfo.Column("adult", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("backdrop_path", new TableInfo.Column("backdrop_path", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("genre_ids", new TableInfo.Column("genre_ids", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("original_language", new TableInfo.Column("original_language", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("original_title", new TableInfo.Column("original_title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("overview", new TableInfo.Column("overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("popularity", new TableInfo.Column("popularity", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("poster_path", new TableInfo.Column("poster_path", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("release_date", new TableInfo.Column("release_date", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("video", new TableInfo.Column("video", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("vote_average", new TableInfo.Column("vote_average", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavorite.put("vote_count", new TableInfo.Column("vote_count", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFavorite = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFavorite = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFavorite = new TableInfo("Favorite", _columnsFavorite, _foreignKeysFavorite, _indicesFavorite);
        final TableInfo _existingFavorite = TableInfo.read(_db, "Favorite");
        if (! _infoFavorite.equals(_existingFavorite)) {
          return new RoomOpenHelper.ValidationResult(false, "Favorite(com.example.mymoviewdb.room.Favorite).\n"
                  + " Expected:\n" + _infoFavorite + "\n"
                  + " Found:\n" + _existingFavorite);
        }
        final HashMap<String, TableInfo.Column> _columnsPopular = new HashMap<String, TableInfo.Column>(14);
        _columnsPopular.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPopular.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPopular.put("adult", new TableInfo.Column("adult", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPopular.put("backdrop_path", new TableInfo.Column("backdrop_path", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPopular.put("genre_ids", new TableInfo.Column("genre_ids", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPopular.put("original_language", new TableInfo.Column("original_language", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPopular.put("original_title", new TableInfo.Column("original_title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPopular.put("overview", new TableInfo.Column("overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPopular.put("popularity", new TableInfo.Column("popularity", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPopular.put("poster_path", new TableInfo.Column("poster_path", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPopular.put("release_date", new TableInfo.Column("release_date", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPopular.put("video", new TableInfo.Column("video", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPopular.put("vote_average", new TableInfo.Column("vote_average", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPopular.put("vote_count", new TableInfo.Column("vote_count", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPopular = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPopular = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPopular = new TableInfo("Popular", _columnsPopular, _foreignKeysPopular, _indicesPopular);
        final TableInfo _existingPopular = TableInfo.read(_db, "Popular");
        if (! _infoPopular.equals(_existingPopular)) {
          return new RoomOpenHelper.ValidationResult(false, "Popular(com.example.mymoviewdb.room.Popular).\n"
                  + " Expected:\n" + _infoPopular + "\n"
                  + " Found:\n" + _existingPopular);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "82d6a66567a7ba7cefc779f623571cf3", "163d74ff4e059eebd77343bc30b1f2da");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Favorite","Popular");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Favorite`");
      _db.execSQL("DELETE FROM `Popular`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(FavoriteDao.class, FavoriteDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(PopularDao.class, PopularDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public FavoriteDao favoriteDao() {
    if (_favoriteDao != null) {
      return _favoriteDao;
    } else {
      synchronized(this) {
        if(_favoriteDao == null) {
          _favoriteDao = new FavoriteDao_Impl(this);
        }
        return _favoriteDao;
      }
    }
  }

  @Override
  public PopularDao popularDao() {
    if (_popularDao != null) {
      return _popularDao;
    } else {
      synchronized(this) {
        if(_popularDao == null) {
          _popularDao = new PopularDao_Impl(this);
        }
        return _popularDao;
      }
    }
  }
}
