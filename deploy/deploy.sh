cd ../
mvn package -Dmaven.test.skip=true
cd target
scp ROOT.war root@192.168.73.179:/usr/local/src/tomcat/tomcat8/webapps/
scp -r /e/pic/ root@192.168.73.179:/usr/local/src/tomcat/tomcat8/webapps/ROOT/pic/
