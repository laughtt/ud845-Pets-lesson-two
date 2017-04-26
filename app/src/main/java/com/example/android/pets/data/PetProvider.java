package com.example.android.pets.data;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.Nullable;

/**
 * Created by jose on 12/19/2016.
 */


public class PetProvider extends ContentProvider{


    private static final int PET = 100;

    private static final int PET_ID = 101;


    private static final UriMatcher sUriMatcher = new UriMatcher(UriMatcher.NO_MATCH) ;

    static {

        sUriMatcher.addURI(PetContract.CONTENT_AUTORITY , PetContract.CONTENT_AUTORITY , PET );
        sUriMatcher.addURI(PetContract.CONTENT_AUTORITY , PetContract.CONTENT_AUTORITY + "/#" , PET_ID );




    }













    private PetDbHelper mDbHelper ;

    @Override
    public boolean onCreate() {
        mDbHelper = new PetDbHelper(getContext()) ;
        return false;
    }

    @Nullable
    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        return null;
    }

    @Nullable
    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(Uri uri, ContentValues values) {
        return null;
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        return 0;
    }
}
