package haha

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by SidneyXu on 2015/12/02.
 */
class TP implements Plugin<Project> {
    void apply(Project project) {
        // Add the 'greeting' extension object
        project.extensions.create("tp", TPExtension)

        // Add a task that uses the configuration
        project.task('tp') << {
            println "${project.tp.message} from ${project.tp.greeter}"
        }
    }
}

class TPExtension {
    String message
    String greeter
}