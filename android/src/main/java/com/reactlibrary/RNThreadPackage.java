package com.reactlibrary;

import com.facebook.react.ReactPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class RNThreadPackage implements ReactPackage {

    private ReactNativeHost reactNativeHost;
    private ReactPackage[] additionalPackages;

    // Default constructor (no arguments)
    public RNThreadPackage() {
    }

    // Constructor with arguments
    public RNThreadPackage(ReactNativeHost host, ReactPackage[] packages) {
        this.reactNativeHost = host;
        this.additionalPackages = packages;
    }

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        return Arrays.asList(new RNThreadModule(reactContext, reactNativeHost, additionalPackages));
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }
}
