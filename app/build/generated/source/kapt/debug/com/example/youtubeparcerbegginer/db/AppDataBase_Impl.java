package com.example.youtubeparcerbegginer.db;

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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDataBase_Impl extends AppDataBase {
  private volatile YoutubeDao _youtubeDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `play_list` (`kind` TEXT NOT NULL, `pageInfo` TEXT NOT NULL, `etag` TEXT NOT NULL, `items` TEXT NOT NULL, PRIMARY KEY(`etag`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `detail_playlist` (`kind` TEXT NOT NULL, `pageInfo` TEXT NOT NULL, `etag` TEXT NOT NULL, `items` TEXT NOT NULL, PRIMARY KEY(`kind`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ad504d1a3a143b0aa13afc5d73a3c035')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `play_list`");
        _db.execSQL("DROP TABLE IF EXISTS `detail_playlist`");
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
        final HashMap<String, TableInfo.Column> _columnsPlayList = new HashMap<String, TableInfo.Column>(4);
        _columnsPlayList.put("kind", new TableInfo.Column("kind", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlayList.put("pageInfo", new TableInfo.Column("pageInfo", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlayList.put("etag", new TableInfo.Column("etag", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPlayList.put("items", new TableInfo.Column("items", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPlayList = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPlayList = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPlayList = new TableInfo("play_list", _columnsPlayList, _foreignKeysPlayList, _indicesPlayList);
        final TableInfo _existingPlayList = TableInfo.read(_db, "play_list");
        if (! _infoPlayList.equals(_existingPlayList)) {
          return new RoomOpenHelper.ValidationResult(false, "play_list(com.example.youtubeparcerbegginer.model.PlaylistModel).\n"
                  + " Expected:\n" + _infoPlayList + "\n"
                  + " Found:\n" + _existingPlayList);
        }
        final HashMap<String, TableInfo.Column> _columnsDetailPlaylist = new HashMap<String, TableInfo.Column>(4);
        _columnsDetailPlaylist.put("kind", new TableInfo.Column("kind", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDetailPlaylist.put("pageInfo", new TableInfo.Column("pageInfo", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDetailPlaylist.put("etag", new TableInfo.Column("etag", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDetailPlaylist.put("items", new TableInfo.Column("items", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDetailPlaylist = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDetailPlaylist = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDetailPlaylist = new TableInfo("detail_playlist", _columnsDetailPlaylist, _foreignKeysDetailPlaylist, _indicesDetailPlaylist);
        final TableInfo _existingDetailPlaylist = TableInfo.read(_db, "detail_playlist");
        if (! _infoDetailPlaylist.equals(_existingDetailPlaylist)) {
          return new RoomOpenHelper.ValidationResult(false, "detail_playlist(com.example.youtubeparcerbegginer.model.DetailPlaylistModel).\n"
                  + " Expected:\n" + _infoDetailPlaylist + "\n"
                  + " Found:\n" + _existingDetailPlaylist);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "ad504d1a3a143b0aa13afc5d73a3c035", "9743622a970a310a9a0029daaafb1f88");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "play_list","detail_playlist");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `play_list`");
      _db.execSQL("DELETE FROM `detail_playlist`");
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
  public YoutubeDao ytVideoDao() {
    if (_youtubeDao != null) {
      return _youtubeDao;
    } else {
      synchronized(this) {
        if(_youtubeDao == null) {
          _youtubeDao = new YoutubeDao_Impl(this);
        }
        return _youtubeDao;
      }
    }
  }
}
