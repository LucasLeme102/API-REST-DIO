# Imagem base com JDK 21 Alpine (leve)
FROM eclipse-temurin:21-jdk-alpine

# Diretório de trabalho dentro do container
WORKDIR /app

# Copia o mvnw e a pasta .mvn (wrapper do Maven)
COPY mvnw .
COPY .mvn .mvn

# Dá permissão para o mvnw rodar
RUN chmod +x mvnw

# Copia o pom.xml para instalar dependências primeiro (cache Docker)
COPY pom.xml .

# Baixa as dependências para cache
RUN ./mvnw dependency:resolve

# Copia o código fonte completo
COPY src ./src

# Compila e empacota a aplicação (sem rodar testes)
RUN ./mvnw clean package -DskipTests

# Expõe a porta padrão do Spring Boot
EXPOSE 8080

# Comando para rodar a aplicação empacotada
CMD ["java", "-jar", "target/apiDio-0.0.1-SNAPSHOT.jar"]
