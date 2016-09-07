package com.bigkoo.convenientbanner.holder;

/**
 * Created by Sai on 15/12/14.
 * @param <T> 任何你指定的对象
 */

import android.content.Context;
import android.view.View;

public interface Holder<T>{
    /**
     * 创建View
     * @param context
     * @return
     */
    View createView(Context context);

    /**
     * 更新UI
     * @param context
     * @param position
     * @param data
     */
    void UpdateUI(Context context,int position,T data);
}