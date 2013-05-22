package com.example.popupview;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;


public class MainActivity extends Activity {

	
	private AlertDialog.Builder messageDialog;
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
		messageDialog = new AlertDialog.Builder(this);
		messageDialog.setTitle("Oops!");
		messageDialog.setMessage(msg);
		messageDialog.setPositiveButton("Okay", null);
		messageDialog.setCancelable(false);
		messageDialog.create().show();
	}

}
