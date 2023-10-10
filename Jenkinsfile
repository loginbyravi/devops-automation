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
					echo "building version ${NEW_VERSION}"
					sh 'mvn clean install'
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
