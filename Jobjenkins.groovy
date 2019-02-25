freeStyleJob('devops_master') {
    logRotator(-1, 10)
    jdk('Java 6')
    scm {
        github('https://gitlab.com/baptch/rendu_devops_exam_baptiste_chene', 'master')
    }
    triggers {
        githubPush()
    }
    steps {
        gradle('clean build')
    }
    publishers {
        archiveArtifacts('job-dsl-plugin/build/libs/job-dsl.hpi')
    }
}
