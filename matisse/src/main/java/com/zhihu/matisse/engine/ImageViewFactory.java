package com.zhihu.matisse.engine;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/**
 * Image view factory interface. There are predefined {@link com.zhihu.matisse.engine.impl.DefaultImageViewFactory},
 * and {@link com.zhihu.matisse.engine.impl.FrescoImageViewFactory}.
 */
public interface ImageViewFactory<T extends View> {
    T provideImageView(Context context, ViewGroup parent);
}
