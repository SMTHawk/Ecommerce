package com.example.ecommerce;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import java.io.IOException;
import java.security.GeneralSecurityException;

public class SecureStorage {

    private static final String PREFS_NAME = "secure_prefs";
    private static final String KEY_AUTH_TOKEN = "auth_token";
    private static final String KEY_USER_ID = "user_id";

    private SharedPreferences encryptedPrefs;

    public SecureStorage(Context context) {
        try {
            MasterKey masterKey = new MasterKey.Builder(context)
                    .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
                    .build();

            encryptedPrefs = EncryptedSharedPreferences.create(
                    context,
                    PREFS_NAME,
                    masterKey,
                    EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
                    EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
            );

        } catch (GeneralSecurityException | IOException e) {
            throw new RuntimeException("Failed to initialize secure storage", e);
        }
    }

    public void saveAuthToken(String token) {
        encryptedPrefs.edit().putString(KEY_AUTH_TOKEN, token).apply();
    }

    public String getAuthToken() {
        return encryptedPrefs.getString(KEY_AUTH_TOKEN, null);
    }

    public void saveUserId(String userId) {
        encryptedPrefs.edit().putString(KEY_USER_ID, userId).apply();
    }

    public String getUserId() {
        return encryptedPrefs.getString(KEY_USER_ID, null);
    }

    public void clearAll() {
        encryptedPrefs.edit().clear().apply();
    }
}
