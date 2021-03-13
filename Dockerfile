FROM java:8
EXPOSE 8081
RUN mkdir target
ADD /target/mini_Calculator.jar mini_Calculator.jar
ENTRYPOINT ["java","-jar","mini_Calculator.jar"]