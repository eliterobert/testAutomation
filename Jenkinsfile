#!groovy

node('master') {
    stage('Checkout') {
        checkout scm
    }
    stage('Run tests') {
      maven: 'maven' {
          dir('com.test.automation') {
            sh 'mvn clean test -Dwebdriver.type=chrome -Dwebdriver.chrome.driver=E:/Workspace/chromedriver.exe'
          }
      }
    }
}