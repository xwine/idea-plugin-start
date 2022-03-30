package com.github.xwine.ideapluginstart.services

import com.intellij.openapi.project.Project
import com.github.xwine.ideapluginstart.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
