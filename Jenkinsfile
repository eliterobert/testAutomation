#!groovy

node('master') {
    stage('Checkout') {
        checkout scm
    }
    stage('Run tests') {
      maven: 'maven' {
          dir('TestingAutomation') {
            sh 'mvn clean install test'
          }
      }
    }
}