#!groovy

node('master') {
    stage('Checkout') {
        checkout scm
    }
    
    stage('Run tests') {
      maven: 'maven' {
            sh 'mvn clean install '-Dtest=automation.*Test'
      }
    }
}