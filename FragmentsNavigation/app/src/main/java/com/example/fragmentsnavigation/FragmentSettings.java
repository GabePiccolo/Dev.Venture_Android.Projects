package com.example.fragmentsnavigation;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

public class FragmentSettings extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey);
    }
}
