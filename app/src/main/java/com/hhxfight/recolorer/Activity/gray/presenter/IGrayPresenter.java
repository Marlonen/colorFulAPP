package com.hhxfight.recolorer.Activity.gray.presenter;

import android.graphics.Bitmap;

/**
 * Created by HHX on 2017/5/3.
 */

public interface IGrayPresenter {
    void postImage(String path, int kNearest);
    void getGray(String gid);
    void saveGray(Bitmap bitmap);
}
