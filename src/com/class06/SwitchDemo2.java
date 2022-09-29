package com.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // matching cases must be of the same data type as a variable in switch
        // no duplicated case in switch

        char choice='Y';
        String answer;

        switch(choice) {
        case 'Y':
            answer="Yes";
            break;
        case 'N':
            answer="No";
            break;
        case 'M':
            answer="Maybe";
            break;
        default:
            answer="Unkown";
            break;
        }
    System.out.println(answer);

    }
	}


