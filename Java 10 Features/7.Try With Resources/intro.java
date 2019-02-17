+++++++++++++++++++++++++++++
* TRY With Resources+
*****************************

In 1.8 you cant not use created Resource reference inside try Block
Example:
	
	FileWritter fw = new FileWritter("abc.txt");
	FileReader fr = new FileReader("input.txt");

	1.	try(fw, fr){
		//not allowed 
		}
	2.Solution in 1.8

		try(FileWritter fw = new FileWritter("abc.txt"); FileReader fr = new FileReader("input.txt")){
			//Allowed Successfull
		}

		OR

		try(FileWritter fw2 = fw; FileReader fr2 = fr ){
			//Allowed Successfull
		}

but in Java 1.9 we can 
	
	try(fw, fr){
		//Allowed Successfullrchrome
		 
	}