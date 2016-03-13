package com.oz.subjectdisplaydemo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ojesh on 3/8/2016.
 */
public class ClassEight {
    @SerializedName("parent_class")
    public String classname;

    public ClassEight(String classname) {
        this.classname = classname;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
}
