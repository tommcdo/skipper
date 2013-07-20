package com.tommcdo.skipper;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import java.lang.Exception;
import java.util.List;

public class Skipper extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();

        Uri webAddress = extractUri(intent.getData());

        Intent webIntent = new Intent(Intent.ACTION_VIEW, webAddress);
        startActivity(webIntent);

        //Toast.makeText(getApplicationContext(), url, Toast.LENGTH_LONG).show();
        finish();
    }

    public Uri extractUri(Uri uri)
    {
        String url;
        try
        {
            List<String> params = uri.getQueryParameters("u");
            url  = params.get(0);
        }
        catch (Exception e)
        {
            String errorMessage = "Skipper was unable to extract URL from Facebook link";
            Toast.makeText(getApplicationContext(), errorMessage, Toast.LENGTH_LONG).show();
            url = "";
        }
        return Uri.parse(url);
    }
}
