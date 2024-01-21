FROM openjdk:latest

RUN mkdir /app

COPY src /app/src

WORKDIR /app

RUN javac -sourcepath . -d out src/main/Main.java src/calculator/Calculator.java

CMD java -cp out/ main.Main