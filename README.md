docker build --build-arg "JAR_FILE1=target/hackathon-0.0.1-SNAPSHOT.jar" -t hackathon:first .

docker run --name hackathon --rm -p 8888:8888 hackathon:first

docker build --build-arg "JAR_FILE1=target/hackathon-0.0.1-SNAPSHOT.jar" -t hackathon:first .
docker run --name hackathon --rm -p 8888:8888 hackathon:first

docker tag hackathon:1 gcr.io/team2-326911/hackathon
gcloud auth login
gcloud auth configure-docker
docker push gcr.io/team2-326911/hackathon


open google cloud shell
kubectl set image deployment/sillywoof sillywoof=gcr.io/sillywoof/sillywoof:3

rollback
kubectl rollout undo deployment/sillywoof
