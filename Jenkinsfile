pipeline {
	agent any
	environment{
		NEW_VERSION = '1.2.0'
	}
	tools{
		maven 'M22'
	}
	stages {
		stage('Build') { 
			steps { 
				echo 'Building the application....'
				
				sh 'mv-n clean install'

				echo "deploying ....."
				sh 'mvn spring-boot:run'
				echo "deploying .....22222"

			}
		}
		stage('Test'){
			steps {
				echo 'Testing the application....'
			}
		}
		stage('Deploy') {
			steps {
				echo 'Deploying the application....'
			}
		}
	}
}
