package com.oz.subjectdisplaydemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.oz.subjectdisplaydemo.Model.ParentListItem;

import java.util.List;

/**
 * Created by Ojesh on 3/11/2016.
 */
public class SubjectExpandableAdapter extends ExpandableRecyclerAdapter<LessonParentViewHolder,LessonChildViewHolder> {
    LayoutInflater mLayoutInflater;
    public SubjectExpandableAdapter(Context context, List<ParentObject> parentItemList) {
        super(context, parentItemList);
        mLayoutInflater=LayoutInflater.from(context);
    }

    @Override
    public LessonParentViewHolder onCreateParentViewHolder(ViewGroup viewGroup) {
        View view=mLayoutInflater.inflate(R.layout.list_item_parent,viewGroup,false);
        return new LessonParentViewHolder(view);
    }

    @Override
    public LessonChildViewHolder onCreateChildViewHolder(ViewGroup viewGroup) {
        View view=mLayoutInflater.inflate(R.layout.list_item_child,viewGroup,false);
        return null;
    }

    @Override
    public void onBindParentViewHolder(LessonParentViewHolder lessonParentViewHolder, int i, Object parentObj) {
        LessonParent lessonParent=(LessonParent) parentObj;
        lessonParentViewHolder.txtParent.setText(lessonParent.getTitle());
    }


    @Override
    public void onBindChildViewHolder(LessonChildViewHolder lessonChildViewHolder, int i, Object childObj) {
    LessonChild lessonChild=(LessonChild) childObj;
        lessonChildViewHolder.txtChild.setText(lessonChild.getmChildList().toString());
    }
}
