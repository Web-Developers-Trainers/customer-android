package com.kustomer.kustomersdk.Interfaces;

import android.graphics.Bitmap;

/**
 * Created by Junaid on 2/27/2018.
 */

public interface KUSInputBarViewListener {
    void inputBarAttachmentClicked();
    void inputBarSendClicked();
    boolean inputBarShouldEnableSend();
}
