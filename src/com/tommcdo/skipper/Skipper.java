package com.tommcdo.skipper;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
//import android.widget.Toast;
import java.net.URLDecoder;
import java.io.UnsupportedEncodingException;

public class Skipper extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();

        String url = extractUrl(intent.getDataString());

        Uri webAddress = Uri.parse(url);
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webAddress);
        startActivity(webIntent);

        //Toast.makeText(getApplicationContext(), url, Toast.LENGTH_LONG).show();
        finish();
    }

    public String extractUrl(String data)
    {
        String url;
        try
        {
            url = URLDecoder.decode(data.split("=")[1], "UTF-8");
        }
        catch (UnsupportedEncodingException e)
        {
            url = "Couldn't decode it";
        }
        return url;
    }
}
