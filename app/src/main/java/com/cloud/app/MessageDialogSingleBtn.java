package com.cloud.app;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;


public class MessageDialogSingleBtn
{
  static AlertDialog alert;
  static AlertDialog.Builder alertbox;

  public static void AppDialog(Activity paramActivity, String paramString1, String paramString2)
  {
    alertbox = new AlertDialog.Builder(paramActivity);
    alert = alertbox.create();
    alertbox.setTitle(paramString1);
    alertbox.setMessage(paramString2);
    alertbox.setPositiveButton("OK", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        MessageDialogSingleBtn.alert.dismiss();
      }
    });
    alertbox.show();
  }
}

