<form action=<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?> method="post">

  $Username = $_POST['Username'];
  $Password =mysqli_real_escape_string( $_POST['Password']);
