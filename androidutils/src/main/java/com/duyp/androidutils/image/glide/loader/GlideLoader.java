package com.duyp.androidutils.image.glide.loader;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.duyp.androidutils.functions.PlainConsumer;
import com.duyp.androidutils.image.glide.GlideOnCompleteListener;

import java.io.File;

/**
 * Created by duypham on 9/9/17.
 * Glide loader interface
 */

public interface GlideLoader {
    /**
     * Load image source into an image view
     * @param source image source (eg. url, file, uri...)
     * @param imageView target image view
     * @param <T> type of source (eg. {@link String}, {@link File}, {@link android.net.Uri} ...)
     */
    <T> void loadImage(T source, ImageView imageView);


    /**
     * Load image source into an image view with complete consumer
     * @param source image source (eg. url, file, uri...)
     * @param imageView target image view
     * @param completeConsumer consume complete listener, true if success
     * @param <T> type of source (eg. {@link String}, {@link File}, {@link android.net.Uri} ...)
     */
    <T> void loadImage(T source, ImageView imageView, PlainConsumer<Boolean> completeConsumer);

    /**
     * Load image source into an image view with complete consumer
     * @param source image source (eg. url, file, uri...)
     * @param imageView target image view
     * @param thumbnailConsumer consume thumbnail loading complete listener, true if success
     * @param fullConsumer consume full loading complete listener, true if success
     * @param <T> type of source (eg. {@link String}, {@link File}, {@link android.net.Uri} ...)
     */
    <T> void loadImage(T source, ImageView imageView, PlainConsumer<Boolean> thumbnailConsumer, PlainConsumer<Boolean> fullConsumer);

    /**
     * Load image source into an imageview with progress showing and reloadable
     * @param source image source (eg. url, file, uri...)
     * @param imv target image view
     * @param pb {@link ProgressBar} to show while loading
     * @param reloadView clickable reload view
     * @param <T> type of source (eg. {@link String}, {@link File}, {@link android.net.Uri} ...)
     */
    <T> void loadImage(T source, @NonNull ImageView imv, @NonNull ProgressBar pb, @NonNull View reloadView);
}