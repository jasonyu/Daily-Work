package com.sleticalboy.greendao;

import android.content.ContextWrapper;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;

import java.io.File;

/**
 * Created on 18-3-2.
 *
 * @author sleticalboy
 * @version 1.0
 * @description 基于 GreenDao 框架自定义数据库路径
 */
public class GreenDaoContext extends ContextWrapper {

    private final String mDBPath;

    public GreenDaoContext(String dbPath) {
        super(App.getContext());
        mDBPath = dbPath;
    }

    @Override
    public File getDatabasePath(String name) {
        return super.getDatabasePath(mDBPath);
    }

    @Override
    public SQLiteDatabase openOrCreateDatabase(String name, int mode,
                                               SQLiteDatabase.CursorFactory factory) {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(name), factory);
    }

    @Override
    public SQLiteDatabase openOrCreateDatabase(String name, int mode,
                                               SQLiteDatabase.CursorFactory factory,
                                               DatabaseErrorHandler errorHandler) {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(name), factory);
    }
}
