package com.example.projecthelloondo;

import android.app.Application;
import com.kakao.sdk.common.KakaoSdk;

public class kakaoApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        KakaoSdk.init(this,"43fc15a9eb8ccf9884bf45cd402b61ce");
    }
}

