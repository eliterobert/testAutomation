#!groovy

node('master') {
    stage('Checkout') {
        checkout scm
    }
    stage('Run tests') {
      maven: 'Maven' {
                build('AppTest')
                build('AppTest2')
            }
      }
    }
