pipeline {
  agent any
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