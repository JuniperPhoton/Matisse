package com.zhihu.matisse.engine.impl;

import android.content.Context;
import android.view.ViewGroup;

import com.facebook.drawee.view.SimpleDraweeView;
import com.zhihu.matisse.engine.ImageViewFactory;

/**
 * An image view factory that create a {@link SimpleDraweeView}.
 */
public class FrescoImageViewFactory implements ImageViewFactory<SimpleDraweeView> {
    @Override
    public SimpleDraweeView provideImageView(Context context, ViewGroup parent) {
        return new SimpleDraweeView(context);
    }
}
