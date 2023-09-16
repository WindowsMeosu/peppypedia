<?php
session_start();
$debugcheck= "check passed";
$checkif404= "404 check...";
$if404chpassed= "passed";
$if404chfailed= "unfortunately failed";

?>
<b><i><? echo $debugcheck?></b></i>
<b><i><? echo $checkif404 $if404chpassed?></b></i>
<?
session_destroy();
<?php ?>