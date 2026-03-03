pipeline{
    agent any
    stages{
        stage("compile"){
            steps{
	    	javac demo.java
            echo "compilation successfull"
            }
        }
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
