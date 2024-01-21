### to compile

```bash
javac -sourcepath . -d out src/main/Main.java src/calculator/Calculator.j
ava
java -classpath ./out main.Main                
```

### to run compiled files

```docker
java -classpath ./out main.Main
```

output:

```docker
5.0
35.0
5.0
1.0
```

### to create documentation

```bash
javadoc -d ./doc -sourcepath ./src -cp ./out -subpackages main
```

# Docker

## dockerfile

```docker
FROM openjdk:latest

RUN mkdir /app

COPY src /app/src

WORKDIR /app

RUN javac -sourcepath . -d out src/main/Main.java src/calculator/Calculator.java

CMD java -cp out/ main.Main
```

### to build

```bash
docker build -t gb-java-hw1:1.0 .
```

### to run

```bash
docker run gb-java-hw1:1.0
```