package com.habapps;

import org.robovm.apple.foundation.NSBundle;

import libgdx.implementations.GameIdEnum;


public enum GameProperties {

    skelgame(
            GameIdEnum.math,
            NSBundle.getMainBundle().getLocalizedString("language", "en", "InfoPlist"),
            NSBundle.getMainBundle().getLocalizedString("CFBundleDisplayName", "en", "InfoPlist"),
            "appId",
            "bannerId",
            "interId",
            "rewardId",
            "iosAppstoreId",
            "proVersionStoreAppId"),

    balloon(
            GameIdEnum.balloon,
            NSBundle.getMainBundle().getLocalizedString("language", "en", "InfoPlist"),
            NSBundle.getMainBundle().getLocalizedString("CFBundleDisplayName", "en", "InfoPlist"),
            "ca-app-pub-9432399956064043~8883910119",
            "ca-app-pub-9432399956064043/7570828446",
            "ca-app-pub-9432399956064043/7207866360",
            "ca-app-pub-9432399956064043/2318501760",
            "1482271246",
            "1482271246"),

    mathgame(
            GameIdEnum.math,
            NSBundle.getMainBundle().getLocalizedString("language", "en", "InfoPlist"),
            NSBundle.getMainBundle().getLocalizedString("CFBundleDisplayName", "en", "InfoPlist"),
            "ca-app-pub-9432399956064043~7951976554",
            "ca-app-pub-9432399956064043/5122084493",
            "ca-app-pub-9432399956064043/8802023793",
            "ca-app-pub-9432399956064043/5325813217",
            "1492916413",
            "1492916413");

    private GameIdEnum gameIdEnum;
    private String language;
    private String appName;
    private String adMobAppId;
    private String bannerAdId;
    private String interstitialAdId;
    private String rewardAdId;
    private String storeAppId;
    private String proVersionStoreAppId;

    GameProperties(GameIdEnum gameIdEnum,
                   String language,
                   String appName,
                   String adMobAppId,
                   String bannerAdId,
                   String interstitialAdId,
                   String rewardAdId,
                   String storeAppId,
                   String proVersionStoreAppId) {
        this.gameIdEnum = gameIdEnum;
        this.language = language;
        this.appName = appName;
        this.adMobAppId = adMobAppId;
        this.bannerAdId = bannerAdId;
        this.interstitialAdId = interstitialAdId;
        this.rewardAdId = rewardAdId;
        this.storeAppId = storeAppId;
        this.proVersionStoreAppId = proVersionStoreAppId;
    }

    public GameIdEnum getGameIdEnum() {
        return gameIdEnum;
    }

    public String getLanguage() {
        return language;
    }

    public String getAppName() {
        return appName;
    }

    public String getAdMobAppId() {
        return adMobAppId;
    }

    public String getBannerAdId() {
        return bannerAdId;
    }

    public String getInterstitialAdId() {
        return interstitialAdId;
    }

    public String getRewardAdId() {
        return rewardAdId;
    }

    public String getStoreAppId() {
        return storeAppId;
    }

    public String getProVersionStoreAppId() {
        return proVersionStoreAppId;
    }
}
