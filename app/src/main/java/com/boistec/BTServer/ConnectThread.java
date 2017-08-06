package com.boistec.BTServer;

import android.bluetooth.BluetoothDevice;
import android.util.Log;

import java.util.UUID;

import static android.content.ContentValues.TAG;

/**
 * Created by boist on 06/08/2017.
 */

public class ConnectThread extends Thread {

    public ConnectThread(BluetoothDevice device, UUID uuid) {
        Log.d(TAG, "ConnectThread: Setting up the connection object.");
    }
}
