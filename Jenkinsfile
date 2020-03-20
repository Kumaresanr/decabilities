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
      steps{
        docker -v
      }
    }

    stage('Build image') {
      steps{
        script {
          docker -v
        }
      }
    }

//     stage('Push Image') {
//       steps{
//         script {
//
//             dockerImage.push()
//
//         }
//       }
//     }



  }
}