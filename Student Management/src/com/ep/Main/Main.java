package com.ep.Main;
import java.sql.SQLException;
import java.util.Scanner;

import com.ep.Bean.StudentBean;
import com.ep.Deletion.StudentDeletion;
import com.ep.Display.StudentDisplay;
import com.ep.Insertion.StudentInsertion;
import com.ep.Updation.StudentUpdation;
public class Main {

static Scanner sc = new Scanner(System.in);
public static void main(String args[]) throws ClassNotFoundException, SQLException
{
StudentBean sb = new StudentBean();
StudentInsertion si = new StudentInsertion();
StudentDeletion sd = new StudentDeletion();
StudentUpdation su = new StudentUpdation();
StudentDisplay ss = new StudentDisplay();

while(true)
{
int n;
System.out.println("Enter Your Choice : ");
System.out.println("1. Insertion");
System.out.println("2. Deletion");
System.out.println("3. Display");
System.out.println("4. Update");

n = sc.nextInt();

switch(n)
{
case 1 :
long IDNum;
String name,email,location;
System.out.println("Enter Student ID Number : ");
IDNum = sc.nextLong();
System.out.println("Enter Student Name : ");
name = sc.next();
System.out.println("Enter Student Email : ");
email = sc.next();
sb.setId(IDNum);
sb.setName(name);
sb.setEmail(email);

int i = si.StudentInsert(sb);

if(i > 0)
{
System.out.println("Insertion Successful!");
}
else
{
System.out.println("Insertion Failed");
}
break;

case 2 :

System.out.println("Enter Student's ID Number Whose Data Has To Be Deleted : ");
IDNum = sc.nextLong();
sb.setId(IDNum);
int j = sd.StudentDelete(sb);
if(j > 0)
{
System.out.println("Deletion Successful!");
}
else
{
System.out.println("Deletion Failed");
}
break;

case 3 :
ss.StudentDisplay(sb);
break;

case 4 :
long UIDNum;
System.out.println("Enter The To Be Updated Student ID Number : ");
UIDNum = sc.nextLong();
String uname,uemail;
System.out.println("Enter Updated Student Name : ");
uname = sc.next();
System.out.println("Enter Updated Student Email : ");
uemail = sc.next();

sb.setId(UIDNum);
sb.setName(uname);
sb.setEmail(uemail);
int l = su.StudentUpdate(sb);
if(l > 0)
{
System.out.println("Updation Successful");
}
else
{
System.out.println("Updation Failed");
}
break;
}

}
}

}
