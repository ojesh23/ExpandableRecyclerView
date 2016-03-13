package com.oz.subjectdisplaydemo;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ojesh on 3/11/2016.
 */
public class LessonWrapper {
    private static LessonWrapper sWrapper;
    private ArrayList<LessonParent> mParent;

    public static LessonWrapper get(Context context) {
        if (sWrapper == null) {
            sWrapper = new LessonWrapper(context);
        }
        return sWrapper;
    }

    private LessonWrapper(Context context) {
        mParent = new ArrayList<>();

        ArrayList<String>  child=new ArrayList<>();
        child.add("ssdds");
        child.add("dada");
        //LessonParent lessonParent = new LessonParent(child);

        /*mParent.add(lessonParent);
        lessonParent.setTitle("Physics lessons:");*/

        for (int i = 0; i < 5; i++) {
            LessonParent lessonParent = new LessonParent(child);
            lessonParent.setTitle("Lesson #" + i);
            mParent.add(lessonParent);
        }
    }

    public List<LessonParent> getLessons() {
        return mParent;
    }

}
