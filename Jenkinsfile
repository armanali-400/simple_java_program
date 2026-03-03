pipeline{
    agent any
    stages{
        stage("compile"){
            steps{
	    	javac demo.java
		if $?==0;
		then
                	echo "compilation successfull"
            }
        }
        stage("execute"){
            steps{
	    	java demo
		 if $?==0;
                then
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
