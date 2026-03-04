pipeline{
    agent any
    stages{
        stage("execute"){
            steps{
	    	java demo
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
