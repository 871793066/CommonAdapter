package com.classic.adapter.interfaces;

import com.classic.adapter.BaseAdapterHelper;

/**
 * 项目名称: CommonAdapter
 * 包 名 称: com.classic.adapter
 *
 * 类 描 述: 扩展的Adapter接口规范
 * 创 建 人: 续写经典
 * 创建时间: 2016/1/21 17:54.
 */
public interface IAdapter<T> {

    /**
     * 数据更新回调
     *
     * @param helper {@link BaseAdapterHelper}
     * @param item 当前Item对象
     * @param position 下标
     */
    void onUpdate(BaseAdapterHelper helper, T item, int position);

    /**
     * 当前Item的布局文件
     *
     * @param item 当前Item对象
     * @param position 下标
     */
    int getLayoutResId(T item, int position);
}
