pipeline {
  agent any
  stages {
    stage('first') {
      steps {
        git(url: 'https://github.com/VikramjitRoy/decabilities.git', branch: 'master', changelog: true)
      }
    }

  }
}