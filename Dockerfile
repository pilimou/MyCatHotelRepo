# 第一階段：編譯
FROM maven:4.0.0-rc-5-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B
COPY src ./src
RUN mvn clean package -DskipTests

# 第二階段：執行
FROM eclipse-temurin:17-jre
WORKDIR /app
# 根據專案 pom.xml，編譯出的 jar 會在 target 資料夾下
EXPOSE 8080
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]