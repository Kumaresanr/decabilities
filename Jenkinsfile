pipeline {
  agent {
    docker {
      image 'golang'
    }

  }
  stages {
    stage('sample') {
      steps {
        sh '''echo \'hello, jenkins\'
docker -v'''
      }
    }

  }
}