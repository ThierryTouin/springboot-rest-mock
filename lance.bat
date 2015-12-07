set JAVA_HOME=C:\Program Files\Java\jdk1.7.0_79
echo %JAVA_HOME%

set MAVEN_HOME=C:\Soft\apache-maven-3.0.5
echo %MAVEN_HOME%

set PATH=%PATH%;%MAVEN_HOME%\bin;%JAVA_HOME%\bin
echo %PATH%

mvn clean tomcat:run 


