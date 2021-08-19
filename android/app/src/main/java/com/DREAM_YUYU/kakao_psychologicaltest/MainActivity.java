package com.DREAM_YUYU.kakao_psychologicaltest.;
import android.content.res.Configuration;
import android.content.Intent;

import android.os.Bundle;

import com.DREAM_YUYU.kakao_psychologicaltest.facebook.react.ReactActivity;
import com.DREAM_YUYU.kakao_psychologicaltest.facebook.react.ReactActivityDelegate;
import com.DREAM_YUYU.kakao_psychologicaltest.facebook.react.ReactRootView;
import com.DREAM_YUYU.kakao_psychologicaltest.swmansion.gesturehandler.react.RNGestureHandlerEnabledRootView;

import expo.modules.splashscreen.singletons.SplashScreen;
import expo.modules.splashscreen.SplashScreenImageResizeMode;


public class MainActivity extends ReactActivity {

    // Added automatically by Expo Config
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Intent intent = new Intent("onConfigurationChanged");
        intent.putExtra("newConfig", newConfig);
        sendBroadcast(intent);
    }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    // Set the theme to AppTheme BEFORE onCreate to support 
    // coloring the background, status bar, and navigation bar.
    // This is required for expo-splash-screen.
    setTheme(R.style.AppTheme);
    super.onCreate(null);
// @generated begin expo-splash-screen-mainActivity-onCreate-show-splash - expo prebuild (DO NOT MODIFY) sync-8915a20732e7fda227585f9b6ef0d38bef4fbbbe
    SplashScreen.show(this, SplashScreenImageResizeMode.CONTAIN, ReactRootView.class, false);
// @generated end expo-splash-screen-mainActivity-onCreate-show-splash
    // SplashScreen.show(...) has to be called after super.onCreate(...)
    // Below line is handled by '@expo/configure-splash-screen' com.DREAM_YUYU.kakao_psychologicaltestmand and it's discouraged to modify it manually
  }


    /**
     * Returns the name of the main com.DREAM_YUYU.kakao_psychologicaltestponent registered from JavaScript.
     * This is used to schedule rendering of the com.DREAM_YUYU.kakao_psychologicaltestponent.
     */
    @Override
    protected String getMainComponentName() {
        return "main";
    }

    @Override
    protected ReactActivityDelegate createReactActivityDelegate() {
        return new ReactActivityDelegate(this, getMainComponentName()) {
            @Override
            protected ReactRootView createRootView() {
                return new RNGestureHandlerEnabledRootView(MainActivity.this);
            }
        };
    }
}
