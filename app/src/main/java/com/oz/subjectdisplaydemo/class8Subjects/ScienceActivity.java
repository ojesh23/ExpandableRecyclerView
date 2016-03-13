package com.oz.subjectdisplaydemo.class8Subjects;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.oz.subjectdisplaydemo.LessonChild;
import com.oz.subjectdisplaydemo.LessonParent;
import com.oz.subjectdisplaydemo.LessonWrapper;
import com.oz.subjectdisplaydemo.Model.ParentWrapper;
import com.oz.subjectdisplaydemo.R;
import com.oz.subjectdisplaydemo.SubjectExpandableAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ojesh on 3/6/2016.
 */
public class ScienceActivity extends Activity {
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.science_activity);

        rv=(RecyclerView)findViewById(R.id.lessonRecyclerView);

        LinearLayoutManager lm=new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
        SubjectExpandableAdapter myAdapter=new SubjectExpandableAdapter(ScienceActivity.this,generateLesson());
        myAdapter.onRestoreInstanceState(savedInstanceState);

        rv.setAdapter(myAdapter);



    }
    private ArrayList<ParentObject> generateLesson() {
        LessonWrapper lessonWrapper = LessonWrapper.get(this);
        List<LessonParent> lp = lessonWrapper.getLessons();
        ArrayList<ParentObject> parentObjects = new ArrayList<>();
        for (LessonParent lessonParent : lp) {
            ArrayList<Object> childList = new ArrayList<>();
            childList.add(new LessonChild(lessonParent.getTitle() ));
            lessonParent.setChildObjectList(childList);
            parentObjects.add(lessonParent);
        }
        return parentObjects;
    }

}
