package com.hackerrank.JavaChallenges.JavaChallenges;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

public class JavaSingleton {
    public String str;
    private static final JavaSingleton instance = new JavaSingleton();


    private JavaSingleton() {

    }
    public static JavaSingleton getSingleInstance() {

        return instance;
    }
}
