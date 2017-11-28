package com.cloud.app;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

public class IntenetCheck
{
  public static int internetStatus = 0;
  public static String internetType;

  public static boolean isConnectedToInternet(Context paramContext)
  {
	  boolean haveConnectedWifi = false;
      boolean haveConnectedMobile = false;

    try
    {
	        ConnectivityManager cm = (ConnectivityManager) paramContext.getSystemService(Context.CONNECTIVITY_SERVICE);
	        NetworkInfo[] netInfo = cm.getAllNetworkInfo();
	        for (NetworkInfo ni : netInfo) {
	            if (ni.getTypeName().equalsIgnoreCase("WIFI"))
	                if (ni.isConnected())
	                    haveConnectedWifi = true;
	            if (ni.getTypeName().equalsIgnoreCase("MOBILE"))
	                if (ni.isConnected())
	                    haveConnectedMobile = true;
	        }

    }
    catch (Exception ex)
    {

    }
    return haveConnectedWifi || haveConnectedMobile;
  }
}
