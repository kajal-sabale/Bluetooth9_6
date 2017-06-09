package com.example.bluetooth;

import android.bluetooth.BluetoothSocket;

/**
 * @author a634941
 *This class is used to return Bluetoothsocket.
 */
public class SocketHandler 
{
	private static BluetoothSocket socket;
	
	 public static BluetoothSocket getSocket(){
	        return socket;
	    }

	    public static void setSocket(BluetoothSocket socket){
	        SocketHandler.socket = socket;
	    }
}
