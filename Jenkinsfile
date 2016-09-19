node {
    def mvnHome
    stage('Clean Workspace') {
        deleteDir()
    }
    stage('Checkout from SCM') {
        git branch: env.BRANCH_NAME, url: 'https://github.com/Nunnery/md-config.git'
    }
    stage('Setup') {
        mvnHome = tool 'Maven 3.3.9'
        sh 'chmod +x ./bin/setup && ./bin/setup'
    }
    stage('Test') {
        sh "${mvnHome}/bin/mvn -B test"
    }
    stage('Deployment') {
        sh 'chmod +x ./bin/deploy && ./bin/deploy development'
    }
    stage('Archive') {
        archiveArtifacts allowEmptyArchive: true, artifacts: 'target/md-config.jar', fingerprint: true, onlyIfSuccessful: true
    }
}