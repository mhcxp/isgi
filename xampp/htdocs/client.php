<HTML>
<HEAD>
<TITLE>Client</TITLE>
</HEAD>
<?php
Ice_loadProfile("printer");
try {
	$p = $ICE->stringToProxy("SimplePrinter:default -p 10000");
	$printer = $p->ice_checkedCast("::Demo::Printer");
	$printer->printString("hello");
} catch(Ice_LocalException $ex) {
	//process the Exception
	echo "<pre>\n";
	print_r($ex);
	echo "</pre>\n";
}
?>
</HTML>
