pipeline{
    agent any
    stages {
        stage('maven install') {
            steps {
withMaven(globalMavenSettingsConfig: '', jdk: '', maven: 'Maven1', mavenSettingsConfig: '', traceability: true) {
    bat 'maven clean install'
}
            }
        }

    }
}
