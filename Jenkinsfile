#!groovy

node('master') {
    stage('Checkout') {
        checkout scm
    }
    stage('Run tests') {
      steps {
                build('AppTest')
                build('AppTest2')
            }
      }
    }
}