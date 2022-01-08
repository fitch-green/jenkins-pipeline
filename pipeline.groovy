pipeline {
  agent any
  stages {
    stage('test pipeline') {
      steps {
        sh 'pwd;ls /'
      }
    }
  }
}
