def call() {
  pipeline {
    agent any
    stages {
      stage('test Stage') {
        steps {
          sh 'pwd;ls/'
        }
      }
    }
  }
}
