package com.oz.subjectdisplaydemo;

import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;

/**
 * Created by Ojesh on 3/9/2016.
 */
public class LessonChildViewHolder extends ChildViewHolder{
    TextView txtChild;
    public LessonChildViewHolder(View itemView) {
        super(itemView);
        txtChild=(TextView)itemView.findViewById(R.id.txtview_child);
    }
}
