pipeline{
    agent any
    stages{
        stage("execute"){
            steps{
	    	bat 'java demo.java'
            echo "test successfull without any error"
            }
        }
        stage("congrats"){
            steps{
                echo "congratulation, job done!"
            }
        }
    }
}
