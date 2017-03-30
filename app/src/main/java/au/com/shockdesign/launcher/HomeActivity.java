package au.com.shockdesign.launcher;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

public class HomeActivity extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    setContentView(R.layout.activity_home);
  }
}
