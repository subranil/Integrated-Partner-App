package org.ekstep.openrap.asynctask;

import android.os.AsyncTask;

import org.json.JSONObject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author randhirgupta
 * @since 20/2/18.
 */

public class ConnectToOpenRAPAsyncTask extends AsyncTask<JSONObject, Void, Boolean> {

    private InetAddress mHostAddress;
    private int mHostPort;
    private OnConnectionCompleted mOnConnectionCompleted;

    public ConnectToOpenRAPAsyncTask(InetAddress hostAddress, int hostPort, OnConnectionCompleted onConnectionCompleted) {
        this.mHostAddress = hostAddress;
        this.mHostPort = hostPort;
        this.mOnConnectionCompleted = onConnectionCompleted;
    }

    @Override
    protected Boolean doInBackground(JSONObject... jsonObjects) {

        Socket socket = null;
        DataInputStream dataInputStream = null;
        DataOutputStream dataOutputStream = null;
//        JSONObject jsonData = jsonObjects[0];
        boolean isConnected = false;

        try {

            socket = new Socket(mHostAddress, mHostPort);
            dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream = new DataOutputStream(socket.getOutputStream());

//            dataOutputStream.writeUTF(jsonData.toString());

//            String response = dataInputStream.readUTF();
//            isConnected = response.equals("Connection Accepted");
            isConnected = true;
        } catch (IOException e) {
            e.printStackTrace();
            isConnected = false;
        } finally {

            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (dataInputStream != null) {
                try {
                    dataInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (dataOutputStream != null) {
                try {
                    dataOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return isConnected;
    }

    @Override
    protected void onPostExecute(Boolean aBoolean) {
        if (mOnConnectionCompleted != null) {
            mOnConnectionCompleted.onConnectionCompleted(aBoolean);
        }
    }

    public interface OnConnectionCompleted {
        void onConnectionCompleted(boolean isConnectionDone);
    }
}
