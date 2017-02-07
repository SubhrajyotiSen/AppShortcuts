package com.subhrajyoti.appshortcuts;

import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ShortcutManager shortcutManager = getSystemService(ShortcutManager.class);

        Intent intent = new Intent(this, DynamicShortcutActivity.class);
        intent.setAction(Intent.ACTION_VIEW);

        ShortcutInfo dynamicShortcut = new ShortcutInfo.Builder(this, "dynamicShortcut")
                .setShortLabel("Dynamic")
                .setLongLabel("Open dynamic shortcut")
                .setIcon(Icon.createWithResource(this, R.drawable.ic_dynamic))
                .setIntent(intent)
                .setRank(1)
                .build();

        shortcutManager.setDynamicShortcuts(Collections.singletonList(dynamicShortcut));

    }
}
