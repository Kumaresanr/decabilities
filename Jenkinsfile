pipeline {
  agent {
    jenkins-slave
  }
  stages {
    stage('Build') {
      agent {
        jenkins-slave
      }
      steps {
        sh 'ls -li'
        sh 'docker -v'
      }
    }

  }
}