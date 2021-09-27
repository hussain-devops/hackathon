docker build --build-arg "JAR_FILE1=target/hackathon-0.0.1-SNAPSHOT.jar" --build-arg "JAR_FILE2=target/hackathon-0.0.1-SNAPSHOT.jar.original" -t hackathon:first .

docker run --name sillywoof --rm -p 8888:8888 sillywoof:first
