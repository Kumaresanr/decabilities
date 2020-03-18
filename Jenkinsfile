pipeline {
  agent {
      label 'docker'
    }
  stages {
    stage('Build') {
      steps {
        checkout scm
        sh '''

          docker build -t $IMAGE_NAME:$BUILD_ID .
        '''
      }
    }

    stage('Test') {
      steps {
        echo 'TODO: add tests'
      }
    }

    stage('Image Release') {
      when {
        expression {
          env.BRANCH_NAME == 'master'
        }

      }
      steps {
        withCredentials(bindings: [[$class: 'UsernamePasswordMultiBinding', credentialsId: 'dockerhub',
                          usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD']]) {
          sh '''

            docker push $IMAGE_NAME:$BUILD_ID
          '''
        }

      }
    }

    stage('Staging Deployment') {
      when {
        expression {
          env.BRANCH_NAME == 'master'
        }

      }
      environment {
        RELEASE_NAME = 'decabilities-staging'
        SERVER_HOST = 'staging.seanmeme.k8s.prydoni.us'
      }
      steps {
        sh '''
         helm upgrade $RELEASE_NAME --install ./helm/
        '''
      }
    }

    stage('Deploy to Production?') {
      when {
        expression {
          env.BRANCH_NAME == 'master'
        }

      }
      steps {
        milestone 1
        input 'Deploy to Production?'
        milestone 2
      }
    }

    stage('Production Deployment') {
      when {
        expression {
          env.BRANCH_NAME == 'master'
        }

      }
      environment {
        RELEASE_NAME = 'decabilities-production'
        SERVER_HOST = 'seanmeme.k8s.prydoni.us'
      }
      steps {
        sh '''

          helm upgrade $RELEASE_NAME --install ./helm/
        '''
      }
    }

  }
  environment {
    IMAGE_NAME = 'vikramvj/test'
    BUILD_ID = 'latest'
  }
}