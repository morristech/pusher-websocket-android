package com.pusher.android;

import android.os.Bundle;

/**
 * Created by jamiepatel on 28/06/2016.
 */

public interface PusherPushNotificationReceivedListener {
    void onMessageReceieved(String from, Bundle data);
}