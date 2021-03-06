package com.aone.menurandomchoice.views.ownerlogin;

import android.content.Intent;

import com.aone.menurandomchoice.repository.model.UserAccessInfo;
import com.aone.menurandomchoice.views.base.BaseContract;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface OwnerLoginContract {

    interface View extends BaseContract.View {

        void moveToOwnerStoreActivity(@NonNull UserAccessInfo userAccessInfo);

        void moveToSignUpActivity(long userId);

    }

    interface Presenter extends BaseContract.Presenter<OwnerLoginContract.View> {

        void handlingDeviceKaKaoAccountLogin();

        void handlingOtherKaKaoAccountLogin();

        boolean isNeedKakaoSDKLoginScreen(int requestCode, int resultCode, @Nullable Intent data);

    }

}
