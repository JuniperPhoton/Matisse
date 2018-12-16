package com.zhihu.matisse.engine.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.zhihu.matisse.engine.ImageViewFactory;

/**
 * A default image view factory that create a simple {@link ImageView}.
 */
public class DefaultImageViewFactory implements ImageViewFactory<ImageView> {
    @Override
    public ImageView provideImageView(Context context, ViewGroup parent) {
        return new ImageView(context);
    }
}