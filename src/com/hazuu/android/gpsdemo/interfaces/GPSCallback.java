package com.hazuu.android.gpsdemo.interfaces;

import android.location.Location;

public interface GPSCallback {
	public abstract void onGPSUpdate(Location location);
}
