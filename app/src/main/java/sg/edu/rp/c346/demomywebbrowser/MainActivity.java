package sg.edu.rp.c346.demomywebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    WebView wvPage;
    Button btnLoad;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wvPage = findViewById(R.id.wvMyPage);
        btnLoad = findViewById(R.id.btnLoad);
        et = findViewById(R.id.etUrl);


        wvPage.setWebViewClient(new WebViewClient());
        wvPage.getSettings().setAllowFileAccessFromFileURLs(false);
        wvPage.getSettings().setJavaScriptEnabled(true);
        wvPage.getSettings().setDisplayZoomControls(true);
        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wvPage.loadUrl(et.getText().toString());
                et.setVisibility(View.GONE);
            }
        });
    }
}
