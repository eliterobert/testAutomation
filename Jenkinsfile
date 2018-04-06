#!groovy

node('master') {
    stage('Checkout') {
        checkout scm
    }
    
    stage('Run tests') {
      maven: 'maven' {
          dir('Test') {
            sh 'mvn clean install test -Dwebdriver.type=chrome -Dwebdriver.chrome.driver=E:/Workspace/chromedriver.exe'
          }
      }
    }
}