@echo off
.echo
echo FIX FULLSCREEN WINKAWKS
by @thegrapevine youtube


REG ADD "HKCU\SOFTWARE\Microsoft\Windows NT\CurrentVersion\AppCompatFlags\Layers" /v C:\Emulador\WinKawaks.exe /t REG_SZ /d $ DWM8And16BitMitigation Layer_ForceDirectDrawEmulation 