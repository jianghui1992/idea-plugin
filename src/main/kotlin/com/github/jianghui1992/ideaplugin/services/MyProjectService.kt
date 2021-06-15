package com.github.jianghui1992.ideaplugin.services

import com.github.jianghui1992.ideaplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
