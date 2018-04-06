#!groovy

node('master') {
    stage('Checkout') {
        checkout scm
    }
    stage('Run tests') {
      maven: 'maven' {
                build('AppTest')
                build('AppTest2')
            }
      }
    }
