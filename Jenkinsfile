pipeline {
  agent {
    node {
      label 'docker'
    }

  }
  stages {
    stage('Build') {
      agent {
        docker {
          reuseNode true
          image 'docker:latest'
        }

      }
      steps {
        sh 'docker -v'
      }
    }

  }
}