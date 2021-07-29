package com.github.yyt231.goodsdriverplugin.services

import com.github.yyt231.goodsdriverplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
