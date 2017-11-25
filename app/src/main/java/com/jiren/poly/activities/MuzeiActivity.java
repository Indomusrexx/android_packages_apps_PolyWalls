package com.jiren.poly.activities;

import android.support.annotation.NonNull;

import com.dm.wallpaper.board.activities.WallpaperBoardMuzeiActivity;
import com.jiren.poly.services.MuzeiService;

public class MuzeiActivity extends WallpaperBoardMuzeiActivity {

    @NonNull
    @Override
    public Class<?> onInit() {
        return MuzeiService.class;
    }
}
