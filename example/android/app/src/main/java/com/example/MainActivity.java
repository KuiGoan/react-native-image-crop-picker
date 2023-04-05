package com.example;

import android.os.Bundle;

import com.facebook.react.ReactActivity;
import com.facebook.soloader.SoLoader;
import com.reactnative.ivpusic.imagepicker.patch30277.PickerModule30277Workaround;

public class MainActivity extends ReactActivity {

    private final PickerModule30277Workaround mPickerModule30277Workaround = new PickerModule30277Workaround();

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "example";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SoLoader.init(this, /* native exopackage */ false);
        super.onCreate(savedInstanceState);
    }

    private final PickerModule30277Workaround mPickerModule30277Workaround = new PickerModule30277Workaround();

        @Override
        public void onActivityResult(int requestCode, int resultCode, Intent data) {
            super.onActivityResult(requestCode, resultCode, data);
            mPickerModule30277Workaround.onActivityResultTriggered(getReactInstanceManager(), requestCode, resultCode, data);
        }

        @Override
        protected void onResume() {
            super.onResume();
            mPickerModule30277Workaround.onActivityResume(this, getReactInstanceManager());
        }

        @Override
        protected void onStop() {
            super.onStop();
            mPickerModule30277Workaround.onActivityStop(getReactInstanceManager());
        }
}
