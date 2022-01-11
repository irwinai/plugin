package com.github.irwinai.plugin.services

import com.intellij.openapi.project.Project
import com.github.irwinai.plugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
