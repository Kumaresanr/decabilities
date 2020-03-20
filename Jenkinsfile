pipeline {
  agent any
  stages {
    stage('Checkout Source') {
      steps {
        git 'https://github.com/VikramjitRoy/decabilities.git'
      }
    }

    stage('Build image') {
      steps {
        sh 'docker -v'
      }
    }

  }
  environment {
    dockerImage = ''
  }
}