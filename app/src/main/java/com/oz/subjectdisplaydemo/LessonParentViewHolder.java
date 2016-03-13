package com.oz.subjectdisplaydemo;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;

/**
 * Created by Ojesh on 3/9/2016.
 */
public class LessonParentViewHolder extends ParentViewHolder {
    private static final float INITIAL_POSITION = 0.0f;
    private static final float ROTATED_POSITION = 180f;
    private static final boolean HONEYCOMB_AND_ABOVE = Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB;

    public TextView txtParent;
    public ImageView imageDropDownArrow;

    public LessonParentViewHolder(View itemView) {
        super(itemView);
        txtParent = (TextView) itemView.findViewById(R.id.txtview_parent);
        imageDropDownArrow = (ImageView) itemView.findViewById(R.id.parent_list_item_expand_arrow);
    }

    @SuppressLint("NewApi")

    @Override
    public void setExpanded(boolean isExpanded) {
        super.setExpanded(isExpanded);

    if(!HONEYCOMB_AND_ABOVE){
        return;
    }
    if(isExpanded)
    {
        imageDropDownArrow.setRotation(ROTATED_POSITION);
    }else{
        imageDropDownArrow.setRotation(INITIAL_POSITION);

    }
    }
}
