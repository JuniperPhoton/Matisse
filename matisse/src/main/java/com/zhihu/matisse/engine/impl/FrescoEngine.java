package com.zhihu.matisse.engine.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.zhihu.matisse.engine.ImageEngine;
import com.zhihu.matisse.engine.ImageViewFactory;

/**
 * {@link ImageEngine} implementation using Fresco.
 */
public class FrescoEngine implements ImageEngine<SimpleDraweeView> {
    @Override
    public ImageViewFactory<SimpleDraweeView> provideImageViewFactory(Context context) {
        return new FrescoImageViewFactory();
    }

    @Override
    public void loadThumbnail(Context context, int resize, Drawable placeholder, SimpleDraweeView imageView, Uri uri) {
        loadThumbnail(imageView, resize, placeholder, uri);
    }

    @Override
    public void loadGifThumbnail(Context context, int resize, Drawable placeholder, SimpleDraweeView imageView, Uri uri) {
        loadThumbnail(imageView, resize, placeholder, uri);
    }

    @Override
    public void loadImage(Context context, int resizeX, int resizeY, SimpleDraweeView imageView, Uri uri) {
        loadThumbnail(imageView, -1, null, uri);
    }

    @Override
    public void loadGifImage(Context context, int resizeX, int resizeY, SimpleDraweeView imageView, Uri uri) {
        loadThumbnail(imageView, -1, null, uri);
    }

    @Override
    public boolean supportAnimatedGif() {
        return true;
    }

    private void loadThumbnail(SimpleDraweeView imageView, int resize, Drawable drawable, Uri uri) {
        ImageRequestBuilder builder = ImageRequestBuilder.newBuilderWithSource(uri);
        if (resize > 0) {
            builder.setResizeOptions(ResizeOptions.forDimensions(resize, resize));
        }
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setOldController(imageView.getController())
                .setAutoPlayAnimations(true)
                .setImageRequest(builder.build())
                .build();
        imageView.getHierarchy().setPlaceholderImage(drawable);
        imageView.setController(controller);
    }
}
