FROM java:11
EXPOSE 8081
RUN mkdir target
ADD /target/mini_calculator.jar mini_calculator.jar
ENTRYPOINT ["java","-jar","mini_calculator.jar"]