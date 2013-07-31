package com.tommcdo.skipper;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import java.lang.Exception;

public class Skipper extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // Extract URI from existing intent.
        Intent intent = getIntent();
        Uri webAddress = extractUri(intent.getData());

        // Re-send intent.
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webAddress);
        startActivity(webIntent);

        // Nothing left to do; finish.
        finish();
    }

    public Uri extractUri(Uri uri)
    {
        String url;
        try
        {
            // Grab the URL from the query parameter 'u'.
            url  = uri.getQueryParameter("u");
        }
        catch (Exception e)
        {
            // Notify user that URL extraction failed.
            Toast.makeText(
                getApplicationContext(),
                "Skipper was unable to extract URL from Facebook link",
                Toast.LENGTH_LONG
            ).show();
            url = "";
        }

        // Create URI from URL.
        return Uri.parse(url);
    }
}
