package diamond;
public class Diamond {
public static void main(String[] args) {
String[][] letter = {
{" ", " ", "*", " ", " "},
{" ", "*", " ", "*", " "},
{"*", "^", " ", "^", "*"},
{"*", " ", "O", " ", "*"},
{" ", "*", " ", "*", " "},
{" ", " ", "*", " ", " "} };



for (String[] row : letter) {
for (String ch : row) {
System.out.print(ch + " ");
}
System.out.println();
   }
  }
}
