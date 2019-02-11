package com.aone.menurandomchoice.repository;

<<<<<<< HEAD
import com.aone.menurandomchoice.repository.network.APIHelper;
import com.aone.menurandomchoice.repository.oauth.KakaoLoginHelper;
import com.aone.menurandomchoice.repository.server.ServerDataHelper;

public interface Repository extends KakaoLoginHelper, ServerDataHelper, APIHelper {
=======
import com.aone.menurandomchoice.repository.local.SqliteDatabaseHelper;
import com.aone.menurandomchoice.repository.model.StoreDetail;
import com.aone.menurandomchoice.repository.oauth.KakaoLoginHelper;
import com.aone.menurandomchoice.repository.server.ServerDataHelper;

import androidx.annotation.NonNull;

public interface Repository extends KakaoLoginHelper, ServerDataHelper, SqliteDatabaseHelper {

    public interface OnLoadStoreDetailListener {

        void onStoreDetailLoaded(StoreDetail storeDetail);

        void onFailToLoadStoreDetail();
    }
>>>>>>> develop

    void cancelAll();

    void loadStoreDetail(int storeIdx, @NonNull OnLoadStoreDetailListener onLoadStoreDetailListener);
}
