pipeline {
  environment {

    dockerImage = ""
  }

  agent any

  stages {

    stage('Checkout Source') {
      steps {
        git 'https://github.com/VikramjitRoy/decabilities.git'
      }
    }

    stage('Build image') {
      steps{
        script {
          dockerImage = docker.build
        }
      }
    }

    stage('Push Image') {
      steps{
        script {

            dockerImage.push()

        }
      }
    }



  }
}