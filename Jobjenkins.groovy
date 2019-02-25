freeStyleJob('devops_master') {
    logRotator(-1, 10)
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
}

job('build_publishV1') {
    steps {
        dockerBuildAndPublish {
            repositoryName('https://github.com/Baptistech/rendu_devops_exam_baptiste_chene')
            tag('${BUILD_TIMESTAMP}-${GIT_REVISION,length=7}')
            registryCredentials('docker-hub')
            forcePull(false)
            createFingerprints(false)
            skipDecorate()
        }
    }
}

freeStyleJob('devops_master') {
    logRotator(-1, 10)
    scm {
        github('Baptistech/rendu_devops_exam_baptiste_chene', 'master')
    }
    triggers {
        githubPush()
    }
    steps {
      shell('cd samplephpwebsite')
      shell('docker build -t appPhp .')
      shell('docker run appPhp')
      shell('docker commit -a baptistechene 5319d921977b baptistechene/devops_rendu_v1:latest')
      shell('docker push baptistechene/devops_rendu_v1:latest')
    }
}
