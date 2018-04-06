#!groovy

node('master') {
    stage('Checkout') {
        checkout scm
    }
    
    stage('Run tests') {
      maven: 'Maven 3' {
          dir('Test') {
            sh 'mvn clean install test -Dwebdriver.type=chrome -Dwebdriver.chrome.driver=E:/Workspace/chromedriver.exe'
          }
      }
    }
}