import java.util.Scanner;

public class PersonalDataForm{

   public static void main(String[] args) {
        
    //variable declaration
    String lastName, firstName, middleName;
    String birthDate, birthPlace;
    char gender;
    long mobileNumber;
    String emailAddress;
    boolean isSingle;
    Scanner s = new Scanner(System.in);

    System.out.println("Please fill-up the form...");
    System.out.println("===========Personal Information===========");
    System.out.format("Last Name  : ");
    lastName= s.nextLine();
    System.out.format("Fisrt Name : ");
    firstName= s.nextLine();
    System.out.format("Middle Name  : ");
    middleName= s.nextLine();

    System.out.format("Gender (M for male, F for Female, X for LGBTQ) : ");
    gender = s.nextLine().charAt(0);
    System.out.format("Are you single? (Y for Yes, N for No) :  "); 
    char status = s.next().charAt(0);
    if (status == 'Y' || status == 'y') {
        isSingle = true;
    } else{
        isSingle = false;
    }

    System.out.println("==========Birth Information=========");
    System.out.format("Birth Date (MM/dd/yyyy) : ");
    birthDate = s.next();
    System.out.format("Birth Place  : ");
    birthPlace = s.next();

    System.out.println("========Contact Information======");
    System.out.format("Mobile Number (Omit +63 or 0)  : ");
    mobileNumber = s.nextLong();
    System.out.format("Email Address : ");
    emailAddress = s.next() + s.nextLine();

   

        System.out.println("========Summary Profile Information===========");
    System.out.println("Full Name : " + firstName + " " + lastName);
    System.out.println("Gender : " + gender);
    System.out.println("Is Single? : "  + isSingle);
    System.out.println("Birth Date : " + birthDate);
    System.out.println("Mobile Number : " + mobileNumber);
    System.out.println("Email Address : " + emailAddress);
    




   
      }
   }

