package au.com.shockdesign.launcher;

import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import java.util.Locale;

public class HomeActivity extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    setContentView(R.layout.activity_home);
    findViewById(R.id.relative_layout_activity_home).setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
    AssetManager am = getApplicationContext().getAssets();

//    Typeface typeface = Typeface.createFromAsset(am,
//        String.format(Locale.US, "fonts/%s", "Solari.ttf"));
//    ((CustomDigitalClock) findViewById(R.id.relative_layout_activity_home_digital_clock)).setTypeface(typeface);
  }
}
