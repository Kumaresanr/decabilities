pipeline {
  agent any
  stages {
    stage('sample') {
      agent {
         docker {
             image 'golang'
         }
     }
      steps {
        sh '''echo \'hello, jenkins\' '''
        sh 'go '
      }
    }

  }
}
