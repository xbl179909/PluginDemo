package com.xbl.plugin

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class OnePlugin implements Plugin<Project> {

    public void apply(Project project){
        project.task("helloplugin"){
            doLast {
                System.out.println("========================");
                System.out.println("hello gradle plugin!");
                System.out.println("========================");
            }
        }
        project.extensions.add("person", PersonExt)
        project.task("printHello"){
            doLast {
                def personExt = project.person

                println personExt

            }
        }
    }
}