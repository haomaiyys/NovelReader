package com.example.newbiechen.ireader.model.gen;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.SqlUtils;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.newbiechen.ireader.model.bean.BookHelpfulBean;
import com.example.newbiechen.ireader.model.bean.ReviewBookBean;

import com.example.newbiechen.ireader.model.bean.BookReviewBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BOOK_REVIEW_BEAN".
*/
public class BookReviewBeanDao extends AbstractDao<BookReviewBean, String> {

    public static final String TABLENAME = "BOOK_REVIEW_BEAN";

    /**
     * Properties of entity BookReviewBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property _id = new Property(0, String.class, "_id", true, "_ID");
        public final static Property BookId = new Property(1, String.class, "bookId", false, "BOOK_ID");
        public final static Property Title = new Property(2, String.class, "title", false, "TITLE");
        public final static Property LikeCount = new Property(3, int.class, "likeCount", false, "LIKE_COUNT");
        public final static Property HaveImage = new Property(4, boolean.class, "haveImage", false, "HAVE_IMAGE");
        public final static Property State = new Property(5, String.class, "state", false, "STATE");
        public final static Property Updated = new Property(6, String.class, "updated", false, "UPDATED");
        public final static Property Created = new Property(7, String.class, "created", false, "CREATED");
    }

    private DaoSession daoSession;


    public BookReviewBeanDao(DaoConfig config) {
        super(config);
    }
    
    public BookReviewBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BOOK_REVIEW_BEAN\" (" + //
                "\"_ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: _id
                "\"BOOK_ID\" TEXT," + // 1: bookId
                "\"TITLE\" TEXT," + // 2: title
                "\"LIKE_COUNT\" INTEGER NOT NULL ," + // 3: likeCount
                "\"HAVE_IMAGE\" INTEGER NOT NULL ," + // 4: haveImage
                "\"STATE\" TEXT," + // 5: state
                "\"UPDATED\" TEXT," + // 6: updated
                "\"CREATED\" TEXT);"); // 7: created
        // Add Indexes
        db.execSQL("CREATE INDEX " + constraint + "IDX_BOOK_REVIEW_BEAN_STATE ON BOOK_REVIEW_BEAN" +
                " (\"STATE\" ASC);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BOOK_REVIEW_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BookReviewBean entity) {
        stmt.clearBindings();
 
        String _id = entity.get_id();
        if (_id != null) {
            stmt.bindString(1, _id);
        }
 
        String bookId = entity.getBookId();
        if (bookId != null) {
            stmt.bindString(2, bookId);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
        stmt.bindLong(4, entity.getLikeCount());
        stmt.bindLong(5, entity.getHaveImage() ? 1L: 0L);
 
        String state = entity.getState();
        if (state != null) {
            stmt.bindString(6, state);
        }
 
        String updated = entity.getUpdated();
        if (updated != null) {
            stmt.bindString(7, updated);
        }
 
        String created = entity.getCreated();
        if (created != null) {
            stmt.bindString(8, created);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BookReviewBean entity) {
        stmt.clearBindings();
 
        String _id = entity.get_id();
        if (_id != null) {
            stmt.bindString(1, _id);
        }
 
        String bookId = entity.getBookId();
        if (bookId != null) {
            stmt.bindString(2, bookId);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
        stmt.bindLong(4, entity.getLikeCount());
        stmt.bindLong(5, entity.getHaveImage() ? 1L: 0L);
 
        String state = entity.getState();
        if (state != null) {
            stmt.bindString(6, state);
        }
 
        String updated = entity.getUpdated();
        if (updated != null) {
            stmt.bindString(7, updated);
        }
 
        String created = entity.getCreated();
        if (created != null) {
            stmt.bindString(8, created);
        }
    }

    @Override
    protected final void attachEntity(BookReviewBean entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public BookReviewBean readEntity(Cursor cursor, int offset) {
        BookReviewBean entity = new BookReviewBean( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // _id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // bookId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // title
            cursor.getInt(offset + 3), // likeCount
            cursor.getShort(offset + 4) != 0, // haveImage
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // state
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // updated
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7) // created
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BookReviewBean entity, int offset) {
        entity.set_id(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setBookId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTitle(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setLikeCount(cursor.getInt(offset + 3));
        entity.setHaveImage(cursor.getShort(offset + 4) != 0);
        entity.setState(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setUpdated(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setCreated(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
     }
    
    @Override
    protected final String updateKeyAfterInsert(BookReviewBean entity, long rowId) {
        return entity.get_id();
    }
    
    @Override
    public String getKey(BookReviewBean entity) {
        if(entity != null) {
            return entity.get_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(BookReviewBean entity) {
        return entity.get_id() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getReviewBookBeanDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T1", daoSession.getBookHelpfulBeanDao().getAllColumns());
            builder.append(" FROM BOOK_REVIEW_BEAN T");
            builder.append(" LEFT JOIN REVIEW_BOOK_BEAN T0 ON T.\"BOOK_ID\"=T0.\"_ID\"");
            builder.append(" LEFT JOIN BOOK_HELPFUL_BEAN T1 ON T.\"_ID\"=T1.\"_ID\"");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected BookReviewBean loadCurrentDeep(Cursor cursor, boolean lock) {
        BookReviewBean entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        ReviewBookBean book = loadCurrentOther(daoSession.getReviewBookBeanDao(), cursor, offset);
        entity.setBook(book);
        offset += daoSession.getReviewBookBeanDao().getAllColumns().length;

        BookHelpfulBean helpful = loadCurrentOther(daoSession.getBookHelpfulBeanDao(), cursor, offset);
        entity.setHelpful(helpful);

        return entity;    
    }

    public BookReviewBean loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<BookReviewBean> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<BookReviewBean> list = new ArrayList<BookReviewBean>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<BookReviewBean> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<BookReviewBean> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}
