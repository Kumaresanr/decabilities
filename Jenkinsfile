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
        script {
          docker.build("vikramvj/test")
        }

      }
    }

  }
  environment {
    dockerImage = ''
  }
}