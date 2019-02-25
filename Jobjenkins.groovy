freeStyleJob('devops_master') {
    logRotator(-1, 10)
    jdk('Java 6')
    scm {
        github('Baptistech/rendu_devops_exam_baptiste_chene', 'master')
    }
    triggers {
        githubPush()
    }
    steps {
      shell('docker-compose build')
      shell('docker-compose up')
    }
    publishers {
        archiveArtifacts('job-dsl-plugin/build/libs/job-dsl.hpi')
    }
}
