package com.github.zwx2238.demoplugin.services

import com.intellij.openapi.project.Project
import com.github.zwx2238.demoplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
