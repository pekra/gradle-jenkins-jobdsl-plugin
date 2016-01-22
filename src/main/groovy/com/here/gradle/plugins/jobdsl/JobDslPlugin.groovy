package com.here.gradle.plugins.jobdsl

import com.here.gradle.plugins.jobdsl.tasks.GenerateXmlTask
import com.here.gradle.plugins.jobdsl.tasks.UpdateJenkinsTask
import org.gradle.api.Plugin
import org.gradle.api.Project

class JobDslPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.extensions.create('jobdsl', JobDslPluginExtension)
        project.task('dslGenerateXml', type: GenerateXmlTask)
        project.task('dslUpdateJenkins', type: UpdateJenkinsTask)
    }

}