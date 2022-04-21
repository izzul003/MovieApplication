package com.example.mymoviewdb.room;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PopularDao_Impl implements PopularDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Popular> __insertionAdapterOfPopular;

  private final EntityDeletionOrUpdateAdapter<Popular> __deletionAdapterOfPopular;

  private final EntityDeletionOrUpdateAdapter<Popular> __updateAdapterOfPopular;

  public PopularDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPopular = new EntityInsertionAdapter<Popular>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Popular` (`id`,`title`,`adult`,`backdrop_path`,`genre_ids`,`original_language`,`original_title`,`overview`,`popularity`,`poster_path`,`release_date`,`video`,`vote_average`,`vote_count`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Popular value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        final Integer _tmp;
        _tmp = value.getAdult() == null ? null : (value.getAdult() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, _tmp);
        }
        if (value.getBackdrop_path() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBackdrop_path());
        }
        if (value.getGenre_ids() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getGenre_ids());
        }
        if (value.getOriginal_language() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getOriginal_language());
        }
        if (value.getOriginal_title() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getOriginal_title());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getOverview());
        }
        if (value.getPopularity() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindDouble(9, value.getPopularity());
        }
        if (value.getPoster_path() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getPoster_path());
        }
        if (value.getRelease_date() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getRelease_date());
        }
        final Integer _tmp_1;
        _tmp_1 = value.getVideo() == null ? null : (value.getVideo() ? 1 : 0);
        if (_tmp_1 == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindLong(12, _tmp_1);
        }
        if (value.getVote_average() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindDouble(13, value.getVote_average());
        }
        if (value.getVote_count() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindLong(14, value.getVote_count());
        }
      }
    };
    this.__deletionAdapterOfPopular = new EntityDeletionOrUpdateAdapter<Popular>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Popular` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Popular value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfPopular = new EntityDeletionOrUpdateAdapter<Popular>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Popular` SET `id` = ?,`title` = ?,`adult` = ?,`backdrop_path` = ?,`genre_ids` = ?,`original_language` = ?,`original_title` = ?,`overview` = ?,`popularity` = ?,`poster_path` = ?,`release_date` = ?,`video` = ?,`vote_average` = ?,`vote_count` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Popular value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        final Integer _tmp;
        _tmp = value.getAdult() == null ? null : (value.getAdult() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, _tmp);
        }
        if (value.getBackdrop_path() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBackdrop_path());
        }
        if (value.getGenre_ids() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getGenre_ids());
        }
        if (value.getOriginal_language() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getOriginal_language());
        }
        if (value.getOriginal_title() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getOriginal_title());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getOverview());
        }
        if (value.getPopularity() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindDouble(9, value.getPopularity());
        }
        if (value.getPoster_path() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getPoster_path());
        }
        if (value.getRelease_date() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getRelease_date());
        }
        final Integer _tmp_1;
        _tmp_1 = value.getVideo() == null ? null : (value.getVideo() ? 1 : 0);
        if (_tmp_1 == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindLong(12, _tmp_1);
        }
        if (value.getVote_average() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindDouble(13, value.getVote_average());
        }
        if (value.getVote_count() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindLong(14, value.getVote_count());
        }
        stmt.bindLong(15, value.getId());
      }
    };
  }

  @Override
  public void insert(final Popular popular) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPopular.insert(popular);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Popular popular) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfPopular.handle(popular);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Popular popular) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfPopular.handle(popular);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<Popular>> getAllPopulars() {
    final String _sql = "SELECT * from popular ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"popular"}, false, new Callable<List<Popular>>() {
      @Override
      public List<Popular> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfAdult = CursorUtil.getColumnIndexOrThrow(_cursor, "adult");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
          final int _cursorIndexOfGenreIds = CursorUtil.getColumnIndexOrThrow(_cursor, "genre_ids");
          final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "original_language");
          final int _cursorIndexOfOriginalTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "original_title");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
          final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "video");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_count");
          final List<Popular> _result = new ArrayList<Popular>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Popular _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final Boolean _tmpAdult;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfAdult)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfAdult);
            }
            _tmpAdult = _tmp == null ? null : _tmp != 0;
            final String _tmpBackdrop_path;
            if (_cursor.isNull(_cursorIndexOfBackdropPath)) {
              _tmpBackdrop_path = null;
            } else {
              _tmpBackdrop_path = _cursor.getString(_cursorIndexOfBackdropPath);
            }
            final String _tmpGenre_ids;
            if (_cursor.isNull(_cursorIndexOfGenreIds)) {
              _tmpGenre_ids = null;
            } else {
              _tmpGenre_ids = _cursor.getString(_cursorIndexOfGenreIds);
            }
            final String _tmpOriginal_language;
            if (_cursor.isNull(_cursorIndexOfOriginalLanguage)) {
              _tmpOriginal_language = null;
            } else {
              _tmpOriginal_language = _cursor.getString(_cursorIndexOfOriginalLanguage);
            }
            final String _tmpOriginal_title;
            if (_cursor.isNull(_cursorIndexOfOriginalTitle)) {
              _tmpOriginal_title = null;
            } else {
              _tmpOriginal_title = _cursor.getString(_cursorIndexOfOriginalTitle);
            }
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final Double _tmpPopularity;
            if (_cursor.isNull(_cursorIndexOfPopularity)) {
              _tmpPopularity = null;
            } else {
              _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            }
            final String _tmpPoster_path;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPoster_path = null;
            } else {
              _tmpPoster_path = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final String _tmpRelease_date;
            if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
              _tmpRelease_date = null;
            } else {
              _tmpRelease_date = _cursor.getString(_cursorIndexOfReleaseDate);
            }
            final Boolean _tmpVideo;
            final Integer _tmp_1;
            if (_cursor.isNull(_cursorIndexOfVideo)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getInt(_cursorIndexOfVideo);
            }
            _tmpVideo = _tmp_1 == null ? null : _tmp_1 != 0;
            final Double _tmpVote_average;
            if (_cursor.isNull(_cursorIndexOfVoteAverage)) {
              _tmpVote_average = null;
            } else {
              _tmpVote_average = _cursor.getDouble(_cursorIndexOfVoteAverage);
            }
            final Integer _tmpVote_count;
            if (_cursor.isNull(_cursorIndexOfVoteCount)) {
              _tmpVote_count = null;
            } else {
              _tmpVote_count = _cursor.getInt(_cursorIndexOfVoteCount);
            }
            _item = new Popular(_tmpId,_tmpTitle,_tmpAdult,_tmpBackdrop_path,_tmpGenre_ids,_tmpOriginal_language,_tmpOriginal_title,_tmpOverview,_tmpPopularity,_tmpPoster_path,_tmpRelease_date,_tmpVideo,_tmpVote_average,_tmpVote_count);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<Popular>> searchPopulars(final String query) {
    final String _sql = "SELECT * FROM popular WHERE title LIKE '%' || ? || '%'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"popular"}, false, new Callable<List<Popular>>() {
      @Override
      public List<Popular> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfAdult = CursorUtil.getColumnIndexOrThrow(_cursor, "adult");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
          final int _cursorIndexOfGenreIds = CursorUtil.getColumnIndexOrThrow(_cursor, "genre_ids");
          final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "original_language");
          final int _cursorIndexOfOriginalTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "original_title");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
          final int _cursorIndexOfVideo = CursorUtil.getColumnIndexOrThrow(_cursor, "video");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_count");
          final List<Popular> _result = new ArrayList<Popular>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Popular _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final Boolean _tmpAdult;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfAdult)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfAdult);
            }
            _tmpAdult = _tmp == null ? null : _tmp != 0;
            final String _tmpBackdrop_path;
            if (_cursor.isNull(_cursorIndexOfBackdropPath)) {
              _tmpBackdrop_path = null;
            } else {
              _tmpBackdrop_path = _cursor.getString(_cursorIndexOfBackdropPath);
            }
            final String _tmpGenre_ids;
            if (_cursor.isNull(_cursorIndexOfGenreIds)) {
              _tmpGenre_ids = null;
            } else {
              _tmpGenre_ids = _cursor.getString(_cursorIndexOfGenreIds);
            }
            final String _tmpOriginal_language;
            if (_cursor.isNull(_cursorIndexOfOriginalLanguage)) {
              _tmpOriginal_language = null;
            } else {
              _tmpOriginal_language = _cursor.getString(_cursorIndexOfOriginalLanguage);
            }
            final String _tmpOriginal_title;
            if (_cursor.isNull(_cursorIndexOfOriginalTitle)) {
              _tmpOriginal_title = null;
            } else {
              _tmpOriginal_title = _cursor.getString(_cursorIndexOfOriginalTitle);
            }
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final Double _tmpPopularity;
            if (_cursor.isNull(_cursorIndexOfPopularity)) {
              _tmpPopularity = null;
            } else {
              _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            }
            final String _tmpPoster_path;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPoster_path = null;
            } else {
              _tmpPoster_path = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final String _tmpRelease_date;
            if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
              _tmpRelease_date = null;
            } else {
              _tmpRelease_date = _cursor.getString(_cursorIndexOfReleaseDate);
            }
            final Boolean _tmpVideo;
            final Integer _tmp_1;
            if (_cursor.isNull(_cursorIndexOfVideo)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getInt(_cursorIndexOfVideo);
            }
            _tmpVideo = _tmp_1 == null ? null : _tmp_1 != 0;
            final Double _tmpVote_average;
            if (_cursor.isNull(_cursorIndexOfVoteAverage)) {
              _tmpVote_average = null;
            } else {
              _tmpVote_average = _cursor.getDouble(_cursorIndexOfVoteAverage);
            }
            final Integer _tmpVote_count;
            if (_cursor.isNull(_cursorIndexOfVoteCount)) {
              _tmpVote_count = null;
            } else {
              _tmpVote_count = _cursor.getInt(_cursorIndexOfVoteCount);
            }
            _item = new Popular(_tmpId,_tmpTitle,_tmpAdult,_tmpBackdrop_path,_tmpGenre_ids,_tmpOriginal_language,_tmpOriginal_title,_tmpOverview,_tmpPopularity,_tmpPoster_path,_tmpRelease_date,_tmpVideo,_tmpVote_average,_tmpVote_count);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
