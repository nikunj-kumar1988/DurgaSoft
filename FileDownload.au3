#include <InetConstants.au3>
#include <MsgBoxConstants.au3>

Example()

Func Example()

	Local $sFilePath = "C:\Music Assignment"
	Local $byteSize = InetGet("http://xyz.zip",$sFilePath,$INET_FORCERELOAD)
	
EndFunc