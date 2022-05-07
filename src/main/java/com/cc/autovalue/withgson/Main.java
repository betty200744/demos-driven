package com.cc.autovalue.withgson;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    String story1 = "{\"id\":1,\"title\":\"java\"}";
    Story javaStory = GsonUtils.fromJsonString(story1, AutoValue_Story.class);
    System.out.println(javaStory.toString());
    
    
    Story goStory0 = Story.create(0, "go");
    String story2 = GsonUtils.toJsonString(goStory0);
    System.out.println("this is Gson toJsonString: " + story2);
    
    Story goStory1 = Story.create(1, "go");
    List<Story> goStories = Arrays.asList(goStory0, goStory1);
    String goStoriesString = GsonUtils.toJsonString(goStories);
    System.out.println("this is Gson toJsonString: " + goStoriesString);
  }
}