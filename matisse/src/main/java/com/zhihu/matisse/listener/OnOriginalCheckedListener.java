package com.zhihu.matisse.listener;

/**
 * When original is enabled, callback immediately when user check or uncheck original.
 */
public interface OnOriginalCheckedListener {
    void onCheck(boolean isChecked);
}