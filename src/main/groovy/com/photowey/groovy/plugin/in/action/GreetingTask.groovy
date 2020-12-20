package com.photowey.groovy.plugin.in.action

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * GreetingTask*
 *
 * @author photowey*
 * @date 2020/12/20*
 * @since 1.0.0*
 */
class GreetingTask extends DefaultTask {
    String greeting = 'Say Hello from GreetingTask'

    @TaskAction
    def greet() {
        println greeting
    }
}