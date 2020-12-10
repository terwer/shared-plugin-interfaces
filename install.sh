echo 'current workspace:'
echo $WORKSPACE
cd $WORKSPACE
chmod +x mvnw
#  构建jar包
./mvnw clean package -DskipTests
# 安装到本地maven库
./mvnw install:install-file -Dfile=target/shared-plugin-interfaces-4.1.13.jar -DgroupId=com.terwergreen -DartifactId=shared-plugin-interfaces -Dversion=4.1.13 -Dpackaging=jar
./mvnw install:install-file -Dfile=pom-parent.xml -DgroupId=com.terwergreen -DartifactId=shared-plugin-interfaces -Dversion=4.1.13 -Dpackaging=pom

