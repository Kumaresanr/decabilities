pipeline {
  agent {
    node {
      label 'any'
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