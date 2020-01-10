package com.example.youtubeparcerbegginer.db;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.youtubeparcerbegginer.model.DetailPlaylistModel;
import com.example.youtubeparcerbegginer.model.ItemsItem;
import com.example.youtubeparcerbegginer.model.PageInfo;
import com.example.youtubeparcerbegginer.model.PlaylistModel;
import com.example.youtubeparcerbegginer.type_converters.PlaylistModelTypeConverter;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class YoutubeDao_Impl implements YoutubeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PlaylistModel> __insertionAdapterOfPlaylistModel;

  private final PlaylistModelTypeConverter __playlistModelTypeConverter = new PlaylistModelTypeConverter();

  private final EntityInsertionAdapter<DetailPlaylistModel> __insertionAdapterOfDetailPlaylistModel;

  public YoutubeDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPlaylistModel = new EntityInsertionAdapter<PlaylistModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `play_list` (`kind`,`pageInfo`,`etag`,`items`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PlaylistModel value) {
        if (value.getKind() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getKind());
        }
        final String _tmp;
        _tmp = __playlistModelTypeConverter.toPageInfo(value.getPageInfo());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        if (value.getEtag() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEtag());
        }
        final String _tmp_1;
        _tmp_1 = __playlistModelTypeConverter.toItemsItem(value.getItems());
        if (_tmp_1 == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp_1);
        }
      }
    };
    this.__insertionAdapterOfDetailPlaylistModel = new EntityInsertionAdapter<DetailPlaylistModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `detail_playlist` (`kind`,`pageInfo`,`etag`,`items`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DetailPlaylistModel value) {
        if (value.getKind() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getKind());
        }
        final String _tmp;
        _tmp = __playlistModelTypeConverter.toPageInfo(value.getPageInfo());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        if (value.getEtag() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEtag());
        }
        final String _tmp_1;
        _tmp_1 = __playlistModelTypeConverter.toItemsItem(value.getItems());
        if (_tmp_1 == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp_1);
        }
      }
    };
  }

  @Override
  public Object insertAllPlayList(final PlaylistModel items, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPlaylistModel.insert(items);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertDetailPlaylistData(final DetailPlaylistModel item,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfDetailPlaylistModel.insert(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getAllPlaylist(final Continuation<? super PlaylistModel> p0) {
    final String _sql = "SELECT * FROM play_list";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<PlaylistModel>() {
      @Override
      public PlaylistModel call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfKind = CursorUtil.getColumnIndexOrThrow(_cursor, "kind");
          final int _cursorIndexOfPageInfo = CursorUtil.getColumnIndexOrThrow(_cursor, "pageInfo");
          final int _cursorIndexOfEtag = CursorUtil.getColumnIndexOrThrow(_cursor, "etag");
          final int _cursorIndexOfItems = CursorUtil.getColumnIndexOrThrow(_cursor, "items");
          final PlaylistModel _result;
          if(_cursor.moveToFirst()) {
            final String _tmpKind;
            _tmpKind = _cursor.getString(_cursorIndexOfKind);
            final PageInfo _tmpPageInfo;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfPageInfo);
            _tmpPageInfo = __playlistModelTypeConverter.fromPageInfo(_tmp);
            final String _tmpEtag;
            _tmpEtag = _cursor.getString(_cursorIndexOfEtag);
            final List<ItemsItem> _tmpItems;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfItems);
            _tmpItems = __playlistModelTypeConverter.fromItemsItem(_tmp_1);
            _result = new PlaylistModel(_tmpKind,_tmpPageInfo,_tmpEtag,_tmpItems);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object fetchDetailPlaylist(final Continuation<? super List<DetailPlaylistModel>> p0) {
    final String _sql = "SELECT * FROM detail_playlist";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<DetailPlaylistModel>>() {
      @Override
      public List<DetailPlaylistModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfKind = CursorUtil.getColumnIndexOrThrow(_cursor, "kind");
          final int _cursorIndexOfPageInfo = CursorUtil.getColumnIndexOrThrow(_cursor, "pageInfo");
          final int _cursorIndexOfEtag = CursorUtil.getColumnIndexOrThrow(_cursor, "etag");
          final int _cursorIndexOfItems = CursorUtil.getColumnIndexOrThrow(_cursor, "items");
          final List<DetailPlaylistModel> _result = new ArrayList<DetailPlaylistModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DetailPlaylistModel _item;
            final String _tmpKind;
            _tmpKind = _cursor.getString(_cursorIndexOfKind);
            final PageInfo _tmpPageInfo;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfPageInfo);
            _tmpPageInfo = __playlistModelTypeConverter.fromPageInfo(_tmp);
            final String _tmpEtag;
            _tmpEtag = _cursor.getString(_cursorIndexOfEtag);
            final List<ItemsItem> _tmpItems;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfItems);
            _tmpItems = __playlistModelTypeConverter.fromItemsItem(_tmp_1);
            _item = new DetailPlaylistModel(_tmpKind,_tmpPageInfo,_tmpEtag,_tmpItems);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }
}
