import java.security.SecureRandom;
public class passwordgenerator 
{
public static void main(String[] args) 
{
int desiredLength=getUserInput();
String randomPassword=generateRandomPassword(desiredLength);
System.out.println("Random Password:"+randomPassword);
}
private static int getUserInput() 
{
return 10; // Replace with actual user input
}
private static String generateRandomPassword(int length) {
String lowercase="abcdefghijklmnopqrstuvwxyz";
String uppercase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
String digits="0123456789";
String specialChars="!@#$%^&*()_+";
String allChars=lowercase + uppercase + digits + specialChars;
SecureRandom random=new SecureRandom();
StringBuilder password = new StringBuilder();
password.append(lowercase.charAt(random.nextInt(lowercase.length())));
password.append(lowercase.charAt(random.nextInt(lowercase.length())));
password.append(uppercase.charAt(random.nextInt(uppercase.length())));
password.append(uppercase.charAt(random.nextInt(uppercase.length())));
password.append(digits.charAt(random.nextInt(digits.length())));
password.append(digits.charAt(random.nextInt(digits.length())));
password.append(specialChars.charAt(random.nextInt(specialChars.length())));
password.append(specialChars.charAt(random.nextInt(specialChars.length())));
for (int i=password.length();i<length;i++) 
{
password.append(allChars.charAt(random.nextInt(allChars.length())));
}
return password.toString();
}
}
