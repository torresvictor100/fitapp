FROM gradle:8.10.2-jdk17 AS build

WORKDIR /app

COPY . .

RUN ./gradlew build --no-daemon

FROM debian:bullseye-slim

RUN apt update \
    && apt install -y openjdk-17-jre

WORKDIR /app

COPY --from=build /app/build/libs/br.com.fitapp-0.0.1.jar /app/app.jar

COPY wait-for-it.sh /usr/local/bin/wait-for-it.sh
RUN chmod +x /usr/local/bin/wait-for-it.sh

EXPOSE 8080

CMD ["wait-for-it.sh", "mysql-db:3306", "--", "java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005", "-jar", "app.jar"]
