package com.oz.subjectdisplaydemo;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ojesh on 3/11/2016.
 */
public class LessonParent implements ParentObject {

    public String mTitle;
    private ArrayList<String> mParentList;


    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public LessonParent(ArrayList<String> mParentList) {
        this.mParentList = mParentList;
    }
    public LessonParent() {
       // this.mParentList = mParentList;
    }

    @Override
    public List<Object> getChildObjectList() {
        return null;
    }

    @Override
    public void setChildObjectList(List<Object> list) {

    }
}
