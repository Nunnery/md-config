node {
    def mvnHome
    stage('Checkout from SCM') {
        git branch: env.BRANCH_NAME, url: 'git@github.com:Nunnery/md-config.git'
    }
    stage('Setup') {
        mvnHome = tool 'Maven 3.3.9'
        sh 'chmod +x ./bin/setup && ./bin/setup'
    }
    stage('Clean Workspace') {
        sh "${mvnHome}/bin/mvn -B clean"
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