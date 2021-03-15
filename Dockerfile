FROM openjdk:11.0.10
EXPOSE 8081
RUN mkdir target
ADD /target/mini_calculator-jar-with-dependencies.jar mini_calculator-jar-with-dependencies.jar
ENTRYPOINT ["java","-jar","mini_calculator-jar-with-dependencies.jar"]
