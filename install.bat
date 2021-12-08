echo 'current workspace:'
dir

call ./mvnw.cmd clean package -DskipTests
echo build success

call ./mvnw.cmd -version
call ./mvnw.cmd install:install-file -Dfile=target/shared-plugin-interfaces-4.1.13.jar -DgroupId=com.terwergreen -DartifactId=shared-plugin-interfaces -Dversion=4.1.13 -Dpackaging=jar
call ./mvnw.cmd install:install-file -Dfile=pom-parent.xml -DgroupId=com.terwergreen -DartifactId=shared-plugin-interfaces -Dversion=4.1.13 -Dpackaging=pom
echo finish
