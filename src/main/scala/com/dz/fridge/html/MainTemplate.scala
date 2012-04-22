package com.dz.fridge.html

import scala.xml.NodeSeq

object MainTemplate {

    def decorate(body: NodeSeq): NodeSeq =
    	<html>
    		<head>
    			<title>Fridge</title>
    		</head>
    		<body>
    			{body}
    		</body>
    	</html>
    
}