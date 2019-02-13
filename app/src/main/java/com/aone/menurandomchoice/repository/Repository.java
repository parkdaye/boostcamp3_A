package com.aone.menurandomchoice.repository;

import com.aone.menurandomchoice.repository.local.pref.PreferencesHelper;
import com.aone.menurandomchoice.repository.network.APIHelper;
import com.aone.menurandomchoice.repository.oauth.KakaoLoginHelper;
import com.aone.menurandomchoice.repository.server.ServerDataHelper;
import com.aone.menurandomchoice.repository.local.SqliteDatabaseHelper;
import com.aone.menurandomchoice.repository.model.StoreDetail;
import com.aone.menurandomchoice.repository.oauth.KakaoLoginHelper;

import androidx.annotation.NonNull;

public interface Repository extends KakaoLoginHelper, ServerDataHelper, SqliteDatabaseHelper, APIHelper, PreferencesHelper {

    interface OnLoadStoreDetailListener {

        void onStoreDetailLoaded(StoreDetail storeDetail);

        void onFailToLoadStoreDetail();
    }

    void cancelAll();

    void loadStoreDetail(int storeIdx, @NonNull OnLoadStoreDetailListener onLoadStoreDetailListener);

}
