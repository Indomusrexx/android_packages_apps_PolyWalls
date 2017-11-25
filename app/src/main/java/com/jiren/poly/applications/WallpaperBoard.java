package com.jiren.poly.applications;

import android.support.annotation.NonNull;

import com.dm.wallpaper.board.applications.WallpaperBoardApplication;
import com.dm.wallpaper.board.applications.WallpaperBoardConfiguration;

public class WallpaperBoard extends WallpaperBoardApplication {

    @NonNull
    @Override
    public WallpaperBoardConfiguration onInit() {
        WallpaperBoardConfiguration configuration = new WallpaperBoardConfiguration();

        configuration.setHighQualityPreviewEnabled(true);
        /* Add your configurations here
         */
        return configuration;
    }
}
