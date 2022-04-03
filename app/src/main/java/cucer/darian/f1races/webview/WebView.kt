package cucer.darian.f1races.webview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import cucer.darian.f1races.R
import kotlinx.android.synthetic.main.activity_f1_races_webview.*

class WebView : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_f1_races_webview)
        WebView.settings.javaScriptEnabled = true
        WebView.WebViewClient = WebViewClient()
        WebView.loadUrl("https://www.google.com")

    }
}