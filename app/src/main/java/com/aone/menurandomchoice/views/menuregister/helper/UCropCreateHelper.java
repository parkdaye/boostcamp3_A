package com.aone.menurandomchoice.views.menuregister.helper;

import android.content.res.Resources;
import android.net.Uri;

import com.aone.menurandomchoice.GlobalApplication;
import com.aone.menurandomchoice.R;
import com.aone.menurandomchoice.utils.DateUtil;
import com.yalantis.ucrop.UCrop;

import java.io.File;

import androidx.annotation.NonNull;

public class UCropCreateHelper {

    public UCrop createUCop(@NonNull String fileName,
                            @NonNull Uri uri,
                            float xRatio,
                            float yRatio,
                            int resizeWidth,
                            int resizeHeight) {
        UCrop uCrop = createBasicUCrop(uri, fileName, xRatio, yRatio, resizeWidth, resizeHeight);
        UCrop.Options options = createUCropOptions();
        uCrop.withOptions(options);

        return uCrop;
    }

    private UCrop createBasicUCrop(Uri uri,
                              String fileName,
                              float xRatio,
                              float yRatio,
                              int resizeWidth,
                              int resizeHeight) {

        return UCrop.of(uri, Uri.fromFile(new File(GlobalApplication.getGlobalApplicationContext().getCacheDir(), fileName)))
                .withAspectRatio(xRatio, yRatio)
                .withMaxResultSize(resizeWidth, resizeHeight);

    }

    private UCrop.Options createUCropOptions() {
        Resources res = GlobalApplication.getGlobalApplicationContext().getResources();

        UCrop.Options options = new UCrop.Options();
        options.setStatusBarColor(res.getColor(R.color.black));
        options.setToolbarColor(res.getColor(R.color.white));
        options.setActiveWidgetColor(res.getColor(R.color.reddish));
        options.setToolbarWidgetColor(res.getColor(R.color.black));
        options.setToolbarTitle(GlobalApplication
                .getGlobalApplicationContext()
                .getResources()
                .getString(R.string.uCrop_toolbar_title));

        return options;
    }

}
