<!DOCTYPE html>
<html>
<head></head>
<body>
<?php
// Database connection parameters.
$servername = "localhost";
$username = "docs";
$password = "";
$dbname = "SampleDB";
$user=$_POST['uname'];  
$pass=$_POST['psw']; 
#echo $user.$pass; 

$con=mysql_connect('localhost','docs','') or (mysql_error());  
    mysql_select_db('SampleDB') or die("cannot select DB");
#echo $con; 
$query=mysql_query("SELECT * FROM sampletable WHERE username='".$user."' AND password='".$pass."'");  
    $numrows=mysql_num_rows($query);  
#echo $numrows;
if($numrows!=0)  
    {  
    while($row=mysql_fetch_assoc($query))  
    {  
        $dbusername=$row['username'];  
        $dbpassword=$row['password']; 
    }
    #echo $dbusername.$dbpassword;
    if($user == $dbusername && $pass == $dbpassword)  
    {  
        echo "Valid User .. Successfully Logged In !!";  
    } else {  
        echo "Invalid Username or password!";  
    } 
    }
?>
</body>
</html>
