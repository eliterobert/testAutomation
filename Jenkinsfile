#!groovy

node('master') {
    stage('Checkout') {
        checkout scm
    }
    stage('Run tests') {
      maven: 'maven' {
          dir('com.test.automation/src/test/java') {
            sh 'mvn clean install test'
          }
      }
    }
}