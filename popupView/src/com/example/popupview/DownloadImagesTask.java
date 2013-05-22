package com.example.popupview;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;

public class DownloadImagesTask extends AsyncTask<String, Void, Bitmap> {
	private ImageView bmImage;
	
	public DownloadImagesTask(ImageView bmImage) {
        this.bmImage = bmImage;
    }

	@Override
	protected Bitmap doInBackground(String... urls) {
		// TODO Auto-generated method stub
		String url = urls[0];
		Bitmap bitmap = null;
    	try {	 
            InputStream in = new java.net.URL(url).openStream();
            bitmap = BitmapFactory.decodeStream(in);
		} catch (MalformedURLException e) {
		  e.printStackTrace();
		} catch (IOException e) {
		  e.printStackTrace();
		}
    	return bitmap;
	}
	
    protected void onPostExecute(Bitmap bitmap) {
    	bmImage.setImageBitmap(bitmap);
    }
}
