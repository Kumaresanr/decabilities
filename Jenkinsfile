#!/usr/bin/env groovy
pipeline{
    agent{
        node {
            label 'docker'
        }
    }
    stages{

        stage{
            agent{
                docker {
                    image 'docker:latest'
                }
            }
            steps {
                // using the Pipeline Maven plugin we can set maven configuration settings, publish test results, and annotate the Jenkins console
                    sh 'docker -v'
            }
        }
    }
}