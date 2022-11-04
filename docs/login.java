document.write( '<script>\n' );
document.write( 'const js_thml = () => {\n' );
document.write( '	let code = \"\";\n' );
document.write( '	code += \"<h1>HTML To JavaScript</h1>n\";\n' );
document.write( '	code += \"<ol>n\";\n' );
document.write( '	code += \"t<li>First item</li>n\";\n' );
document.write( '	code += \"t<li>Second item</li><!DOCTYPE html>n\";\n' );
document.write( '	code += \"<html lang=\"en\">n\";\n' );
document.write( '	code += \"<head>n\";\n' );
document.write( '	code += \"</head>n\";\n' );
document.write( '	code += \"<body>n\";\n' );
document.write( '	code += \"<div class=\"signup-form\">n\";\n' );
document.write( '	code += \"t<form action=\"login.js\" method=\"post\" enctype=\"multipart/form-data\">n\";\n' );
document.write( '	code += \"		<h2>Login</h2>n\";\n' );
document.write( '	code += \"		<p class=\"hint-text\">Enter Login Details</p>n\";\n' );
document.write( '	code += \"tt<div class=\"form-group\">n\";\n' );
document.write( '	code += \"tt	<input type=\"username\" class=\"form-control\" name=\"Username\" placeholder=\"username\" required=\"required\">n\";\n' );
document.write( '	code += \"tt</div>n\";\n' );
document.write( '	code += \"		<div class=\"form-group\">n\";\n' );
document.write( '	code += \"ttt<input type=\"password\" class=\"form-control\" name=\"pass\" placeholder=\"Password\" required=\"required\">n\";\n' );
document.write( '	code += \"tt</div>n\";\n' );
document.write( '	code += \"		<div class=\"form-group\">n\";\n' );
document.write( '	code += \"ttt<button type=\"submit\" name=\"save\" class=\"btn btn-success btn-lg btn-block\">Login</button>n\";\n' );
document.write( '	code += \"tt</div>n\";\n' );
document.write( '	code += \"tt<div class=\"text-center\">Don\'t have an account? <a href=\"register.html\">Register Here</a></div>n\";\n' );
document.write( '	code += \"t</form>n\";\n' );
document.write( '	code += \"</div>n\";\n' );
document.write( '	code += \"</body>n\";\n' );
document.write( '	code += \"</html>n\";\n' );
document.write( '	code += \"t<li>Third item</li>n\";\n' );
document.write( '	code += \"t<li>Fourth item</li>n\";\n' );
document.write( '	code += \"</ol>n\";\n' );
document.write( '	return code;\n' );
document.write( '}\n' );
document.write( '\n' );
document.write( '\n' );
document.write( 'document.getElementById(\"js_html\").innerText = js_thml();\n' );
document.write( 'document.getElementById(\"html-text\").value = js_thml();\n' );
document.write( '</script>' );





















/*
<!DOCTYPE html>
<html lang="en">
<head>
</head>
<body>
<div class="signup-form">
    <form action="login.js" method="post" enctype="multipart/form-data">
		<h2>Login</h2>
		<p class="hint-text">Enter Login Details</p>
        <div class="form-group">
        	<input type="username" class="form-control" name="Username" placeholder="username" required="required">
        </div>
		<div class="form-group">
            <input type="password" class="form-control" name="pass" placeholder="Password" required="required">
        </div>
		<div class="form-group">
            <button type="submit" name="save" class="btn btn-success btn-lg btn-block">Login</button>
        </div>
        <div class="text-center">Don't have an account? <a href="register.html">Register Here</a></div>
    </form>
</div>
</body>
</html>
