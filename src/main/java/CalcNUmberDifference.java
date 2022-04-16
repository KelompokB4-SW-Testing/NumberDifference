package main.java;

import java.util.List;

public class CalcNUmberDifference {

	// fungsi mengembalikan nilai selisih antara nilai terbesar dan terkecil
	public int numberDiffirenceProcess(List<Integer> deretBil) {
		int difference = 0;
		int min;
                int max; 
                int idxDeretBil;
		
		min = deretBil.get(0);
		max = deretBil.get(0);

		for (idxDeretBil = 1; idxDeretBil < deretBil.size(); idxDeretBil++) { 
			if (deretBil.get(idxDeretBil) < min)
				min = deretBil.get(idxDeretBil);
			if (deretBil.get(idxDeretBil) > max)
				max = deretBil.get(idxDeretBil);
		}
		
		difference = max - min;
		
		return difference;
	}
	
	// fungsi mengembalikan jenis grup berdasarkan nilai selisih nilai terbesar dan terkecil
	// kelompok “Small Difference” untuk selisih berada di antara 1-10 
	// kelompok “Medium Difference” untuk selisih berada di antara 11-50
	// kelompok “Large Difference” untuk selisih berada di antara > 50
	// kelompok “There’s no difference” untuk selisih 0 atau tidak memiliki selisih, yaitu nilai terkecil = terbesar
	public String groupingDifference(int diff) {
		String message;
		int group;
		
		message = "Difference : " + diff; 
		if(diff>50) {
			group = 3;
                //Bug Fixing
                // Mengubah "diff<50" menjadi "diff<=50"
                //Giusty Fadh Wiranapoera
		}else if(diff>=11 && diff<=50) { 
			group = 2;
                // Bug Fixing
                // Mengubah "diff<10" menjadi "diff<=10"
                // Mohammad Rizky Maulidhan
		}else if(diff>=1 && diff<=10){ 
			group = 1;
		}else {
			group = 0;
		}
		
		if(group>0){
			message = message + "\nGroup " + group + ", ";
		}else{
                // Bug Fixing
                // Menambahkan tanda koma setelah kata Non Group
			message = message + "\nNon Group, ";
		}
		
                // Bug Fixing
                // Menambahkan statement "break;" pada case 1
                // Mohammad Rizky Maulidhan
                
		switch(group) {
			case 1: message = message + "Small Difference"; break;
			case 2: message = message + "Medium Difference"; break;
                        //Bug Fixing
                        //typo "Large Differece", menjadi "Large Difference"
                        //Giusty Fadh Wiranapoera
			case 3: message = message + "Large Difference"; break;
                         // Bug Fixing
                         // Mengubah Case 4 menjadi case 0
                         // Andika Yudha Riyanto
			case 0: message = message + "There's no difference"; break;
                        
                        default: break;
		}
		
		return message;
	}
	
	// function validasi nilai N sesuai dengan range valid, yaitu N berada pada range 1-10
	// mengembalikan true, jika nilai N sesuai dengan range
	// // sebaliknya mengembalikan false
        
        // Bug Fixing
        // Mengubah Operator OR mennjadi Operator AND pada kondisi if
        // Andika Yudha Riyanto
	public boolean validateRangeInputMaxDeret(int nBil) {
		if(nBil>=1 && nBil<=10) { 
			return true;
		}else {
			return false;
		}
	}
}
