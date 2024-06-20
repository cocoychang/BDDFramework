pipeline{
    agent any
    stages {
        stage('maven install') {
            steps {
withMaven(globalMavenSettingsConfig: '', jdk: '', maven: 'Maven1', mavenSettingsConfig: '', traceability: true) {
    sh 'maven clean install'
}
            }
        }

    }
}
