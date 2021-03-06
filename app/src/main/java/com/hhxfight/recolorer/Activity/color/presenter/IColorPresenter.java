package com.hhxfight.recolorer.Activity.color.presenter;

import android.graphics.Bitmap;

/**
 * Created by HHX on 2017/5/17.
 */

public interface IColorPresenter {
    void postImage(String path);
    void postTempleteImage(String path);
    void doColoredTransform(int templateSource);
    void getColorTransformedImage(String rid);
    void saveColor(Bitmap bitmap);
}
