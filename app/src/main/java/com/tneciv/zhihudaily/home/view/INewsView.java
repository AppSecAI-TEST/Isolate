package com.tneciv.zhihudaily.home.view;


import com.tneciv.zhihudaily.home.model.HomeEventEntity;

/**
 * Created by Tneciv
 * on 2016-06-24 17:03 .
 */
public interface INewsView {
    void updateView(HomeEventEntity.NewEntityList newEntityList);
}
