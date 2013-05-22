package com.example.popupview;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;


public class MainActivity extends Activity {

	
	private AlertDialog.Builder builder;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
    /** Called when the user clicks the Send button */
    public void callPopup(View view) {
        // Do something in response to button
    	showMessage(new String("hello world"));
    }
    
	// Show message dialog 
	private void showMessage(String msg) {
		builder = new AlertDialog.Builder(this);
		builder.setTitle("Oops!");
		builder.setMessage(msg);
		// set the confirm event
		LayoutInflater inflater = this.getLayoutInflater();
		builder.setView(inflater.inflate(R.layout.dialog_signin, null));
		builder.setPositiveButton("Oh yeah", new DialogInterface.OnClickListener() {
	           public void onClick(DialogInterface dialog, int id) {
	               // User clicked OK button
	           }
	       });
		// set cancel event
		builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
	           public void onClick(DialogInterface dialog, int id) {
	               // User cancelled the dialog
	           }
	       });
		
		AlertDialog dialog = builder.create();
		dialog.show();
	}

}
