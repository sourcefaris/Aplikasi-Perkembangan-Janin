package com.example.perkembanganjanin;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Subactivity extends Activity{
	private String [] customHtml = {
			"file:///android_asset/html/calculation.html",
			"file:///android_asset/html/bulan1.html",
			"file:///android_asset/html/bulan2.html",
			"file:///android_asset/html/bulan3.html",
			"file:///android_asset/html/bulan4.html",
			"file:///android_asset/html/bulan5.html",
			"file:///android_asset/html/bulan6.html",
			"file:///android_asset/html/bulan7.html",
			"file:///android_asset/html/bulan8.html",
			"file:///android_asset/html/bulan9.html"
	};
	
	private WebView webView ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.subactivity);
		Bundle extra = getIntent().getExtras();
		int position = extra.getInt("position");
		
		webView = (WebView)findViewById(R.id.webView1);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl(customHtml[position]);
//			webView.loadDataWithBaseURL("file:///android_asset/", customHtml[position], "text/html", "UTF-8",null);
		
	}

}
